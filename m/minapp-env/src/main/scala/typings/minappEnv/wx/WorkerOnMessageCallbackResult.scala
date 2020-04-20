package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerOnMessageCallbackResult extends js.Object {
  /** 主线程/Worker 线程向当前线程发送的消息 */
  var message: js.Object
}

object WorkerOnMessageCallbackResult {
  @scala.inline
  def apply(message: js.Object): WorkerOnMessageCallbackResult = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerOnMessageCallbackResult]
  }
}

