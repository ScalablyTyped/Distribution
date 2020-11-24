package typings.nodeResque.anon

import typings.nodeResque.mod.Job
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTimestamp extends js.Object {
  
  var rTimestamp: Double = js.native
  
  var tasks: js.Array[Job[_]] = js.native
}
object RTimestamp {
  
  @scala.inline
  def apply(rTimestamp: Double, tasks: js.Array[Job[_]]): RTimestamp = {
    val __obj = js.Dynamic.literal(rTimestamp = rTimestamp.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTimestamp]
  }
  
  @scala.inline
  implicit class RTimestampOps[Self <: RTimestamp] (val x: Self) extends AnyVal {
    
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
    def setRTimestamp(value: Double): Self = this.set("rTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTasksVarargs(value: Job[js.Any]*): Self = this.set("tasks", js.Array(value :_*))
    
    @scala.inline
    def setTasks(value: js.Array[Job[_]]): Self = this.set("tasks", value.asInstanceOf[js.Any])
  }
}
