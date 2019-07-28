package typings.plotlyDotJs.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderChangeEvent extends js.Object {
  var interaction: Boolean
  var previousActive: Double
  var slider: Slider
  var step: SliderStep
}

object SliderChangeEvent {
  @scala.inline
  def apply(interaction: Boolean, previousActive: Double, slider: Slider, step: SliderStep): SliderChangeEvent = {
    val __obj = js.Dynamic.literal(interaction = interaction, previousActive = previousActive, slider = slider, step = step)
  
    __obj.asInstanceOf[SliderChangeEvent]
  }
}

