package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileUploadResult extends StObject {
  
  var bytesSent: Double
  
  var response: String
  
  var responseCode: Double
}
object FileUploadResult {
  
  @scala.inline
  def apply(bytesSent: Double, response: String, responseCode: Double): FileUploadResult = {
    val __obj = js.Dynamic.literal(bytesSent = bytesSent.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseCode = responseCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileUploadResult]
  }
  
  @scala.inline
  implicit class FileUploadResultMutableBuilder[Self <: FileUploadResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytesSent(value: Double): Self = StObject.set(x, "bytesSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: String): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseCode(value: Double): Self = StObject.set(x, "responseCode", value.asInstanceOf[js.Any])
  }
}
