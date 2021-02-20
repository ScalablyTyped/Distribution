package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadFileSuccessCallbackResult extends StObject {
  
  /** 开发者服务器返回的 HTTP 状态码 */
  var statusCode: Double = js.native
  
  /** 临时文件路径。如果没传入 filePath 指定文件存储路径，则下载后的文件会存储到一个临时文件 */
  var tempFilePath: String = js.native
}
object DownloadFileSuccessCallbackResult {
  
  @scala.inline
  def apply(statusCode: Double, tempFilePath: String): DownloadFileSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any], tempFilePath = tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadFileSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class DownloadFileSuccessCallbackResultMutableBuilder[Self <: DownloadFileSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempFilePath(value: String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
  }
}
