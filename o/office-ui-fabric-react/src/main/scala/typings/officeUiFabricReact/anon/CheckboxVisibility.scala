package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.detailsListTypesMod.ConstrainMode
import typings.officeUiFabricReact.detailsListTypesMod.DetailsListLayoutMode
import typings.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckboxVisibility extends js.Object {
  
  var checkboxVisibility: typings.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility = js.native
  
  var compact: Boolean = js.native
  
  var constrainMode: ConstrainMode = js.native
  
  var isHeaderVisible: Boolean = js.native
  
  var layoutMode: DetailsListLayoutMode = js.native
  
  var selectionMode: SelectionMode = js.native
  
  var useFastIcons: Boolean = js.native
}
object CheckboxVisibility {
  
  @scala.inline
  def apply(
    checkboxVisibility: typings.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility,
    compact: Boolean,
    constrainMode: ConstrainMode,
    isHeaderVisible: Boolean,
    layoutMode: DetailsListLayoutMode,
    selectionMode: SelectionMode,
    useFastIcons: Boolean
  ): CheckboxVisibility = {
    val __obj = js.Dynamic.literal(checkboxVisibility = checkboxVisibility.asInstanceOf[js.Any], compact = compact.asInstanceOf[js.Any], constrainMode = constrainMode.asInstanceOf[js.Any], isHeaderVisible = isHeaderVisible.asInstanceOf[js.Any], layoutMode = layoutMode.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], useFastIcons = useFastIcons.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxVisibility]
  }
  
  @scala.inline
  implicit class CheckboxVisibilityOps[Self <: CheckboxVisibility] (val x: Self) extends AnyVal {
    
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
    def setCheckboxVisibility(value: typings.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility): Self = this.set("checkboxVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstrainMode(value: ConstrainMode): Self = this.set("constrainMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHeaderVisible(value: Boolean): Self = this.set("isHeaderVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutMode(value: DetailsListLayoutMode): Self = this.set("layoutMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionMode(value: SelectionMode): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseFastIcons(value: Boolean): Self = this.set("useFastIcons", value.asInstanceOf[js.Any])
  }
}
