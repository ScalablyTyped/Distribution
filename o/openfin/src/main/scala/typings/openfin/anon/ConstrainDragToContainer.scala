package typings.openfin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConstrainDragToContainer extends js.Object {
  var constrainDragToContainer: js.UndefOr[Boolean] = js.native
  var popoutWholeStack: js.UndefOr[Boolean] = js.native
  var showCloseIcon: js.UndefOr[Boolean] = js.native
  var showMaximiseIcon: js.UndefOr[Boolean] = js.native
  var showPopoutIcon: js.UndefOr[Boolean] = js.native
}

object ConstrainDragToContainer {
  @scala.inline
  def apply(): ConstrainDragToContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstrainDragToContainer]
  }
  @scala.inline
  implicit class ConstrainDragToContainerOps[Self <: ConstrainDragToContainer] (val x: Self) extends AnyVal {
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
    def setConstrainDragToContainer(value: Boolean): Self = this.set("constrainDragToContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstrainDragToContainer: Self = this.set("constrainDragToContainer", js.undefined)
    @scala.inline
    def setPopoutWholeStack(value: Boolean): Self = this.set("popoutWholeStack", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopoutWholeStack: Self = this.set("popoutWholeStack", js.undefined)
    @scala.inline
    def setShowCloseIcon(value: Boolean): Self = this.set("showCloseIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCloseIcon: Self = this.set("showCloseIcon", js.undefined)
    @scala.inline
    def setShowMaximiseIcon(value: Boolean): Self = this.set("showMaximiseIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowMaximiseIcon: Self = this.set("showMaximiseIcon", js.undefined)
    @scala.inline
    def setShowPopoutIcon(value: Boolean): Self = this.set("showPopoutIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowPopoutIcon: Self = this.set("showPopoutIcon", js.undefined)
  }
  
}

