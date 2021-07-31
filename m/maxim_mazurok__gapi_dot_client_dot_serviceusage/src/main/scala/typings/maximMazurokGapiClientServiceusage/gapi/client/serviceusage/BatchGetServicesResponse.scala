package typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetServicesResponse extends StObject {
  
  /** The requested Service states. */
  var services: js.UndefOr[js.Array[GoogleApiServiceusageV1Service]] = js.undefined
}
object BatchGetServicesResponse {
  
  @scala.inline
  def apply(): BatchGetServicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetServicesResponse]
  }
  
  @scala.inline
  implicit class BatchGetServicesResponseMutableBuilder[Self <: BatchGetServicesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServices(value: js.Array[GoogleApiServiceusageV1Service]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    @scala.inline
    def setServicesVarargs(value: GoogleApiServiceusageV1Service*): Self = StObject.set(x, "services", js.Array(value :_*))
  }
}
