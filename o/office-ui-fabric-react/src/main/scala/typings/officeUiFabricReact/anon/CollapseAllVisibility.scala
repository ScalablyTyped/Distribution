package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.libComponentsDetailsListDetailsHeaderDottypesMod.SelectAllVisibility
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollapseAllVisibility extends StObject {
  
  var collapseAllVisibility: typings.officeUiFabricReact.libComponentsGroupedListGroupedListDottypesMod.CollapseAllVisibility
  
  var selectAllVisibility: SelectAllVisibility
  
  var useFastIcons: Boolean
}
object CollapseAllVisibility {
  
  inline def apply(
    collapseAllVisibility: typings.officeUiFabricReact.libComponentsGroupedListGroupedListDottypesMod.CollapseAllVisibility,
    selectAllVisibility: SelectAllVisibility,
    useFastIcons: Boolean
  ): CollapseAllVisibility = {
    val __obj = js.Dynamic.literal(collapseAllVisibility = collapseAllVisibility.asInstanceOf[js.Any], selectAllVisibility = selectAllVisibility.asInstanceOf[js.Any], useFastIcons = useFastIcons.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollapseAllVisibility]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CollapseAllVisibility] (val x: Self) extends AnyVal {
    
    inline def setCollapseAllVisibility(
      value: typings.officeUiFabricReact.libComponentsGroupedListGroupedListDottypesMod.CollapseAllVisibility
    ): Self = StObject.set(x, "collapseAllVisibility", value.asInstanceOf[js.Any])
    
    inline def setSelectAllVisibility(value: SelectAllVisibility): Self = StObject.set(x, "selectAllVisibility", value.asInstanceOf[js.Any])
    
    inline def setUseFastIcons(value: Boolean): Self = StObject.set(x, "useFastIcons", value.asInstanceOf[js.Any])
  }
}
