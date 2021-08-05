package typings.paypalPayoutsSdk.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpResponse[R] extends StObject {
  
  var headers: StringDictionary[String]
  
  var message: js.UndefOr[String] = js.undefined
  
  var result: js.UndefOr[R] = js.undefined
  
  var statusCode: Double
}
object HttpResponse {
  
  inline def apply[R](headers: StringDictionary[String], statusCode: Double): HttpResponse[R] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpResponse[R]]
  }
  
  extension [Self <: HttpResponse[?], R](x: Self & HttpResponse[R]) {
    
    inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setResult(value: R): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
