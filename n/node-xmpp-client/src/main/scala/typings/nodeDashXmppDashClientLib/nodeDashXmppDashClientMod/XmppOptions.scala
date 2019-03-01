package typings
package nodeDashXmppDashClientLib.nodeDashXmppDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmppOptions extends js.Object {
   // Dictionary (optional) - TLS or SSL key and certificate credentials
  var actAs: js.UndefOr[java.lang.String] = js.undefined
  var autostart: js.UndefOr[scala.Boolean] = js.undefined
   // Preferred SASL mechanism to use
  var bosh: js.UndefOr[Bosh] = js.undefined
   // connect to the legacy SSL port, requires at least the host to be specified
  var credentials: js.UndefOr[js.Any] = js.undefined
   // if admin user act on behalf of another user (just user)
  var disallowTLS: js.UndefOr[scala.Boolean] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var jid: java.lang.String
   // register account before authentication
  var legacySSL: js.UndefOr[scala.Boolean] = js.undefined
  var password: java.lang.String
  var port: js.UndefOr[scala.Double] = js.undefined
   // prevent upgrading the connection to a secure one via TLS
  var preferred: js.UndefOr[java.lang.String] = js.undefined
  var reconnect: js.UndefOr[scala.Boolean] = js.undefined
   // if we start connecting to a given port
  var register: js.UndefOr[scala.Boolean] = js.undefined
}

object XmppOptions {
  @scala.inline
  def apply(
    jid: java.lang.String,
    password: java.lang.String,
    actAs: java.lang.String = null,
    autostart: js.UndefOr[scala.Boolean] = js.undefined,
    bosh: Bosh = null,
    credentials: js.Any = null,
    disallowTLS: js.UndefOr[scala.Boolean] = js.undefined,
    host: java.lang.String = null,
    legacySSL: js.UndefOr[scala.Boolean] = js.undefined,
    port: scala.Int | scala.Double = null,
    preferred: java.lang.String = null,
    reconnect: js.UndefOr[scala.Boolean] = js.undefined,
    register: js.UndefOr[scala.Boolean] = js.undefined
  ): XmppOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("jid")(jid)
    __obj.updateDynamic("password")(password)
    if (actAs != null) __obj.updateDynamic("actAs")(actAs)
    if (!js.isUndefined(autostart)) __obj.updateDynamic("autostart")(autostart)
    if (bosh != null) __obj.updateDynamic("bosh")(bosh)
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    if (!js.isUndefined(disallowTLS)) __obj.updateDynamic("disallowTLS")(disallowTLS)
    if (host != null) __obj.updateDynamic("host")(host)
    if (!js.isUndefined(legacySSL)) __obj.updateDynamic("legacySSL")(legacySSL)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (preferred != null) __obj.updateDynamic("preferred")(preferred)
    if (!js.isUndefined(reconnect)) __obj.updateDynamic("reconnect")(reconnect)
    if (!js.isUndefined(register)) __obj.updateDynamic("register")(register)
    __obj.asInstanceOf[XmppOptions]
  }
}

