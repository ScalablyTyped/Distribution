package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManualRule extends StObject {
  
  /** The list of group names and the corresponding items from the source data that map to each group name. */
  var groups: js.UndefOr[js.Array[ManualRuleGroup]] = js.undefined
}
object ManualRule {
  
  inline def apply(): ManualRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManualRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManualRule] (val x: Self) extends AnyVal {
    
    inline def setGroups(value: js.Array[ManualRuleGroup]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: ManualRuleGroup*): Self = StObject.set(x, "groups", js.Array(value*))
  }
}
