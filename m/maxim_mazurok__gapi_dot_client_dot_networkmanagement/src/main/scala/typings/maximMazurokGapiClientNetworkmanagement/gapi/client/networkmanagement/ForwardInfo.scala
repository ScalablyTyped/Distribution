package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForwardInfo extends StObject {
  
  /** URI of the resource that the packet is forwarded to. */
  var resourceUri: js.UndefOr[String] = js.undefined
  
  /** Target type where this packet is forwarded to. */
  var target: js.UndefOr[String] = js.undefined
}
object ForwardInfo {
  
  inline def apply(): ForwardInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForwardInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ForwardInfo] (val x: Self) extends AnyVal {
    
    inline def setResourceUri(value: String): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
    
    inline def setResourceUriUndefined: Self = StObject.set(x, "resourceUri", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
