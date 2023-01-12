package typings.paypalCheckoutServerSdk.libOrdersLibMod

import typings.paypalCheckoutServerSdk.libPaymentsLibMod.ProcessorResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizationWithAdditionalData extends StObject {
  
  var processor_response: ProcessorResponse
}
object AuthorizationWithAdditionalData {
  
  inline def apply(processor_response: ProcessorResponse): AuthorizationWithAdditionalData = {
    val __obj = js.Dynamic.literal(processor_response = processor_response.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationWithAdditionalData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthorizationWithAdditionalData] (val x: Self) extends AnyVal {
    
    inline def setProcessor_response(value: ProcessorResponse): Self = StObject.set(x, "processor_response", value.asInstanceOf[js.Any])
  }
}
