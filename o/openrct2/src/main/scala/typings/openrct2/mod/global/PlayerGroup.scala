package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayerGroup extends StObject {
  
  val id: Double
  
  var name: String
  
  var permissions: js.Array[PermissionType]
}
object PlayerGroup {
  
  inline def apply(id: Double, name: String, permissions: js.Array[PermissionType]): PlayerGroup = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerGroup]
  }
  
  extension [Self <: PlayerGroup](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPermissions(value: js.Array[PermissionType]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsVarargs(value: PermissionType*): Self = StObject.set(x, "permissions", js.Array(value*))
  }
}
