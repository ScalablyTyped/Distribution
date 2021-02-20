package typings.plupload

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait pluploadResponse extends StObject {
  
  var response: String = js.native
  
  var responseHeaders: String = js.native
  
  var status: Double = js.native
}
object pluploadResponse {
  
  @scala.inline
  def apply(response: String, responseHeaders: String, status: Double): pluploadResponse = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[pluploadResponse]
  }
  
  @scala.inline
  implicit class pluploadResponseMutableBuilder[Self <: pluploadResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponse(value: String): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseHeaders(value: String): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
