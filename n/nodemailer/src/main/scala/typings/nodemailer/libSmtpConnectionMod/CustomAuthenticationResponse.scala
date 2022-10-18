package typings.nodemailer.libSmtpConnectionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomAuthenticationResponse extends StObject {
  
  var code: js.UndefOr[Double] = js.undefined
  
  var command: String
  
  var response: String
  
  var status: Double
  
  var text: String
}
object CustomAuthenticationResponse {
  
  inline def apply(command: String, response: String, status: Double, text: String): CustomAuthenticationResponse = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomAuthenticationResponse]
  }
  
  extension [Self <: CustomAuthenticationResponse](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: String): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
