package typings.node.inspectorMod.NodeWorker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachedToWorkerEventDataType extends js.Object {
  
  /**
    * Identifier assigned to the session used to send/receive messages.
    */
  var sessionId: SessionID = js.native
  
  var waitingForDebugger: Boolean = js.native
  
  var workerInfo: WorkerInfo = js.native
}
object AttachedToWorkerEventDataType {
  
  @scala.inline
  def apply(sessionId: SessionID, waitingForDebugger: Boolean, workerInfo: WorkerInfo): AttachedToWorkerEventDataType = {
    val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any], waitingForDebugger = waitingForDebugger.asInstanceOf[js.Any], workerInfo = workerInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachedToWorkerEventDataType]
  }
  
  @scala.inline
  implicit class AttachedToWorkerEventDataTypeOps[Self <: AttachedToWorkerEventDataType] (val x: Self) extends AnyVal {
    
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
    def setSessionId(value: SessionID): Self = this.set("sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitingForDebugger(value: Boolean): Self = this.set("waitingForDebugger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerInfo(value: WorkerInfo): Self = this.set("workerInfo", value.asInstanceOf[js.Any])
  }
}
