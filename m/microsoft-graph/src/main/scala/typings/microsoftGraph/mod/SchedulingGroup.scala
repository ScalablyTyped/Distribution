package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulingGroup extends ChangeTrackedEntity {
  
  // The display name for the schedulingGroup. Required.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // Indicates whether the schedulingGroup can be used when creating new entities or updating existing ones. Required.
  var isActive: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // The list of user IDs that are a member of the schedulingGroup. Required.
  var userIds: js.UndefOr[NullableOption[js.Array[String]]] = js.native
}
object SchedulingGroup {
  
  @scala.inline
  def apply(): SchedulingGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulingGroup]
  }
  
  @scala.inline
  implicit class SchedulingGroupMutableBuilder[Self <: SchedulingGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setIsActive(value: NullableOption[Boolean]): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActiveNull: Self = StObject.set(x, "isActive", null)
    
    @scala.inline
    def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    
    @scala.inline
    def setUserIds(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "userIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdsNull: Self = StObject.set(x, "userIds", null)
    
    @scala.inline
    def setUserIdsUndefined: Self = StObject.set(x, "userIds", js.undefined)
    
    @scala.inline
    def setUserIdsVarargs(value: String*): Self = StObject.set(x, "userIds", js.Array(value :_*))
  }
}
