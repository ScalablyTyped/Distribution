package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestOptions extends StObject {
  
  var att: js.UndefOr[String] = js.native
  
  var body: js.UndefOr[js.Any] = js.native
  
  var content_type: js.UndefOr[String] = js.native
  
  var db: js.UndefOr[String] = js.native
  
  var doc: js.UndefOr[String] = js.native
  
  var encoding: js.UndefOr[String] = js.native
  
  var headers: js.UndefOr[js.Any] = js.native
  
  var method: js.UndefOr[String] = js.native
  
  var multipart: js.UndefOr[js.Array[_]] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var qs: js.UndefOr[js.Any] = js.native
}
object RequestOptions {
  
  @scala.inline
  def apply(): RequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestOptions]
  }
  
  @scala.inline
  implicit class RequestOptionsMutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAtt(value: String): Self = StObject.set(x, "att", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttUndefined: Self = StObject.set(x, "att", js.undefined)
    
    @scala.inline
    def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent_typeUndefined: Self = StObject.set(x, "content_type", js.undefined)
    
    @scala.inline
    def setDb(value: String): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbUndefined: Self = StObject.set(x, "db", js.undefined)
    
    @scala.inline
    def setDoc(value: String): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocUndefined: Self = StObject.set(x, "doc", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setMultipart(value: js.Array[_]): Self = StObject.set(x, "multipart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipartUndefined: Self = StObject.set(x, "multipart", js.undefined)
    
    @scala.inline
    def setMultipartVarargs(value: js.Any*): Self = StObject.set(x, "multipart", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setQs(value: js.Any): Self = StObject.set(x, "qs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQsUndefined: Self = StObject.set(x, "qs", js.undefined)
  }
}
