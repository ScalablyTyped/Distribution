package typings.plottable.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpaceRequest extends js.Object {
  var minHeight: Double = js.native
  var minWidth: Double = js.native
}

object SpaceRequest {
  @scala.inline
  def apply(minHeight: Double, minWidth: Double): SpaceRequest = {
    val __obj = js.Dynamic.literal(minHeight = minHeight.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpaceRequest]
  }
  @scala.inline
  implicit class SpaceRequestOps[Self <: SpaceRequest] (val x: Self) extends AnyVal {
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
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
  }
  
}

