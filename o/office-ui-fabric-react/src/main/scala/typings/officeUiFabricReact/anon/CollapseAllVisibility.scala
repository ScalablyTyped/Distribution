package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.detailsHeaderTypesMod.SelectAllVisibility
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollapseAllVisibility extends js.Object {
  
  var collapseAllVisibility: typings.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility = js.native
  
  var selectAllVisibility: SelectAllVisibility = js.native
  
  var useFastIcons: Boolean = js.native
}
object CollapseAllVisibility {
  
  @scala.inline
  def apply(
    collapseAllVisibility: typings.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility,
    selectAllVisibility: SelectAllVisibility,
    useFastIcons: Boolean
  ): CollapseAllVisibility = {
    val __obj = js.Dynamic.literal(collapseAllVisibility = collapseAllVisibility.asInstanceOf[js.Any], selectAllVisibility = selectAllVisibility.asInstanceOf[js.Any], useFastIcons = useFastIcons.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollapseAllVisibility]
  }
  
  @scala.inline
  implicit class CollapseAllVisibilityOps[Self <: CollapseAllVisibility] (val x: Self) extends AnyVal {
    
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
    def setCollapseAllVisibility(value: typings.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility): Self = this.set("collapseAllVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectAllVisibility(value: SelectAllVisibility): Self = this.set("selectAllVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseFastIcons(value: Boolean): Self = this.set("useFastIcons", value.asInstanceOf[js.Any])
  }
}
