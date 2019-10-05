package typings.naverDashWhale.whale.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectInfo extends js.Object {
  var includeTlsChannelId: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object ConnectInfo {
  @scala.inline
  def apply(includeTlsChannelId: js.UndefOr[Boolean] = js.undefined, name: String = null): ConnectInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeTlsChannelId)) __obj.updateDynamic("includeTlsChannelId")(includeTlsChannelId)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ConnectInfo]
  }
}

