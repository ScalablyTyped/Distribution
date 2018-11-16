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

