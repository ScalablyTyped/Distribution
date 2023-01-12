package typings.maximMazurokGapiClientDrive.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InheritedFrom extends StObject {
  
  /** Deprecated - use permissionDetails/inherited instead. */
  var inherited: js.UndefOr[Boolean] = js.undefined
  
  /** Deprecated - use permissionDetails/inheritedFrom instead. */
  var inheritedFrom: js.UndefOr[String] = js.undefined
  
  /** Deprecated - use permissionDetails/role instead. */
  var role: js.UndefOr[String] = js.undefined
  
  /** Deprecated - use permissionDetails/permissionType instead. */
  var teamDrivePermissionType: js.UndefOr[String] = js.undefined
}
object InheritedFrom {
  
  inline def apply(): InheritedFrom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InheritedFrom]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InheritedFrom] (val x: Self) extends AnyVal {
    
    inline def setInherited(value: Boolean): Self = StObject.set(x, "inherited", value.asInstanceOf[js.Any])
    
    inline def setInheritedFrom(value: String): Self = StObject.set(x, "inheritedFrom", value.asInstanceOf[js.Any])
    
    inline def setInheritedFromUndefined: Self = StObject.set(x, "inheritedFrom", js.undefined)
    
    inline def setInheritedUndefined: Self = StObject.set(x, "inherited", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setTeamDrivePermissionType(value: String): Self = StObject.set(x, "teamDrivePermissionType", value.asInstanceOf[js.Any])
    
    inline def setTeamDrivePermissionTypeUndefined: Self = StObject.set(x, "teamDrivePermissionType", js.undefined)
  }
}
