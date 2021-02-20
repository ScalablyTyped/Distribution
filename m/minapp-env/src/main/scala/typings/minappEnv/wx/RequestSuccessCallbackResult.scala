package typings.minappEnv.wx

import typings.minappEnv.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestSuccessCallbackResult extends StObject {
  
  /** 开发者服务器返回的数据 */
  var data: String | js.Object | ArrayBuffer = js.native
  
  /** 开发者服务器返回的 HTTP Response Header
    *
    * 最低基础库： `1.2.0` */
  var header: js.Object = js.native
  
  /** 开发者服务器返回的 HTTP 状态码 */
  var statusCode: Double = js.native
}
object RequestSuccessCallbackResult {
  
  @scala.inline
  def apply(data: String | js.Object | ArrayBuffer, header: js.Object, statusCode: Double): RequestSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class RequestSuccessCallbackResultMutableBuilder[Self <: RequestSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String | js.Object | ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: js.Object): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
