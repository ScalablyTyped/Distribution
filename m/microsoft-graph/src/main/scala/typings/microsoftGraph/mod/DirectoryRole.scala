package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectoryRole extends DirectoryObject {
  
  // The description for the directory role. Read-only.
  var description: js.UndefOr[NullableOption[String]] = js.native
  
  // The display name for the directory role. Read-only.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // Users that are members of this directory role. HTTP Methods: GET, POST, DELETE. Read-only. Nullable.
  var members: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.native
  
  /**
    * The id of the directoryRoleTemplate that this role is based on. The property must be specified when activating a
    * directory role in a tenant with a POST operation. After the directory role has been activated, the property is read
    * only.
    */
  var roleTemplateId: js.UndefOr[NullableOption[String]] = js.native
  
  var scopedMembers: js.UndefOr[NullableOption[js.Array[ScopedRoleMembership]]] = js.native
}
object DirectoryRole {
  
  @scala.inline
  def apply(): DirectoryRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryRole]
  }
  
  @scala.inline
  implicit class DirectoryRoleMutableBuilder[Self <: DirectoryRole] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setMembers(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersNull: Self = StObject.set(x, "members", null)
    
    @scala.inline
    def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    @scala.inline
    def setMembersVarargs(value: DirectoryObject*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setRoleTemplateId(value: NullableOption[String]): Self = StObject.set(x, "roleTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleTemplateIdNull: Self = StObject.set(x, "roleTemplateId", null)
    
    @scala.inline
    def setRoleTemplateIdUndefined: Self = StObject.set(x, "roleTemplateId", js.undefined)
    
    @scala.inline
    def setScopedMembers(value: NullableOption[js.Array[ScopedRoleMembership]]): Self = StObject.set(x, "scopedMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopedMembersNull: Self = StObject.set(x, "scopedMembers", null)
    
    @scala.inline
    def setScopedMembersUndefined: Self = StObject.set(x, "scopedMembers", js.undefined)
    
    @scala.inline
    def setScopedMembersVarargs(value: ScopedRoleMembership*): Self = StObject.set(x, "scopedMembers", js.Array(value :_*))
  }
}
