package typings.maximMazurokGapiClientDrive.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inherited extends StObject {
  
  /** Whether this permission is inherited. This field is always populated. This is an output-only field. */
  var inherited: js.UndefOr[Boolean] = js.undefined
  
  /** The ID of the item from which this permission is inherited. This is an output-only field. */
  var inheritedFrom: js.UndefOr[String] = js.undefined
  
  /**
    * The permission type for this user. While new values may be added in future, the following are currently possible:
    * - file
    * - member
    */
  var permissionType: js.UndefOr[String] = js.undefined
  
  /**
    * The primary role for this user. While new values may be added in the future, the following are currently possible:
    * - organizer
    * - fileOrganizer
    * - writer
    * - commenter
    * - reader
    */
  var role: js.UndefOr[String] = js.undefined
}
object Inherited {
  
  inline def apply(): Inherited = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Inherited]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Inherited] (val x: Self) extends AnyVal {
    
    inline def setInherited(value: Boolean): Self = StObject.set(x, "inherited", value.asInstanceOf[js.Any])
    
    inline def setInheritedFrom(value: String): Self = StObject.set(x, "inheritedFrom", value.asInstanceOf[js.Any])
    
    inline def setInheritedFromUndefined: Self = StObject.set(x, "inheritedFrom", js.undefined)
    
    inline def setInheritedUndefined: Self = StObject.set(x, "inherited", js.undefined)
    
    inline def setPermissionType(value: String): Self = StObject.set(x, "permissionType", value.asInstanceOf[js.Any])
    
    inline def setPermissionTypeUndefined: Self = StObject.set(x, "permissionType", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
