package typings.officeUiFabricReact.documentCardActionsTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDocumentCardActionsStyles extends js.Object {
  
  var action: IStyle = js.native
  
  var root: IStyle = js.native
  
  var views: IStyle = js.native
  
  var viewsIcon: IStyle = js.native
}
object IDocumentCardActionsStyles {
  
  @scala.inline
  def apply(): IDocumentCardActionsStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDocumentCardActionsStyles]
  }
  
  @scala.inline
  implicit class IDocumentCardActionsStylesOps[Self <: IDocumentCardActionsStyles] (val x: Self) extends AnyVal {
    
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
    def setAction(value: IStyle): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setActionNull: Self = this.set("action", null)
    
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    
    @scala.inline
    def setViews(value: IStyle): Self = this.set("views", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViews: Self = this.set("views", js.undefined)
    
    @scala.inline
    def setViewsNull: Self = this.set("views", null)
    
    @scala.inline
    def setViewsIcon(value: IStyle): Self = this.set("viewsIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewsIcon: Self = this.set("viewsIcon", js.undefined)
    
    @scala.inline
    def setViewsIconNull: Self = this.set("viewsIcon", null)
  }
}
