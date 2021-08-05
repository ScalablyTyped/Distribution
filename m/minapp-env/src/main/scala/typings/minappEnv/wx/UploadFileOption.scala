package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadFileOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[UploadFileCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[UploadFileFailCallback] = js.undefined
  
  /** 要上传文件资源的路径 */
  var filePath: String
  
  /** HTTP 请求中其他额外的 form data */
  var formData: js.UndefOr[js.Object] = js.undefined
  
  /** HTTP 请求 Header，Header 中不能设置 Referer */
  var header: js.UndefOr[js.Object] = js.undefined
  
  /** 文件对应的 key，开发者在服务端可以通过这个 key 获取文件的二进制内容 */
  var name: String
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[UploadFileSuccessCallback] = js.undefined
  
  /** 开发者服务器地址 */
  var url: String
}
object UploadFileOption {
  
  inline def apply(filePath: String, name: String, url: String): UploadFileOption = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadFileOption]
  }
  
  extension [Self <: UploadFileOption](x: Self) {
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFormData(value: js.Object): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    inline def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
    
    inline def setHeader(value: js.Object): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* result */ UploadFileSuccessCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
