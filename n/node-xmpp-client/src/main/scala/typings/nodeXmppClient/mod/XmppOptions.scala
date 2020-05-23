package typings.nodeXmppClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmppOptions extends js.Object {
   // Dictionary (optional) - TLS or SSL key and certificate credentials
  var actAs: js.UndefOr[String] = js.undefined
  var autostart: js.UndefOr[Boolean] = js.undefined
   // Preferred SASL mechanism to use
  var bosh: js.UndefOr[Bosh] = js.undefined
   // connect to the legacy SSL port, requires at least the host to be specified
  var credentials: js.UndefOr[js.Any] = js.undefined
   // if admin user act on behalf of another user (just user)
  var disallowTLS: js.UndefOr[Boolean] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var jid: String
   // register account before authentication
  var legacySSL: js.UndefOr[Boolean] = js.undefined
  var password: String
  var port: js.UndefOr[Double] = js.undefined
   // prevent upgrading the connection to a secure one via TLS
  var preferred: js.UndefOr[String] = js.undefined
  var reconnect: js.UndefOr[Boolean] = js.undefined
   // if we start connecting to a given port
  var register: js.UndefOr[Boolean] = js.undefined
}

object XmppOptions {
  @scala.inline
  def apply(
    jid: String,
    password: String,
    actAs: String = null,
    autostart: js.UndefOr[Boolean] = js.undefined,
    bosh: Bosh = null,
    credentials: js.Any = null,
    disallowTLS: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    legacySSL: js.UndefOr[Boolean] = js.undefined,
    port: js.UndefOr[Double] = js.undefined,
    preferred: String = null,
    reconnect: js.UndefOr[Boolean] = js.undefined,
    register: js.UndefOr[Boolean] = js.undefined
  ): XmppOptions = {
    val __obj = js.Dynamic.literal(jid = jid.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    if (actAs != null) __obj.updateDynamic("actAs")(actAs.asInstanceOf[js.Any])
    if (!js.isUndefined(autostart)) __obj.updateDynamic("autostart")(autostart.get.asInstanceOf[js.Any])
    if (bosh != null) __obj.updateDynamic("bosh")(bosh.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (!js.isUndefined(disallowTLS)) __obj.updateDynamic("disallowTLS")(disallowTLS.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(legacySSL)) __obj.updateDynamic("legacySSL")(legacySSL.get.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (preferred != null) __obj.updateDynamic("preferred")(preferred.asInstanceOf[js.Any])
    if (!js.isUndefined(reconnect)) __obj.updateDynamic("reconnect")(reconnect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(register)) __obj.updateDynamic("register")(register.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmppOptions]
  }
}

