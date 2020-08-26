package typings.officeUiFabricReact.sliderBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISliderState extends js.Object {
  var renderedValue: js.UndefOr[Double] = js.native
  var value: js.UndefOr[Double] = js.native
}

object ISliderState {
  @scala.inline
  def apply(): ISliderState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISliderState]
  }
  @scala.inline
  implicit class ISliderStateOps[Self <: ISliderState] (val x: Self) extends AnyVal {
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
    def setRenderedValue(value: Double): Self = this.set("renderedValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderedValue: Self = this.set("renderedValue", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

