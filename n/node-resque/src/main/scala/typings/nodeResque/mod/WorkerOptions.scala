package typings.nodeResque.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkerOptions extends js.Object {
  
  var connection: js.UndefOr[ConnectionOptions] = js.native
  
  var looping: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var queues: js.Array[String] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object WorkerOptions {
  
  @scala.inline
  def apply(queues: js.Array[String]): WorkerOptions = {
    val __obj = js.Dynamic.literal(queues = queues.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerOptions]
  }
  
  @scala.inline
  implicit class WorkerOptionsOps[Self <: WorkerOptions] (val x: Self) extends AnyVal {
    
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
    def setQueuesVarargs(value: String*): Self = this.set("queues", js.Array(value :_*))
    
    @scala.inline
    def setQueues(value: js.Array[String]): Self = this.set("queues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnection(value: ConnectionOptions): Self = this.set("connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnection: Self = this.set("connection", js.undefined)
    
    @scala.inline
    def setLooping(value: Boolean): Self = this.set("looping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLooping: Self = this.set("looping", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
