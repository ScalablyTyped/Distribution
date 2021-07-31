package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdministrativeUnit
  extends StObject
     with DirectoryObject {
  
  // An optional description for the administrative unit.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Display name for the administrative unit.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  var extensions: js.UndefOr[NullableOption[js.Array[Extension]]] = js.undefined
  
  /**
    * Users and groups that are members of this Adminsitrative Unit. HTTP Methods: GET (list members), POST (add members),
    * DELETE (remove members).
    */
  var members: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
  
  /**
    * Scoped-role members of this Administrative Unit. HTTP Methods: GET (list scopedRoleMemberships), POST (add
    * scopedRoleMembership), DELETE (remove scopedRoleMembership).
    */
  var scopedRoleMembers: js.UndefOr[NullableOption[js.Array[ScopedRoleMembership]]] = js.undefined
  
  /**
    * Controls whether the administrative unit and its members are hidden or public. Can be set to HiddenMembership or
    * Public. If not set, default behavior is Public. When set to HiddenMembership, only members of the administrative unit
    * can list other members of the adminstrative unit.
    */
  var visibility: js.UndefOr[NullableOption[String]] = js.undefined
}
object AdministrativeUnit {
  
  @scala.inline
  def apply(): AdministrativeUnit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdministrativeUnit]
  }
  
  @scala.inline
  implicit class AdministrativeUnitMutableBuilder[Self <: AdministrativeUnit] (val x: Self) extends AnyVal {
    
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
    def setExtensions(value: NullableOption[js.Array[Extension]]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsNull: Self = StObject.set(x, "extensions", null)
    
    @scala.inline
    def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: Extension*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    @scala.inline
    def setMembers(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersNull: Self = StObject.set(x, "members", null)
    
    @scala.inline
    def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    @scala.inline
    def setMembersVarargs(value: DirectoryObject*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setScopedRoleMembers(value: NullableOption[js.Array[ScopedRoleMembership]]): Self = StObject.set(x, "scopedRoleMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopedRoleMembersNull: Self = StObject.set(x, "scopedRoleMembers", null)
    
    @scala.inline
    def setScopedRoleMembersUndefined: Self = StObject.set(x, "scopedRoleMembers", js.undefined)
    
    @scala.inline
    def setScopedRoleMembersVarargs(value: ScopedRoleMembership*): Self = StObject.set(x, "scopedRoleMembers", js.Array(value :_*))
    
    @scala.inline
    def setVisibility(value: NullableOption[String]): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityNull: Self = StObject.set(x, "visibility", null)
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
