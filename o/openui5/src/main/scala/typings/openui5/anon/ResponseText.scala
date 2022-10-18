package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseText extends StObject {
  
  /**
    * A text that describes the failure.
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * Response that has been received for the request ,as a text string
    */
  var responseText: js.UndefOr[String] = js.undefined
  
  /**
    * HTTP status code returned by the request (if available)
    */
  var statusCode: js.UndefOr[String] = js.undefined
  
  /**
    * The status as a text, details not specified, intended only for diagnosis output
    */
  var statusText: js.UndefOr[String] = js.undefined
}
object ResponseText {
  
  inline def apply(): ResponseText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseText]
  }
  
  extension [Self <: ResponseText](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setResponseText(value: String): Self = StObject.set(x, "responseText", value.asInstanceOf[js.Any])
    
    inline def setResponseTextUndefined: Self = StObject.set(x, "responseText", js.undefined)
    
    inline def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    
    inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    
    inline def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
  }
}
