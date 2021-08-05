package typings.paypalRestSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayPalError extends StObject {
  
  val debug_id: String
  
  val details: js.Array[ErrorDetails]
  
  val information_link: String
  
  val message: String
  
  val name: String
}
object PayPalError {
  
  inline def apply(
    debug_id: String,
    details: js.Array[ErrorDetails],
    information_link: String,
    message: String,
    name: String
  ): PayPalError = {
    val __obj = js.Dynamic.literal(debug_id = debug_id.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], information_link = information_link.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayPalError]
  }
  
  extension [Self <: PayPalError](x: Self) {
    
    inline def setDebug_id(value: String): Self = StObject.set(x, "debug_id", value.asInstanceOf[js.Any])
    
    inline def setDetails(value: js.Array[ErrorDetails]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsVarargs(value: ErrorDetails*): Self = StObject.set(x, "details", js.Array(value :_*))
    
    inline def setInformation_link(value: String): Self = StObject.set(x, "information_link", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
