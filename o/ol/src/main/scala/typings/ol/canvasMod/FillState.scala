package typings.ol.canvasMod

import typings.ol.colorlikeMod.ColorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FillState extends js.Object {
  var fillStyle: ColorLike = js.native
}

object FillState {
  @scala.inline
  def apply(fillStyle: ColorLike): FillState = {
    val __obj = js.Dynamic.literal(fillStyle = fillStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillState]
  }
  @scala.inline
  implicit class FillStateOps[Self <: FillState] (val x: Self) extends AnyVal {
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
    def setFillStyle(value: ColorLike): Self = this.set("fillStyle", value.asInstanceOf[js.Any])
  }
  
}

