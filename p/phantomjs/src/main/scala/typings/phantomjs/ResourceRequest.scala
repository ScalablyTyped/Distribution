package typings.phantomjs

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceRequest extends StObject {
  
  var headers: StringDictionary[String]
  
  var id: Double
  
  var method: String
  
  var time: Date
  
  var url: String
}
object ResourceRequest {
  
  @scala.inline
  def apply(headers: StringDictionary[String], id: Double, method: String, time: Date, url: String): ResourceRequest = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceRequest]
  }
  
  @scala.inline
  implicit class ResourceRequestMutableBuilder[Self <: ResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
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
