package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulingGroup
  extends StObject
     with ChangeTrackedEntity {
  
  // The display name for the schedulingGroup. Required.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Indicates whether the schedulingGroup can be used when creating new entities or updating existing ones. Required.
  var isActive: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The list of user IDs that are a member of the schedulingGroup. Required.
  var userIds: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
}
object SchedulingGroup {
  
  inline def apply(): SchedulingGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulingGroup]
  }
  
  extension [Self <: SchedulingGroup](x: Self) {
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setIsActive(value: NullableOption[Boolean]): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setIsActiveNull: Self = StObject.set(x, "isActive", null)
    
    inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    
    inline def setUserIds(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "userIds", value.asInstanceOf[js.Any])
    
    inline def setUserIdsNull: Self = StObject.set(x, "userIds", null)
    
    inline def setUserIdsUndefined: Self = StObject.set(x, "userIds", js.undefined)
    
    inline def setUserIdsVarargs(value: String*): Self = StObject.set(x, "userIds", js.Array(value :_*))
  }
}
