package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.panelBaseMod.PanelVisibilityState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<office-ui-fabric-react.office-ui-fabric-react/lib/components/Panel/Panel.base.IPanelState> */
@js.native
trait ReadonlyIPanelState extends js.Object {
  
  val id: js.UndefOr[String] = js.native
  
  val isFooterSticky: js.UndefOr[Boolean] = js.native
  
  val visibility: PanelVisibilityState = js.native
}
object ReadonlyIPanelState {
  
  @scala.inline
  def apply(visibility: PanelVisibilityState): ReadonlyIPanelState = {
    val __obj = js.Dynamic.literal(visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyIPanelState]
  }
  
  @scala.inline
  implicit class ReadonlyIPanelStateOps[Self <: ReadonlyIPanelState] (val x: Self) extends AnyVal {
    
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
