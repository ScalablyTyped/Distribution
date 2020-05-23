package typings.openseadragon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxImageCacheCount extends js.Object {
  var maxImageCacheCount: js.UndefOr[Double] = js.undefined
}

object MaxImageCacheCount {
  @scala.inline
  def apply(maxImageCacheCount: js.UndefOr[Double] = js.undefined): MaxImageCacheCount = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxImageCacheCount)) __obj.updateDynamic("maxImageCacheCount")(maxImageCacheCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxImageCacheCount]
  }
}

