package typings.ol.overlayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanIntoViewOptions extends js.Object {
  var animation: js.UndefOr[PanOptions] = js.undefined
  var margin: js.UndefOr[Double] = js.undefined
}

object PanIntoViewOptions {
  @scala.inline
  def apply(animation: PanOptions = null, margin: Int | Double = null): PanIntoViewOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanIntoViewOptions]
  }
}

