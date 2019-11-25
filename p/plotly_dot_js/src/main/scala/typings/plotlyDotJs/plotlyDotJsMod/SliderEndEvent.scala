package typings.plotlyDotJs.plotlyDotJsMod

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
    val __obj = js.Dynamic.literal(slider = slider.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SliderEndEvent]
  }
}

