package typings.naverDashWhale.whale.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReloadProperties extends js.Object {
  /** Optional. Whether using any local cache. Default is false. */
  var bypassCache: js.UndefOr[Boolean] = js.undefined
}

object ReloadProperties {
  @scala.inline
  def apply(bypassCache: js.UndefOr[Boolean] = js.undefined): ReloadProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bypassCache)) __obj.updateDynamic("bypassCache")(bypassCache)
    __obj.asInstanceOf[ReloadProperties]
  }
}

