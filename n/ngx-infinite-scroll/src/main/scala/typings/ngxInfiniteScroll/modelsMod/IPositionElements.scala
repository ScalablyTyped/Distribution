package typings.ngxInfiniteScroll.modelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPositionElements extends js.Object {
  var axis: js.Any = js.native
  var windowElement: ContainerRef = js.native
}

object IPositionElements {
  @scala.inline
  def apply(axis: js.Any, windowElement: ContainerRef): IPositionElements = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], windowElement = windowElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPositionElements]
  }
  @scala.inline
  implicit class IPositionElementsOps[Self <: IPositionElements] (val x: Self) extends AnyVal {
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
    def setAxis(value: js.Any): Self = this.set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindowElement(value: ContainerRef): Self = this.set("windowElement", value.asInstanceOf[js.Any])
  }
  
}

