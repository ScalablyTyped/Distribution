package typings.officeUiFabricReact.detailsHeaderTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDetailsHeaderState extends js.Object {
  
  var columnResizeDetails: js.UndefOr[IColumnResizeDetails] = js.native
  
  var isAllCollapsed: js.UndefOr[Boolean] = js.native
  
  var isAllSelected: js.UndefOr[Boolean] = js.native
  
  var isSizing: js.UndefOr[Boolean] = js.native
}
object IDetailsHeaderState {
  
  @scala.inline
  def apply(): IDetailsHeaderState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDetailsHeaderState]
  }
  
  @scala.inline
  implicit class IDetailsHeaderStateOps[Self <: IDetailsHeaderState] (val x: Self) extends AnyVal {
    
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
    def setColumnResizeDetails(value: IColumnResizeDetails): Self = this.set("columnResizeDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnResizeDetails: Self = this.set("columnResizeDetails", js.undefined)
    
    @scala.inline
    def setIsAllCollapsed(value: Boolean): Self = this.set("isAllCollapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAllCollapsed: Self = this.set("isAllCollapsed", js.undefined)
    
    @scala.inline
    def setIsAllSelected(value: Boolean): Self = this.set("isAllSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAllSelected: Self = this.set("isAllSelected", js.undefined)
    
    @scala.inline
    def setIsSizing(value: Boolean): Self = this.set("isSizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSizing: Self = this.set("isSizing", js.undefined)
  }
}
