package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancesRotateServerCaRequest extends StObject {
  
  /** Contains details about the rotate server CA operation. */
  var rotateServerCaContext: js.UndefOr[RotateServerCaContext] = js.native
}
object InstancesRotateServerCaRequest {
  
  @scala.inline
  def apply(): InstancesRotateServerCaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesRotateServerCaRequest]
  }
  
  @scala.inline
  implicit class InstancesRotateServerCaRequestMutableBuilder[Self <: InstancesRotateServerCaRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRotateServerCaContext(value: RotateServerCaContext): Self = StObject.set(x, "rotateServerCaContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateServerCaContextUndefined: Self = StObject.set(x, "rotateServerCaContext", js.undefined)
  }
}
