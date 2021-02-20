package typings.maximMazurokGapiClientDomains.gapi.client.domains

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetrieveRegisterParametersResponse extends StObject {
  
  /** Parameters to use when calling the `RegisterDomain` method. */
  var registerParameters: js.UndefOr[RegisterParameters] = js.native
}
object RetrieveRegisterParametersResponse {
  
  @scala.inline
  def apply(): RetrieveRegisterParametersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetrieveRegisterParametersResponse]
  }
  
  @scala.inline
  implicit class RetrieveRegisterParametersResponseMutableBuilder[Self <: RetrieveRegisterParametersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegisterParameters(value: RegisterParameters): Self = StObject.set(x, "registerParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisterParametersUndefined: Self = StObject.set(x, "registerParameters", js.undefined)
  }
}
