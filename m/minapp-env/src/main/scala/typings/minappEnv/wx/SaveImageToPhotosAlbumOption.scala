package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaveImageToPhotosAlbumOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[SaveImageToPhotosAlbumCompleteCallback] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[SaveImageToPhotosAlbumFailCallback] = js.native
  
  /** 图片文件路径，可以是临时文件路径或永久文件路径，不支持网络图片路径 */
  var filePath: String = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[SaveImageToPhotosAlbumSuccessCallback] = js.native
}
object SaveImageToPhotosAlbumOption {
  
  @scala.inline
  def apply(filePath: String): SaveImageToPhotosAlbumOption = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveImageToPhotosAlbumOption]
  }
  
  @scala.inline
  implicit class SaveImageToPhotosAlbumOptionMutableBuilder[Self <: SaveImageToPhotosAlbumOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
