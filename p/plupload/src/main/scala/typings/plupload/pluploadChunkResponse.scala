package typings.plupload

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait pluploadChunkResponse
  extends StObject
     with pluploadResponse {
  
  var offset: Double
  
  var total: Double
}
object pluploadChunkResponse {
  
  inline def apply(offset: Double, response: String, responseHeaders: String, status: Double, total: Double): pluploadChunkResponse = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[pluploadChunkResponse]
  }
  
  extension [Self <: pluploadChunkResponse](x: Self) {
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
