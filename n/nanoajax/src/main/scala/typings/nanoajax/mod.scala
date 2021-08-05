package typings.nanoajax

import org.scalablytyped.runtime.StringDictionary
import typings.std.FormData
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nanoajax", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ajax(params: RequestParameters, callback: Callback): XMLHttpRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ajax")(params.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[XMLHttpRequest]
  
  type Callback = js.Function3[/* statusCode */ Double, /* response */ String, /* request */ XMLHttpRequest, js.Any]
  
  trait RequestParameters extends StObject {
    
    var body: js.UndefOr[String | FormData] = js.undefined
    
    var cors: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var url: String
  }
  object RequestParameters {
    
    inline def apply(url: String): RequestParameters = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestParameters]
    }
    
    extension [Self <: RequestParameters](x: Self) {
      
      inline def setBody(value: String | FormData): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCors(value: Boolean): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
      
      inline def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
