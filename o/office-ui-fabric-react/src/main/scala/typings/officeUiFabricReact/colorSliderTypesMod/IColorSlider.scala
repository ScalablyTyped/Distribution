package typings.officeUiFabricReact.colorSliderTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColorSlider extends js.Object {
  /** Current value of the slider. */
  var value: Double
}

object IColorSlider {
  @scala.inline
  def apply(value: Double): IColorSlider = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IColorSlider]
  }
}

