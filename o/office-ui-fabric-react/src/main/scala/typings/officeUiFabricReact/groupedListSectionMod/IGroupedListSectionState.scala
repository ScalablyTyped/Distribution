package typings.officeUiFabricReact.groupedListSectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGroupedListSectionState extends js.Object {
  
  var isDropping: js.UndefOr[Boolean] = js.native
  
  var isSelected: js.UndefOr[Boolean] = js.native
}
object IGroupedListSectionState {
  
  @scala.inline
  def apply(): IGroupedListSectionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGroupedListSectionState]
  }
  
  @scala.inline
  implicit class IGroupedListSectionStateOps[Self <: IGroupedListSectionState] (val x: Self) extends AnyVal {
    
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
    def setIsDropping(value: Boolean): Self = this.set("isDropping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDropping: Self = this.set("isDropping", js.undefined)
    
    @scala.inline
    def setIsSelected(value: Boolean): Self = this.set("isSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSelected: Self = this.set("isSelected", js.undefined)
  }
}
