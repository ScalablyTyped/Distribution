package typings.minappEnv.WXNS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDownloadFileSuccessResult
  extends StObject
     with CommonAPIResult {
  
  var statusCode: Double
  
  var tempFilePath: String
}
object IDownloadFileSuccessResult {
  
  inline def apply(errMsg: String, statusCode: Double, tempFilePath: String): IDownloadFileSuccessResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], tempFilePath = tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDownloadFileSuccessResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDownloadFileSuccessResult] (val x: Self) extends AnyVal {
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setTempFilePath(value: String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
  }
}
