package typings.openfin.windowOptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CornerRounding extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object CornerRounding {
  @scala.inline
  def apply(height: Int | Double = null, width: Int | Double = null): CornerRounding = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CornerRounding]
  }
}

