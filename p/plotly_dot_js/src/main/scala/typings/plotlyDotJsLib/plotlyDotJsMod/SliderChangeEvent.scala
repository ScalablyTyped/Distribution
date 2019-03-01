package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderChangeEvent extends js.Object {
  var interaction: scala.Boolean
  var previousActive: scala.Double
  var slider: Slider
  var step: SliderStep
}

object SliderChangeEvent {
  @scala.inline
  def apply(interaction: scala.Boolean, previousActive: scala.Double, slider: Slider, step: SliderStep): SliderChangeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("interaction")(interaction)
    __obj.updateDynamic("previousActive")(previousActive)
    __obj.updateDynamic("slider")(slider)
    __obj.updateDynamic("step")(step)
    __obj.asInstanceOf[SliderChangeEvent]
  }
}

