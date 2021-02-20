package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadFileSuccessCallbackResult extends StObject {
  
  /** 开发者服务器返回的数据 */
  var data: String = js.native
  
  /** 开发者服务器返回的 HTTP 状态码 */
  var statusCode: Double = js.native
}
object UploadFileSuccessCallbackResult {
  
  @scala.inline
  def apply(data: String, statusCode: Double): UploadFileSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadFileSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class UploadFileSuccessCallbackResultMutableBuilder[Self <: UploadFileSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
