package typings.nodemailer.smtpConnectionMod

import typings.node.NodeJS.ErrnoException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SMTPError
  extends StObject
     with ErrnoException {
  
  /** command which provoked an error */
  var command: js.UndefOr[String] = js.undefined
  
  /** the last response received from the server (if the error is caused by an error response from the server) */
  var response: js.UndefOr[String] = js.undefined
  
  /** the numeric response code of the response string (if available) */
  var responseCode: js.UndefOr[Double] = js.undefined
}
object SMTPError {
  
  inline def apply(message: String, name: String): SMTPError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SMTPError]
  }
  
  extension [Self <: SMTPError](x: Self) {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    inline def setResponse(value: String): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseCode(value: Double): Self = StObject.set(x, "responseCode", value.asInstanceOf[js.Any])
    
    inline def setResponseCodeUndefined: Self = StObject.set(x, "responseCode", js.undefined)
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
  }
}
