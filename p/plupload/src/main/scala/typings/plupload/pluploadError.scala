package typings.plupload

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait pluploadError
  extends StObject
     with pluploadResponse {
  
  var code: Double
  
  var file: js.Any
  
  var message: String
}
object pluploadError {
  
  @scala.inline
  def apply(
    code: Double,
    file: js.Any,
    message: String,
    response: String,
    responseHeaders: String,
    status: Double
  ): pluploadError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[pluploadError]
  }
  
  @scala.inline
  implicit class pluploadErrorMutableBuilder[Self <: pluploadError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile(value: js.Any): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
