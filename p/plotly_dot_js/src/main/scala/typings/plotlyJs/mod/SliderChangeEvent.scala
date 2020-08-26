package typings.plotlyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliderChangeEvent extends js.Object {
  var interaction: Boolean = js.native
  var previousActive: Double = js.native
  var slider: Slider = js.native
  var step: SliderStep = js.native
}

object SliderChangeEvent {
  @scala.inline
  def apply(interaction: Boolean, previousActive: Double, slider: Slider, step: SliderStep): SliderChangeEvent = {
    val __obj = js.Dynamic.literal(interaction = interaction.asInstanceOf[js.Any], previousActive = previousActive.asInstanceOf[js.Any], slider = slider.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderChangeEvent]
  }
  @scala.inline
  implicit class SliderChangeEventOps[Self <: SliderChangeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInteraction(value: Boolean): Self = this.set("interaction", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousActive(value: Double): Self = this.set("previousActive", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlider(value: Slider): Self = this.set("slider", value.asInstanceOf[js.Any])
    @scala.inline
    def setStep(value: SliderStep): Self = this.set("step", value.asInstanceOf[js.Any])
  }
  
}

