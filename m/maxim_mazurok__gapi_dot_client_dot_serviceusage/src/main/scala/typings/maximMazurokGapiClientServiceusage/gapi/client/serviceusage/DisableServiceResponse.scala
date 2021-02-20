package typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableServiceResponse extends StObject {
  
  /** The new state of the service after disabling. */
  var service: js.UndefOr[GoogleApiServiceusageV1Service] = js.native
}
object DisableServiceResponse {
  
  @scala.inline
  def apply(): DisableServiceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableServiceResponse]
  }
  
  @scala.inline
  implicit class DisableServiceResponseMutableBuilder[Self <: DisableServiceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setService(value: GoogleApiServiceusageV1Service): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
