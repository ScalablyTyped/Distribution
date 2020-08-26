package typings.ngxInfiniteScroll.modelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInfiniteScrollEvent extends js.Object {
  var currentScrollPosition: Double = js.native
}

object IInfiniteScrollEvent {
  @scala.inline
  def apply(currentScrollPosition: Double): IInfiniteScrollEvent = {
    val __obj = js.Dynamic.literal(currentScrollPosition = currentScrollPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInfiniteScrollEvent]
  }
  @scala.inline
  implicit class IInfiniteScrollEventOps[Self <: IInfiniteScrollEvent] (val x: Self) extends AnyVal {
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
    def setCurrentScrollPosition(value: Double): Self = this.set("currentScrollPosition", value.asInstanceOf[js.Any])
  }
  
}

