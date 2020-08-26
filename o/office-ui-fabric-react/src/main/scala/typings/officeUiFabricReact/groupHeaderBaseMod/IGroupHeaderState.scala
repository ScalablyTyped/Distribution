package typings.officeUiFabricReact.groupHeaderBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGroupHeaderState extends js.Object {
  var isCollapsed: Boolean = js.native
  var isLoadingVisible: Boolean = js.native
}

object IGroupHeaderState {
  @scala.inline
  def apply(isCollapsed: Boolean, isLoadingVisible: Boolean): IGroupHeaderState = {
    val __obj = js.Dynamic.literal(isCollapsed = isCollapsed.asInstanceOf[js.Any], isLoadingVisible = isLoadingVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGroupHeaderState]
  }
  @scala.inline
  implicit class IGroupHeaderStateOps[Self <: IGroupHeaderState] (val x: Self) extends AnyVal {
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
    def setIsCollapsed(value: Boolean): Self = this.set("isCollapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsLoadingVisible(value: Boolean): Self = this.set("isLoadingVisible", value.asInstanceOf[js.Any])
  }
  
}

