package typings.openpay.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorResponse extends StObject {
  
  var category: String
  
  var description: String
  
  var error_code: ResponseError | Double
  
  var fraud_rules: js.Array[String]
  
  var http_code: String
  
  var request_id: String
}
object ErrorResponse {
  
  inline def apply(
    category: String,
    description: String,
    error_code: ResponseError | Double,
    fraud_rules: js.Array[String],
    http_code: String,
    request_id: String
  ): ErrorResponse = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], error_code = error_code.asInstanceOf[js.Any], fraud_rules = fraud_rules.asInstanceOf[js.Any], http_code = http_code.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorResponse]
  }
  
  extension [Self <: ErrorResponse](x: Self) {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setError_code(value: ResponseError | Double): Self = StObject.set(x, "error_code", value.asInstanceOf[js.Any])
    
    inline def setFraud_rules(value: js.Array[String]): Self = StObject.set(x, "fraud_rules", value.asInstanceOf[js.Any])
    
    inline def setFraud_rulesVarargs(value: String*): Self = StObject.set(x, "fraud_rules", js.Array(value*))
    
    inline def setHttp_code(value: String): Self = StObject.set(x, "http_code", value.asInstanceOf[js.Any])
    
    inline def setRequest_id(value: String): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
  }
}
