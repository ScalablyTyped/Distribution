package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeliverInfo extends StObject {
  
  /** URI of the resource that the packet is delivered to. */
  var resourceUri: js.UndefOr[String] = js.undefined
  
  /** Target type where the packet is delivered to. */
  var target: js.UndefOr[String] = js.undefined
}
object DeliverInfo {
  
  inline def apply(): DeliverInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeliverInfo]
  }
  
  extension [Self <: DeliverInfo](x: Self) {
    
    inline def setResourceUri(value: String): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
    
    inline def setResourceUriUndefined: Self = StObject.set(x, "resourceUri", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
