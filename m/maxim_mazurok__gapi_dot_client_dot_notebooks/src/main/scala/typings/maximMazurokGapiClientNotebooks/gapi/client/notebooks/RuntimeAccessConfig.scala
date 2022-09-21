package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuntimeAccessConfig extends StObject {
  
  /** The type of access mode this instance. */
  var accessType: js.UndefOr[String] = js.undefined
  
  /** Output only. The proxy endpoint that is used to access the runtime. */
  var proxyUri: js.UndefOr[String] = js.undefined
  
  /** The owner of this runtime after creation. Format: `alias@example.com` Currently supports one owner only. */
  var runtimeOwner: js.UndefOr[String] = js.undefined
}
object RuntimeAccessConfig {
  
  inline def apply(): RuntimeAccessConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeAccessConfig]
  }
  
  extension [Self <: RuntimeAccessConfig](x: Self) {
    
    inline def setAccessType(value: String): Self = StObject.set(x, "accessType", value.asInstanceOf[js.Any])
    
    inline def setAccessTypeUndefined: Self = StObject.set(x, "accessType", js.undefined)
    
    inline def setProxyUri(value: String): Self = StObject.set(x, "proxyUri", value.asInstanceOf[js.Any])
    
    inline def setProxyUriUndefined: Self = StObject.set(x, "proxyUri", js.undefined)
    
    inline def setRuntimeOwner(value: String): Self = StObject.set(x, "runtimeOwner", value.asInstanceOf[js.Any])
    
    inline def setRuntimeOwnerUndefined: Self = StObject.set(x, "runtimeOwner", js.undefined)
  }
}
