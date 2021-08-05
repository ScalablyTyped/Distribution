package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectoryRole
  extends StObject
     with DirectoryObject {
  
  // The description for the directory role. Read-only.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The display name for the directory role. Read-only.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Users that are members of this directory role. HTTP Methods: GET, POST, DELETE. Read-only. Nullable.
  var members: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
  
  /**
    * The id of the directoryRoleTemplate that this role is based on. The property must be specified when activating a
    * directory role in a tenant with a POST operation. After the directory role has been activated, the property is read
    * only.
    */
  var roleTemplateId: js.UndefOr[NullableOption[String]] = js.undefined
  
  var scopedMembers: js.UndefOr[NullableOption[js.Array[ScopedRoleMembership]]] = js.undefined
}
object DirectoryRole {
  
  inline def apply(): DirectoryRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryRole]
  }
  
  extension [Self <: DirectoryRole](x: Self) {
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setMembers(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersNull: Self = StObject.set(x, "members", null)
    
    inline def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    inline def setMembersVarargs(value: DirectoryObject*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    inline def setRoleTemplateId(value: NullableOption[String]): Self = StObject.set(x, "roleTemplateId", value.asInstanceOf[js.Any])
    
    inline def setRoleTemplateIdNull: Self = StObject.set(x, "roleTemplateId", null)
    
    inline def setRoleTemplateIdUndefined: Self = StObject.set(x, "roleTemplateId", js.undefined)
    
    inline def setScopedMembers(value: NullableOption[js.Array[ScopedRoleMembership]]): Self = StObject.set(x, "scopedMembers", value.asInstanceOf[js.Any])
    
    inline def setScopedMembersNull: Self = StObject.set(x, "scopedMembers", null)
    
    inline def setScopedMembersUndefined: Self = StObject.set(x, "scopedMembers", js.undefined)
    
    inline def setScopedMembersVarargs(value: ScopedRoleMembership*): Self = StObject.set(x, "scopedMembers", js.Array(value :_*))
  }
}
