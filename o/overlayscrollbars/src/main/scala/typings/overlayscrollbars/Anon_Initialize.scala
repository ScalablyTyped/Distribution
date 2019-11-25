package typings.overlayscrollbars

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Initialize extends js.Object {
  var initialize: js.UndefOr[Boolean] = js.undefined
  var showNativeScrollbars: js.UndefOr[Boolean] = js.undefined
}

object Anon_Initialize {
  @scala.inline
  def apply(
    initialize: js.UndefOr[Boolean] = js.undefined,
    showNativeScrollbars: js.UndefOr[Boolean] = js.undefined
  ): Anon_Initialize = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(initialize)) __obj.updateDynamic("initialize")(initialize.asInstanceOf[js.Any])
    if (!js.isUndefined(showNativeScrollbars)) __obj.updateDynamic("showNativeScrollbars")(showNativeScrollbars.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Initialize]
  }
}

