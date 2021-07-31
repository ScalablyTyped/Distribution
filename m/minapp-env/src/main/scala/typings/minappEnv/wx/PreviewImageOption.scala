package typings.minappEnv.wx

import typings.minappEnv.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreviewImageOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[PreviewImageCompleteCallback] = js.undefined
  
  /** 当前显示图片的链接 */
  var current: js.UndefOr[String] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[PreviewImageFailCallback] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[PreviewImageSuccessCallback] = js.undefined
  
  /** 需要预览的图片链接列表。{% version('2.2.3') %} 起支持云文件ID。 */
  var urls: Array[String]
}
object PreviewImageOption {
  
  @scala.inline
  def apply(urls: Array[String]): PreviewImageOption = {
    val __obj = js.Dynamic.literal(urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewImageOption]
  }
  
  @scala.inline
  implicit class PreviewImageOptionMutableBuilder[Self <: PreviewImageOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setCurrent(value: String): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setUrls(value: Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
  }
}
