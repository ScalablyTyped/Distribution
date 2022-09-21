package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRunV2ContainerPort extends StObject {
  
  /** Port number the container listens on. This must be a valid TCP port number, 0 < container_port < 65536. */
  var containerPort: js.UndefOr[Double] = js.undefined
  
  /** If specified, used to specify which protocol to use. Allowed values are "http1" and "h2c". */
  var name: js.UndefOr[String] = js.undefined
}
object GoogleCloudRunV2ContainerPort {
  
  inline def apply(): GoogleCloudRunV2ContainerPort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRunV2ContainerPort]
  }
  
  extension [Self <: GoogleCloudRunV2ContainerPort](x: Self) {
    
    inline def setContainerPort(value: Double): Self = StObject.set(x, "containerPort", value.asInstanceOf[js.Any])
    
    inline def setContainerPortUndefined: Self = StObject.set(x, "containerPort", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
