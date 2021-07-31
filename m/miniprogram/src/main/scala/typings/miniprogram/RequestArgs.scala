package typings.miniprogram

import org.scalablytyped.runtime.StringDictionary
import typings.miniprogram.anon.Headers
import typings.miniprogram.miniprogramStrings.GET
import typings.miniprogram.miniprogramStrings.POST
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestArgs
  extends StObject
     with AsyncCallback[Headers] {
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Expected return data format, default json, supporting json, text and base64.
    */
  var dataType: js.UndefOr[String] = js.undefined
  
  /**
    * Set the request HTTP header, default {'content-type': 'application/json'}.
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var method: js.UndefOr[GET | POST] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var url: String
}
object RequestArgs {
  
  @scala.inline
  def apply(url: String): RequestArgs = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestArgs]
  }
  
  @scala.inline
  implicit class RequestArgsMutableBuilder[Self <: RequestArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setMethod(value: GET | POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
