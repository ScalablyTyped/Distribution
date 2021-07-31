package typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchEnableServicesResponse extends StObject {
  
  /** If allow_partial_success is true, and one or more services could not be enabled, this field contains the details about each failure. */
  var failures: js.UndefOr[js.Array[EnableFailure]] = js.undefined
  
  /** The new state of the services after enabling. */
  var services: js.UndefOr[js.Array[GoogleApiServiceusageV1Service]] = js.undefined
}
object BatchEnableServicesResponse {
  
  @scala.inline
  def apply(): BatchEnableServicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchEnableServicesResponse]
  }
  
  @scala.inline
  implicit class BatchEnableServicesResponseMutableBuilder[Self <: BatchEnableServicesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailures(value: js.Array[EnableFailure]): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailuresUndefined: Self = StObject.set(x, "failures", js.undefined)
    
    @scala.inline
    def setFailuresVarargs(value: EnableFailure*): Self = StObject.set(x, "failures", js.Array(value :_*))
    
    @scala.inline
    def setServices(value: js.Array[GoogleApiServiceusageV1Service]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    @scala.inline
    def setServicesVarargs(value: GoogleApiServiceusageV1Service*): Self = StObject.set(x, "services", js.Array(value :_*))
  }
}
