package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowModalSuccessCallbackResult extends StObject {
  
  /** 为 true 时，表示用户点击了取消（用于 Android 系统区分点击蒙层关闭还是点击取消按钮关闭）
    *
    * 最低基础库： `1.1.0` */
  var cancel: Boolean
  
  /** 为 true 时，表示用户点击了确定按钮 */
  var confirm: Boolean
}
object ShowModalSuccessCallbackResult {
  
  inline def apply(cancel: Boolean, confirm: Boolean): ShowModalSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], confirm = confirm.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowModalSuccessCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShowModalSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setConfirm(value: Boolean): Self = StObject.set(x, "confirm", value.asInstanceOf[js.Any])
  }
}
