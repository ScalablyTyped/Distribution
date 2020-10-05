package typings.node.inspectorMod.NodeWorker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReceivedMessageFromWorkerEventDataType extends js.Object {
  var message: String = js.native
  /**
    * Identifier of a session which sends a message.
    */
  var sessionId: SessionID = js.native
}

object ReceivedMessageFromWorkerEventDataType {
  @scala.inline
  def apply(message: String, sessionId: SessionID): ReceivedMessageFromWorkerEventDataType = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceivedMessageFromWorkerEventDataType]
  }
  @scala.inline
  implicit class ReceivedMessageFromWorkerEventDataTypeOps[Self <: ReceivedMessageFromWorkerEventDataType] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessionId(value: SessionID): Self = this.set("sessionId", value.asInstanceOf[js.Any])
  }
  
}

