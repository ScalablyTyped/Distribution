package typings.minappEnv.wx

import typings.minappEnv.Array
import typings.minappEnv.minappEnvStrings.album
import typings.minappEnv.minappEnvStrings.camera
import typings.minappEnv.minappEnvStrings.compressed
import typings.minappEnv.minappEnvStrings.original
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChooseImageOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ChooseImageCompleteCallback] = js.undefined
  
  /** 最多可以选择的图片张数 */
  var count: js.UndefOr[Double] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ChooseImageFailCallback] = js.undefined
  
  /** 所选的图片的尺寸
    *
    * 可选值：
    * - 'original': 原图;
    * - 'compressed': 压缩图; */
  var sizeType: js.UndefOr[Array[original | compressed]] = js.undefined
  
  /** 选择图片的来源
    *
    * 可选值：
    * - 'album': 从相册选图;
    * - 'camera': 使用相机; */
  var sourceType: js.UndefOr[Array[album | camera]] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ChooseImageSuccessCallback] = js.undefined
}
object ChooseImageOption {
  
  @scala.inline
  def apply(): ChooseImageOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseImageOption]
  }
  
  @scala.inline
  implicit class ChooseImageOptionMutableBuilder[Self <: ChooseImageOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setSizeType(value: Array[original | compressed]): Self = StObject.set(x, "sizeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeTypeUndefined: Self = StObject.set(x, "sizeType", js.undefined)
    
    @scala.inline
    def setSourceType(value: Array[album | camera]): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* result */ ChooseImageSuccessCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
