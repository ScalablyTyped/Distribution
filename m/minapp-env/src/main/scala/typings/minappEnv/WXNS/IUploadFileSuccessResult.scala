package typings.minappEnv.WXNS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUploadFileSuccessResult
  extends StObject
     with CommonAPIResult {
  
  var data: String
  
  var statusCode: Double
}
object IUploadFileSuccessResult {
  
  inline def apply(data: String, errMsg: String, statusCode: Double): IUploadFileSuccessResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUploadFileSuccessResult]
  }
  
  extension [Self <: IUploadFileSuccessResult](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
