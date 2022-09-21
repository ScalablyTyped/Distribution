package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManualRuleGroup extends StObject {
  
  /** The group name, which must be a string. Each group in a given ManualRule must have a unique group name. */
  var groupName: js.UndefOr[ExtendedValue] = js.undefined
  
  /**
    * The items in the source data that should be placed into this group. Each item may be a string, number, or boolean. Items may appear in at most one group within a given ManualRule.
    * Items that do not appear in any group will appear on their own.
    */
  var items: js.UndefOr[js.Array[ExtendedValue]] = js.undefined
}
object ManualRuleGroup {
  
  inline def apply(): ManualRuleGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManualRuleGroup]
  }
  
  extension [Self <: ManualRuleGroup](x: Self) {
    
    inline def setGroupName(value: ExtendedValue): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
    
    inline def setItems(value: js.Array[ExtendedValue]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ExtendedValue*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
