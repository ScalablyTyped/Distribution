package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TakePhotoSuccessCallbackResult extends js.Object {
  
  /** 照片文件的临时路径 */
  var tempImagePath: String = js.native
}
object TakePhotoSuccessCallbackResult {
  
  @scala.inline
  def apply(tempImagePath: String): TakePhotoSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(tempImagePath = tempImagePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[TakePhotoSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class TakePhotoSuccessCallbackResultOps[Self <: TakePhotoSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTempImagePath(value: String): Self = this.set("tempImagePath", value.asInstanceOf[js.Any])
  }
}
