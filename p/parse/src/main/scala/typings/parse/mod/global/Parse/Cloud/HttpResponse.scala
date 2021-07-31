package typings.parse.mod.global.Parse.Cloud

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpResponse extends StObject {
  
  var buffer: js.UndefOr[Buffer] = js.undefined
  
  var cookies: js.UndefOr[js.Any] = js.undefined
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var headers: js.UndefOr[js.Any] = js.undefined
  
  var status: js.UndefOr[Double] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object HttpResponse {
  
  @scala.inline
  def apply(): HttpResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpResponse]
  }
  
  @scala.inline
  implicit class HttpResponseMutableBuilder[Self <: HttpResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: Buffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
    
    @scala.inline
    def setCookies(value: js.Any): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
