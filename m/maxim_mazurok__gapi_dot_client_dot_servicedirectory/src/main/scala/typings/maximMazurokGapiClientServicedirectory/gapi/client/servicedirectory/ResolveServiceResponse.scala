package typings.maximMazurokGapiClientServicedirectory.gapi.client.servicedirectory

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolveServiceResponse extends StObject {
  
  var service: js.UndefOr[Service] = js.native
}
object ResolveServiceResponse {
  
  @scala.inline
  def apply(): ResolveServiceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveServiceResponse]
  }
  
  @scala.inline
  implicit class ResolveServiceResponseMutableBuilder[Self <: ResolveServiceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setService(value: Service): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
