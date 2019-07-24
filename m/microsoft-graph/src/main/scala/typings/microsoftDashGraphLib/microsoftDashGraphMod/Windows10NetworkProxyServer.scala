package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Windows10NetworkProxyServer extends js.Object {
  // Address to the proxy server. Specify an address in the format [':']
  var address: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Addresses that should not use the proxy server. The system will not use the proxy server for addresses beginning with
    * what is specified in this node.
    */
  var exceptions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  // Specifies whether the proxy server should be used for local (intranet) addresses.
  var useForLocalAddresses: js.UndefOr[scala.Boolean] = js.undefined
}

object Windows10NetworkProxyServer {
  @scala.inline
  def apply(
    address: java.lang.String = null,
    exceptions: js.Array[java.lang.String] = null,
    useForLocalAddresses: js.UndefOr[scala.Boolean] = js.undefined
  ): Windows10NetworkProxyServer = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (exceptions != null) __obj.updateDynamic("exceptions")(exceptions)
    if (!js.isUndefined(useForLocalAddresses)) __obj.updateDynamic("useForLocalAddresses")(useForLocalAddresses)
    __obj.asInstanceOf[Windows10NetworkProxyServer]
  }
}

