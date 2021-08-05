package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileTransferError extends StObject {
  
  var code: Double
  
  var http_status: Double
  
  var source: String
  
  var target: String
}
object FileTransferError {
  
  inline def apply(code: Double, http_status: Double, source: String, target: String): FileTransferError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], http_status = http_status.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileTransferError]
  }
  
  extension [Self <: FileTransferError](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setHttp_status(value: Double): Self = StObject.set(x, "http_status", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
