package typings.officeUiFabricReact.panelBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPanelState extends js.Object {
  var id: js.UndefOr[String] = js.native
  var isFooterSticky: js.UndefOr[Boolean] = js.native
  var visibility: PanelVisibilityState = js.native
}

object IPanelState {
  @scala.inline
  def apply(visibility: PanelVisibilityState): IPanelState = {
    val __obj = js.Dynamic.literal(visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanelState]
  }
  @scala.inline
  implicit class IPanelStateOps[Self <: IPanelState] (val x: Self) extends AnyVal {
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
    def setVisibility(value: PanelVisibilityState): Self = this.set("visibility", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIsFooterSticky(value: Boolean): Self = this.set("isFooterSticky", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFooterSticky: Self = this.set("isFooterSticky", js.undefined)
  }
  
}

