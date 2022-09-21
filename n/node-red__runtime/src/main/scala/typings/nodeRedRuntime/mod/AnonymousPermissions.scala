package typings.nodeRedRuntime.mod

import typings.nodeRedRuntime.nodeRedRuntimeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnonymousPermissions
  extends StObject
     with User {
  
  var anonymous: `true`
  
  var permissions: Permission | js.Array[Permission]
}
object AnonymousPermissions {
  
  inline def apply(permissions: Permission | js.Array[Permission]): AnonymousPermissions = {
    val __obj = js.Dynamic.literal(anonymous = true, permissions = permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonymousPermissions]
  }
  
  extension [Self <: AnonymousPermissions](x: Self) {
    
    inline def setAnonymous(value: `true`): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
    
    inline def setPermissions(value: Permission | js.Array[Permission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsVarargs(value: Permission*): Self = StObject.set(x, "permissions", js.Array(value*))
  }
}
