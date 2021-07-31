package typings.paypalPayoutsSdk.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpRequest extends StObject {
  
  var body: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var headers: PaypalHeader
}
object HttpRequest {
  
  @scala.inline
  def apply(headers: PaypalHeader): HttpRequest = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpRequest]
  }
  
  @scala.inline
  implicit class HttpRequestMutableBuilder[Self <: HttpRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: StringDictionary[String]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setHeaders(value: PaypalHeader): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
