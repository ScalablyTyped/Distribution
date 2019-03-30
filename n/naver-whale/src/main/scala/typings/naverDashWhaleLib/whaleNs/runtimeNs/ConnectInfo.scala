package typings
package naverDashWhaleLib.whaleNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectInfo extends js.Object {
  var includeTlsChannelId: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object ConnectInfo {
  @scala.inline
  def apply(includeTlsChannelId: js.UndefOr[scala.Boolean] = js.undefined, name: java.lang.String = null): ConnectInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeTlsChannelId)) __obj.updateDynamic("includeTlsChannelId")(includeTlsChannelId)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ConnectInfo]
  }
}

