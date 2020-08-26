package typings.notyf.notyfOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INotyfPosition extends js.Object {
  var x: NotyfHorizontalPosition = js.native
  var y: NotyfVerticalPosition = js.native
}

object INotyfPosition {
  @scala.inline
  def apply(x: NotyfHorizontalPosition, y: NotyfVerticalPosition): INotyfPosition = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotyfPosition]
  }
  @scala.inline
  implicit class INotyfPositionOps[Self <: INotyfPosition] (val x: Self) extends AnyVal {
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
    def setX(value: NotyfHorizontalPosition): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: NotyfVerticalPosition): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

