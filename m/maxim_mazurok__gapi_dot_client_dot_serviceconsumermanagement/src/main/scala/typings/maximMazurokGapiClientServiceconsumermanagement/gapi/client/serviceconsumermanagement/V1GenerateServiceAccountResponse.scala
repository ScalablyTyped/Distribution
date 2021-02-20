package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait V1GenerateServiceAccountResponse extends StObject {
  
  /** ServiceAccount that was created or retrieved. */
  var account: js.UndefOr[V1ServiceAccount] = js.native
}
object V1GenerateServiceAccountResponse {
  
  @scala.inline
  def apply(): V1GenerateServiceAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[V1GenerateServiceAccountResponse]
  }
  
  @scala.inline
  implicit class V1GenerateServiceAccountResponseMutableBuilder[Self <: V1GenerateServiceAccountResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: V1ServiceAccount): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
  }
}
