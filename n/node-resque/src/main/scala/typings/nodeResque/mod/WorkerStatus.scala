package typings.nodeResque.mod

import typings.nodeResque.anon.Args
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkerStatus extends js.Object {
  
  var payload: Args = js.native
  
  var queue: String = js.native
  
  var run_at: String = js.native
  
  var worker: String = js.native
}
object WorkerStatus {
  
  @scala.inline
  def apply(payload: Args, queue: String, run_at: String, worker: String): WorkerStatus = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], run_at = run_at.asInstanceOf[js.Any], worker = worker.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerStatus]
  }
  
  @scala.inline
  implicit class WorkerStatusOps[Self <: WorkerStatus] (val x: Self) extends AnyVal {
    
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
    def setPayload(value: Args): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueue(value: String): Self = this.set("queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRun_at(value: String): Self = this.set("run_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorker(value: String): Self = this.set("worker", value.asInstanceOf[js.Any])
  }
}
