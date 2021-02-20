package typings.nanoajax

import org.scalablytyped.runtime.StringDictionary
import typings.std.FormData
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nanoajax", "ajax")
  @js.native
  def ajax(params: RequestParameters, callback: Callback): XMLHttpRequest = js.native
  
  type Callback = js.Function3[/* statusCode */ Double, /* response */ String, /* request */ XMLHttpRequest, js.Any]
  
  @js.native
  trait RequestParameters extends StObject {
    
    var body: js.UndefOr[String | FormData] = js.native
    
    var cors: js.UndefOr[Boolean] = js.native
    
    var headers: js.UndefOr[StringDictionary[String]] = js.native
    
    var method: js.UndefOr[String] = js.native
    
    var url: String = js.native
  }
  object RequestParameters {
    
    @scala.inline
    def apply(url: String): RequestParameters = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestParameters]
    }
    
    @scala.inline
    implicit class RequestParametersMutableBuilder[Self <: RequestParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String | FormData): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setCors(value: Boolean): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
