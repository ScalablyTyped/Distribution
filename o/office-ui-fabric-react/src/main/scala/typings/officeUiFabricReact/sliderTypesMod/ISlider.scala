package typings.officeUiFabricReact.sliderTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISlider extends js.Object {
  var value: js.UndefOr[Double] = js.native
  def focus(): Unit = js.native
}

object ISlider {
  @scala.inline
  def apply(focus: () => Unit): ISlider = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
    __obj.asInstanceOf[ISlider]
  }
  @scala.inline
  implicit class ISliderOps[Self <: ISlider] (val x: Self) extends AnyVal {
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
    def setFocus(value: () => Unit): Self = this.set("focus", js.Any.fromFunction0(value))
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

