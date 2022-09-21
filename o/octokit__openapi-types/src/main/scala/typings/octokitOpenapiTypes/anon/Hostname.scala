package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hostname extends StObject {
  
  var hostname: js.UndefOr[String] = js.undefined
  
  var last_sync: js.UndefOr[Error] = js.undefined
  
  var server_id: js.UndefOr[String] = js.undefined
}
object Hostname {
  
  inline def apply(): Hostname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hostname]
  }
  
  extension [Self <: Hostname](x: Self) {
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setLast_sync(value: Error): Self = StObject.set(x, "last_sync", value.asInstanceOf[js.Any])
    
    inline def setLast_syncUndefined: Self = StObject.set(x, "last_sync", js.undefined)
    
    inline def setServer_id(value: String): Self = StObject.set(x, "server_id", value.asInstanceOf[js.Any])
    
    inline def setServer_idUndefined: Self = StObject.set(x, "server_id", js.undefined)
  }
}
