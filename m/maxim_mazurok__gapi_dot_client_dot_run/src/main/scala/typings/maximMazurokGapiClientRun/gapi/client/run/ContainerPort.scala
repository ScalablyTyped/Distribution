package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerPort extends StObject {
  
  /** (Optional) Port number the container listens on. This must be a valid port number, 0 < x < 65536. */
  var containerPort: js.UndefOr[Double] = js.native
  
  /** (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported If specified, used to specify which protocol to use. Allowed values are "http1" and "h2c". */
  var name: js.UndefOr[String] = js.native
  
  /** (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Protocol for port. Must be "TCP". Defaults to "TCP". */
  var protocol: js.UndefOr[String] = js.native
}
object ContainerPort {
  
  @scala.inline
  def apply(): ContainerPort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerPort]
  }
  
  @scala.inline
  implicit class ContainerPortMutableBuilder[Self <: ContainerPort] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerPort(value: Double): Self = StObject.set(x, "containerPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerPortUndefined: Self = StObject.set(x, "containerPort", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
  }
}
