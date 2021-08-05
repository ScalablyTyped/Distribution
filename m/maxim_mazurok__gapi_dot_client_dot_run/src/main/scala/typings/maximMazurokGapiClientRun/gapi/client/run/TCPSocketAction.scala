package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TCPSocketAction extends StObject {
  
  /** (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Optional: Host name to connect to, defaults to the pod IP. */
  var host: js.UndefOr[String] = js.undefined
  
  /**
    * Cloud Run fully managed: not supported Cloud Run for Anthos: supported Number or name of the port to access on the container. Number must be in the range 1 to 65535. Name must be an
    * IANA_SVC_NAME. This field is currently limited to integer types only because of proto's inability to properly support the IntOrString golang type.
    */
  var port: js.UndefOr[Double] = js.undefined
}
object TCPSocketAction {
  
  inline def apply(): TCPSocketAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TCPSocketAction]
  }
  
  extension [Self <: TCPSocketAction](x: Self) {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
