package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderEndEvent extends js.Object {
  var slider: Slider
  var step: SliderStep
}

object SliderEndEvent {
  @scala.inline
  def apply(slider: Slider, step: SliderStep): SliderEndEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("slider")(slider)
    __obj.updateDynamic("step")(step)
    __obj.asInstanceOf[SliderEndEvent]
  }
}

