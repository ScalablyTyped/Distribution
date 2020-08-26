package typings.pdfmake.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasFilledElement extends js.Object {
  var color: js.UndefOr[String] = js.native
  var fillOpacity: js.UndefOr[Double] = js.native
  var linearGradient: js.UndefOr[js.Array[String]] = js.native
}

object CanvasFilledElement {
  @scala.inline
  def apply(): CanvasFilledElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasFilledElement]
  }
  @scala.inline
  implicit class CanvasFilledElementOps[Self <: CanvasFilledElement] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setFillOpacity(value: Double): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    @scala.inline
    def setLinearGradientVarargs(value: String*): Self = this.set("linearGradient", js.Array(value :_*))
    @scala.inline
    def setLinearGradient(value: js.Array[String]): Self = this.set("linearGradient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinearGradient: Self = this.set("linearGradient", js.undefined)
  }
  
}

