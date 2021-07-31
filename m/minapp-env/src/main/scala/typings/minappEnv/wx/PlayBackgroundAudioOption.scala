package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayBackgroundAudioOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[PlayBackgroundAudioCompleteCallback] = js.undefined
  
  /** 封面URL */
  var coverImgUrl: js.UndefOr[String] = js.undefined
  
  /** 音乐链接，目前支持的格式有 m4a, aac, mp3, wav */
  var dataUrl: String
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[PlayBackgroundAudioFailCallback] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[PlayBackgroundAudioSuccessCallback] = js.undefined
  
  /** 音乐标题 */
  var title: js.UndefOr[String] = js.undefined
}
object PlayBackgroundAudioOption {
  
  @scala.inline
  def apply(dataUrl: String): PlayBackgroundAudioOption = {
    val __obj = js.Dynamic.literal(dataUrl = dataUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayBackgroundAudioOption]
  }
  
  @scala.inline
  implicit class PlayBackgroundAudioOptionMutableBuilder[Self <: PlayBackgroundAudioOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setCoverImgUrl(value: String): Self = StObject.set(x, "coverImgUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverImgUrlUndefined: Self = StObject.set(x, "coverImgUrl", js.undefined)
    
    @scala.inline
    def setDataUrl(value: String): Self = StObject.set(x, "dataUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
