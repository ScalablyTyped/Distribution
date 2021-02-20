package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UndeleteServiceResponse extends StObject {
  
  /** Revived service resource. */
  var service: js.UndefOr[ManagedService] = js.native
}
object UndeleteServiceResponse {
  
  @scala.inline
  def apply(): UndeleteServiceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UndeleteServiceResponse]
  }
  
  @scala.inline
  implicit class UndeleteServiceResponseMutableBuilder[Self <: UndeleteServiceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setService(value: ManagedService): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
