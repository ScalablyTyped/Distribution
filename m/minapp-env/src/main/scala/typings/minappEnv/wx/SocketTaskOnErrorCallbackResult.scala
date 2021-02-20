package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SocketTaskOnErrorCallbackResult extends StObject {
  
  /** 错误信息 */
  var errMsg: String = js.native
}
object SocketTaskOnErrorCallbackResult {
  
  @scala.inline
  def apply(errMsg: String): SocketTaskOnErrorCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketTaskOnErrorCallbackResult]
  }
  
  @scala.inline
  implicit class SocketTaskOnErrorCallbackResultMutableBuilder[Self <: SocketTaskOnErrorCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
