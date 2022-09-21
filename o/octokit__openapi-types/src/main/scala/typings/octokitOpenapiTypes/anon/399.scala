package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `399` extends StObject {
  
  /**
    * @description An array of external groups available to be mapped to a team
    * @example [
    *   {
    *     "group_id": 1,
    *     "group_name": "group-azuread-test",
    *     "updated_at": "2021-01-03 22:27:15:000 -700"
    *   },
    *   {
    *     "group_id": 2,
    *     "group_name": "group-azuread-test2",
    *     "updated_at": "2021-06-03 22:27:15:000 -700"
    *   }
    * ]
    */
  var groups: js.UndefOr[js.Array[GroupidGroupname]] = js.undefined
}
object `399` {
  
  inline def apply(): `399` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`399`]
  }
  
  extension [Self <: `399`](x: Self) {
    
    inline def setGroups(value: js.Array[GroupidGroupname]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: GroupidGroupname*): Self = StObject.set(x, "groups", js.Array(value*))
  }
}
