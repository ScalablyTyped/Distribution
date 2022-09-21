package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdministrativeUnit
  extends StObject
     with DirectoryObject {
  
  // An optional description for the administrative unit. Supports $filter (eq, ne, in, startsWith), $search.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Display name for the administrative unit. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null
    * values), $search, and $orderBy.
    */
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The collection of open extensions defined for this administrative unit. Nullable.
  var extensions: js.UndefOr[NullableOption[js.Array[Extension]]] = js.undefined
  
  // Users and groups that are members of this administrative unit. Supports $expand.
  var members: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
  
  // Scoped-role members of this administrative unit.
  var scopedRoleMembers: js.UndefOr[NullableOption[js.Array[ScopedRoleMembership]]] = js.undefined
  
  /**
    * Controls whether the administrative unit and its members are hidden or public. Can be set to HiddenMembership or
    * Public. If not set, the default behavior is Public. When set to HiddenMembership, only members of the administrative
    * unit can list other members of the administrative unit.
    */
  var visibility: js.UndefOr[NullableOption[String]] = js.undefined
}
object AdministrativeUnit {
  
  inline def apply(): AdministrativeUnit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdministrativeUnit]
  }
  
  extension [Self <: AdministrativeUnit](x: Self) {
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setExtensions(value: NullableOption[js.Array[Extension]]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsNull: Self = StObject.set(x, "extensions", null)
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: Extension*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setMembers(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersNull: Self = StObject.set(x, "members", null)
    
    inline def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    inline def setMembersVarargs(value: DirectoryObject*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setScopedRoleMembers(value: NullableOption[js.Array[ScopedRoleMembership]]): Self = StObject.set(x, "scopedRoleMembers", value.asInstanceOf[js.Any])
    
    inline def setScopedRoleMembersNull: Self = StObject.set(x, "scopedRoleMembers", null)
    
    inline def setScopedRoleMembersUndefined: Self = StObject.set(x, "scopedRoleMembers", js.undefined)
    
    inline def setScopedRoleMembersVarargs(value: ScopedRoleMembership*): Self = StObject.set(x, "scopedRoleMembers", js.Array(value*))
    
    inline def setVisibility(value: NullableOption[String]): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityNull: Self = StObject.set(x, "visibility", null)
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
