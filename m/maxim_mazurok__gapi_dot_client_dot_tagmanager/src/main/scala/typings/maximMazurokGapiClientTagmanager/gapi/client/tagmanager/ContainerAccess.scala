package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerAccess extends StObject {
  
  /** GTM Container ID. @mutable tagmanager.accounts.permissions.create @mutable tagmanager.accounts.permissions.update */
  var containerId: js.UndefOr[String] = js.undefined
  
  /** List of Container permissions. @mutable tagmanager.accounts.permissions.create @mutable tagmanager.accounts.permissions.update */
  var permission: js.UndefOr[String] = js.undefined
}
object ContainerAccess {
  
  inline def apply(): ContainerAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerAccess]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContainerAccess] (val x: Self) extends AnyVal {
    
    inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    inline def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
  }
}
