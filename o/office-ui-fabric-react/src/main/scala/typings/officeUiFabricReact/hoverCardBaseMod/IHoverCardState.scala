package typings.officeUiFabricReact.hoverCardBaseMod

import typings.officeUiFabricReact.expandingCardTypesMod.ExpandingCardMode
import typings.officeUiFabricReact.hoverCardTypesMod.OpenCardMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHoverCardState extends js.Object {
  
  var isHoverCardVisible: js.UndefOr[Boolean] = js.native
  
  var mode: js.UndefOr[ExpandingCardMode] = js.native
  
  var openMode: js.UndefOr[OpenCardMode] = js.native
}
object IHoverCardState {
  
  @scala.inline
  def apply(): IHoverCardState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHoverCardState]
  }
  
  @scala.inline
  implicit class IHoverCardStateOps[Self <: IHoverCardState] (val x: Self) extends AnyVal {
    
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
    def setIsHoverCardVisible(value: Boolean): Self = this.set("isHoverCardVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsHoverCardVisible: Self = this.set("isHoverCardVisible", js.undefined)
    
    @scala.inline
    def setMode(value: ExpandingCardMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setOpenMode(value: OpenCardMode): Self = this.set("openMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenMode: Self = this.set("openMode", js.undefined)
  }
}
