package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1ContainerPort extends StObject {
  
  /** Number of the port to expose on the container. This must be a valid port number: 0 < PORT_NUMBER < 65536. */
  var containerPort: js.UndefOr[Double] = js.native
}
object GoogleCloudMlV1ContainerPort {
  
  @scala.inline
  def apply(): GoogleCloudMlV1ContainerPort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1ContainerPort]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1ContainerPortMutableBuilder[Self <: GoogleCloudMlV1ContainerPort] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerPort(value: Double): Self = StObject.set(x, "containerPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerPortUndefined: Self = StObject.set(x, "containerPort", js.undefined)
  }
}
