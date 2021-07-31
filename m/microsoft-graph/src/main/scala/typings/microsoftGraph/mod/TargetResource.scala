package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetResource extends StObject {
  
  // Indicates the visible name defined for the resource. Typically specified when the resource is created.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // When type is set to Group, this indicates the group type.
  var groupType: js.UndefOr[NullableOption[GroupType]] = js.undefined
  
  // Indicates the unique ID of the resource.
  var id: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Indicates name, old value and new value of each attribute that changed. Property values depend on the operation type.
  var modifiedProperties: js.UndefOr[NullableOption[js.Array[ModifiedProperty]]] = js.undefined
  
  // Describes the resource type. Example values include Application, Group, ServicePrincipal, and User.
  var `type`: js.UndefOr[NullableOption[String]] = js.undefined
  
  // When type is set to User, this includes the user name that initiated the action; null for other types.
  var userPrincipalName: js.UndefOr[NullableOption[String]] = js.undefined
}
object TargetResource {
  
  @scala.inline
  def apply(): TargetResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetResource]
  }
  
  @scala.inline
  implicit class TargetResourceMutableBuilder[Self <: TargetResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setGroupType(value: NullableOption[GroupType]): Self = StObject.set(x, "groupType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupTypeNull: Self = StObject.set(x, "groupType", null)
    
    @scala.inline
    def setGroupTypeUndefined: Self = StObject.set(x, "groupType", js.undefined)
    
    @scala.inline
    def setId(value: NullableOption[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setModifiedProperties(value: NullableOption[js.Array[ModifiedProperty]]): Self = StObject.set(x, "modifiedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedPropertiesNull: Self = StObject.set(x, "modifiedProperties", null)
    
    @scala.inline
    def setModifiedPropertiesUndefined: Self = StObject.set(x, "modifiedProperties", js.undefined)
    
    @scala.inline
    def setModifiedPropertiesVarargs(value: ModifiedProperty*): Self = StObject.set(x, "modifiedProperties", js.Array(value :_*))
    
    @scala.inline
    def setType(value: NullableOption[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNull: Self = StObject.set(x, "type", null)
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUserPrincipalName(value: NullableOption[String]): Self = StObject.set(x, "userPrincipalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPrincipalNameNull: Self = StObject.set(x, "userPrincipalName", null)
    
    @scala.inline
    def setUserPrincipalNameUndefined: Self = StObject.set(x, "userPrincipalName", js.undefined)
  }
}
