package typings.officeUiFabricReact.groupedListBaseMod

import typings.officeUiFabricReact.groupedListTypesMod.IGroup
import typings.officeUiFabricReact.listTypesMod.IListProps
import typings.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGroupedListState extends js.Object {
  
  var compact: js.UndefOr[Boolean] = js.native
  
  var groups: js.UndefOr[js.Array[IGroup]] = js.native
  
  var items: js.UndefOr[js.Array[_]] = js.native
  
  var listProps: js.UndefOr[IListProps[_]] = js.native
  
  var selectionMode: js.UndefOr[SelectionMode] = js.native
}
object IGroupedListState {
  
  @scala.inline
  def apply(): IGroupedListState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGroupedListState]
  }
  
  @scala.inline
  implicit class IGroupedListStateOps[Self <: IGroupedListState] (val x: Self) extends AnyVal {
    
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
    def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: IGroup*): Self = this.set("groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: js.Array[IGroup]): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[_]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setListProps(value: IListProps[_]): Self = this.set("listProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListProps: Self = this.set("listProps", js.undefined)
    
    @scala.inline
    def setSelectionMode(value: SelectionMode): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
  }
}
