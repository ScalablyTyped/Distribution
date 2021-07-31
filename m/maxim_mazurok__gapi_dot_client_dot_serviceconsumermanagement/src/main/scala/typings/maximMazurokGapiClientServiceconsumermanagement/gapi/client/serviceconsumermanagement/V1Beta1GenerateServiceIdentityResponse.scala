package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait V1Beta1GenerateServiceIdentityResponse extends StObject {
  
  /** ServiceIdentity that was created or retrieved. */
  var identity: js.UndefOr[V1Beta1ServiceIdentity] = js.undefined
}
object V1Beta1GenerateServiceIdentityResponse {
  
  @scala.inline
  def apply(): V1Beta1GenerateServiceIdentityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[V1Beta1GenerateServiceIdentityResponse]
  }
  
  @scala.inline
  implicit class V1Beta1GenerateServiceIdentityResponseMutableBuilder[Self <: V1Beta1GenerateServiceIdentityResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentity(value: V1Beta1ServiceIdentity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
  }
}
