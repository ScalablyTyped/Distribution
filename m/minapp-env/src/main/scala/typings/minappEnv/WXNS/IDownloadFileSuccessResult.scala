package typings.minappEnv.WXNS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDownloadFileSuccessResult extends CommonAPIResult {
  
  var statusCode: Double = js.native
  
  var tempFilePath: String = js.native
}
object IDownloadFileSuccessResult {
  
  @scala.inline
  def apply(errMsg: String, statusCode: Double, tempFilePath: String): IDownloadFileSuccessResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], tempFilePath = tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDownloadFileSuccessResult]
  }
  
  @scala.inline
  implicit class IDownloadFileSuccessResultMutableBuilder[Self <: IDownloadFileSuccessResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempFilePath(value: String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
  }
}
