package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceResourceAccess extends StObject {
  
  var permissions: js.UndefOr[js.Array[ResourcePermission]] = js.undefined
  
  var resourceAppId: js.UndefOr[String] = js.undefined
}
object InstanceResourceAccess {
  
  @scala.inline
  def apply(): InstanceResourceAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceResourceAccess]
  }
  
  @scala.inline
  implicit class InstanceResourceAccessMutableBuilder[Self <: InstanceResourceAccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermissions(value: js.Array[ResourcePermission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: ResourcePermission*): Self = StObject.set(x, "permissions", js.Array(value :_*))
    
    @scala.inline
    def setResourceAppId(value: String): Self = StObject.set(x, "resourceAppId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceAppIdUndefined: Self = StObject.set(x, "resourceAppId", js.undefined)
  }
}
