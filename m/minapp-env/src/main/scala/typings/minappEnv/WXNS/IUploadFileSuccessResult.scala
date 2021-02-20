package typings.minappEnv.WXNS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUploadFileSuccessResult extends CommonAPIResult {
  
  var data: String = js.native
  
  var statusCode: Double = js.native
}
object IUploadFileSuccessResult {
  
  @scala.inline
  def apply(data: String, errMsg: String, statusCode: Double): IUploadFileSuccessResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUploadFileSuccessResult]
  }
  
  @scala.inline
  implicit class IUploadFileSuccessResultMutableBuilder[Self <: IUploadFileSuccessResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
