package typings.minappEnv.wx

import typings.minappEnv.ArrayBuffer
import typings.minappEnv.minappEnvStrings.CONNECT
import typings.minappEnv.minappEnvStrings.DELETE
import typings.minappEnv.minappEnvStrings.GET
import typings.minappEnv.minappEnvStrings.HEAD
import typings.minappEnv.minappEnvStrings.OPTIONS
import typings.minappEnv.minappEnvStrings.POST
import typings.minappEnv.minappEnvStrings.PUT
import typings.minappEnv.minappEnvStrings.TRACE
import typings.minappEnv.minappEnvStrings.arraybuffer_
import typings.minappEnv.minappEnvStrings.json_
import typings.minappEnv.minappEnvStrings.text
import typings.minappEnv.minappEnvStrings.其他
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[RequestCompleteCallback] = js.undefined
  
  /** 请求的参数 */
  var data: js.UndefOr[String | js.Object | ArrayBuffer] = js.undefined
  
  /** 返回的数据格式
    *
    * 可选值：
    * - 'json': 返回的数据为 JSON，返回后会对返回的数据进行一次 JSON.parse;
    * - '其他': 不对返回的内容进行 JSON.parse; */
  var dataType: js.UndefOr[json_ | 其他] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[RequestFailCallback] = js.undefined
  
  /** 设置请求的 header，header 中不能设置 Referer。
    *
    * `content-type` 默认为 `application/json` */
  var header: js.UndefOr[js.Object] = js.undefined
  
  /** HTTP 请求方法
    *
    * 可选值：
    * - 'OPTIONS': HTTP 请求 OPTIONS;
    * - 'GET': HTTP 请求 GET;
    * - 'HEAD': HTTP 请求 HEAD;
    * - 'POST': HTTP 请求 POST;
    * - 'PUT': HTTP 请求 PUT;
    * - 'DELETE': HTTP 请求 DELETE;
    * - 'TRACE': HTTP 请求 TRACE;
    * - 'CONNECT': HTTP 请求 CONNECT; */
  var method: js.UndefOr[OPTIONS | GET | HEAD | POST | PUT | DELETE | TRACE | CONNECT] = js.undefined
  
  /** 响应的数据类型
    *
    * 可选值：
    * - 'text': 响应的数据为文本;
    * - 'arraybuffer': 响应的数据为 ArrayBuffer;
    *
    * 最低基础库： `1.7.0` */
  var responseType: js.UndefOr[text | arraybuffer_] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[RequestSuccessCallback] = js.undefined
  
  /** 开发者服务器接口地址 */
  var url: String
}
object RequestOption {
  
  @scala.inline
  def apply(url: String): RequestOption = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOption]
  }
  
  @scala.inline
  implicit class RequestOptionMutableBuilder[Self <: RequestOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setData(value: String | js.Object | ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataType(value: json_ | 其他): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setHeader(value: js.Object): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setMethod(value: OPTIONS | GET | HEAD | POST | PUT | DELETE | TRACE | CONNECT): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setResponseType(value: text | arraybuffer_): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* result */ RequestSuccessCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
