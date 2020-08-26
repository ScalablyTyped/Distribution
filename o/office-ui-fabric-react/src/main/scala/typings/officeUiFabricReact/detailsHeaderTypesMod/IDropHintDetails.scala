package typings.officeUiFabricReact.detailsHeaderTypesMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDropHintDetails extends js.Object {
  var dropHintElementRef: HTMLElement = js.native
  var endX: Double = js.native
  var originX: Double = js.native
  var startX: Double = js.native
}

object IDropHintDetails {
  @scala.inline
  def apply(dropHintElementRef: HTMLElement, endX: Double, originX: Double, startX: Double): IDropHintDetails = {
    val __obj = js.Dynamic.literal(dropHintElementRef = dropHintElementRef.asInstanceOf[js.Any], endX = endX.asInstanceOf[js.Any], originX = originX.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDropHintDetails]
  }
  @scala.inline
  implicit class IDropHintDetailsOps[Self <: IDropHintDetails] (val x: Self) extends AnyVal {
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
    def setDropHintElementRef(value: HTMLElement): Self = this.set("dropHintElementRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndX(value: Double): Self = this.set("endX", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginX(value: Double): Self = this.set("originX", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartX(value: Double): Self = this.set("startX", value.asInstanceOf[js.Any])
  }
  
}

