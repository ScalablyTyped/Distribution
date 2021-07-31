package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecorderManagerOnErrorCallbackResult extends StObject {
  
  /** 错误信息 */
  var errMsg: String
}
object RecorderManagerOnErrorCallbackResult {
  
  @scala.inline
  def apply(errMsg: String): RecorderManagerOnErrorCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecorderManagerOnErrorCallbackResult]
  }
  
  @scala.inline
  implicit class RecorderManagerOnErrorCallbackResultMutableBuilder[Self <: RecorderManagerOnErrorCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
