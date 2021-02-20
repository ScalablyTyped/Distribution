package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkerOnMessageCallbackResult extends StObject {
  
  /** 主线程/Worker 线程向当前线程发送的消息 */
  var message: js.Object = js.native
}
object WorkerOnMessageCallbackResult {
  
  @scala.inline
  def apply(message: js.Object): WorkerOnMessageCallbackResult = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerOnMessageCallbackResult]
  }
  
  @scala.inline
  implicit class WorkerOnMessageCallbackResultMutableBuilder[Self <: WorkerOnMessageCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: js.Object): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
