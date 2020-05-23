package typings.overlayscrollbars.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Initialize extends js.Object {
  var initialize: js.UndefOr[Boolean] = js.undefined
  var showNativeScrollbars: js.UndefOr[Boolean] = js.undefined
}

object Initialize {
  @scala.inline
  def apply(
    initialize: js.UndefOr[Boolean] = js.undefined,
    showNativeScrollbars: js.UndefOr[Boolean] = js.undefined
  ): Initialize = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(initialize)) __obj.updateDynamic("initialize")(initialize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showNativeScrollbars)) __obj.updateDynamic("showNativeScrollbars")(showNativeScrollbars.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Initialize]
  }
}

