package typings.plotlyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderStartEvent extends js.Object {
  var slider: Slider
}

object SliderStartEvent {
  @scala.inline
  def apply(slider: Slider): SliderStartEvent = {
    val __obj = js.Dynamic.literal(slider = slider.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SliderStartEvent]
  }
}

