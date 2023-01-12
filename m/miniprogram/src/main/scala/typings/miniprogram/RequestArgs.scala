package typings.miniprogram

import org.scalablytyped.runtime.StringDictionary
import typings.miniprogram.miniprogramStrings.GET
import typings.miniprogram.miniprogramStrings.POST
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestArgs
  extends StObject
     with AsyncCallback[RequestCallbackValue] {
  
  var data: js.UndefOr[Any] = js.undefined
  
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
  
  inline def apply(url: String): RequestArgs = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestArgs] (val x: Self) extends AnyVal {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMethod(value: GET | POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
