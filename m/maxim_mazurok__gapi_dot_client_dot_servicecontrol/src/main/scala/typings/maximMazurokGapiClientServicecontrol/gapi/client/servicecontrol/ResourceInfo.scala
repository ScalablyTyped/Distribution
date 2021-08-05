package typings.maximMazurokGapiClientServicecontrol.gapi.client.servicecontrol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceInfo extends StObject {
  
  /** The name of the resource referenced in the request. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The resource permission needed for this request. The format must be "{service}/{plural}.{verb}". */
  var permission: js.UndefOr[String] = js.undefined
  
  /** The resource type in the format of "{service}/{kind}". */
  var `type`: js.UndefOr[String] = js.undefined
}
object ResourceInfo {
  
  inline def apply(): ResourceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceInfo]
  }
  
  extension [Self <: ResourceInfo](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
