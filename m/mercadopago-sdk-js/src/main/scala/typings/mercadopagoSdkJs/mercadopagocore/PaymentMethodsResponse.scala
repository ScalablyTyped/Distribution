package typings.mercadopagoSdkJs.mercadopagocore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentMethodsResponse extends StObject {
  
  var paging: Paging
  
  var results: js.Array[Result]
}
object PaymentMethodsResponse {
  
  inline def apply(paging: Paging, results: js.Array[Result]): PaymentMethodsResponse = {
    val __obj = js.Dynamic.literal(paging = paging.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaymentMethodsResponse] (val x: Self) extends AnyVal {
    
    inline def setPaging(value: Paging): Self = StObject.set(x, "paging", value.asInstanceOf[js.Any])
    
    inline def setResults(value: js.Array[Result]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: Result*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
