package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceResourceAccess extends StObject {
  
  var permissions: js.UndefOr[js.Array[ResourcePermission]] = js.undefined
  
  var resourceAppId: js.UndefOr[String] = js.undefined
}
object InstanceResourceAccess {
  
  inline def apply(): InstanceResourceAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceResourceAccess]
  }
  
  extension [Self <: InstanceResourceAccess](x: Self) {
    
    inline def setPermissions(value: js.Array[ResourcePermission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: ResourcePermission*): Self = StObject.set(x, "permissions", js.Array(value :_*))
    
    inline def setResourceAppId(value: String): Self = StObject.set(x, "resourceAppId", value.asInstanceOf[js.Any])
    
    inline def setResourceAppIdUndefined: Self = StObject.set(x, "resourceAppId", js.undefined)
  }
}
