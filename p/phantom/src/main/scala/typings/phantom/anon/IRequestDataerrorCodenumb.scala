package typings.phantom.anon

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined phantom.phantom.IRequestData & {  errorCode :number,   errorString :string} */
trait IRequestDataerrorCodenumb extends StObject {
  
  var errorCode: Double
  
  var errorString: String
  
  var headers: js.Array[Name]
  
  var id: Double
  
  var method: String
  
  var time: Date
  
  var url: String
}
object IRequestDataerrorCodenumb {
  
  @scala.inline
  def apply(
    errorCode: Double,
    errorString: String,
    headers: js.Array[Name],
    id: Double,
    method: String,
    time: Date,
    url: String
  ): IRequestDataerrorCodenumb = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorString = errorString.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRequestDataerrorCodenumb]
  }
  
  @scala.inline
  implicit class IRequestDataerrorCodenumbMutableBuilder[Self <: IRequestDataerrorCodenumb] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorString(value: String): Self = StObject.set(x, "errorString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Array[Name]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersVarargs(value: Name*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
