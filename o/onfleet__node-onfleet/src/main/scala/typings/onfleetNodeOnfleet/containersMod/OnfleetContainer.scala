package typings.onfleetNodeOnfleet.containersMod

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.ORGANIZATION
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.TEAM
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.WORKER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnfleetContainer extends js.Object {
  
  var activeTask: String | Null = js.native
  
  var id: String = js.native
  
  var organization: String = js.native
  
  var tasks: js.Array[String] = js.native
  
  var timeCreated: Double = js.native
  
  var timeLastModified: Double = js.native
  
  var `type`: ORGANIZATION | TEAM | WORKER = js.native
  
  var worker: String = js.native
}
object OnfleetContainer {
  
  @scala.inline
  def apply(
    id: String,
    organization: String,
    tasks: js.Array[String],
    timeCreated: Double,
    timeLastModified: Double,
    `type`: ORGANIZATION | TEAM | WORKER,
    worker: String
  ): OnfleetContainer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeLastModified = timeLastModified.asInstanceOf[js.Any], worker = worker.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnfleetContainer]
  }
  
  @scala.inline
  implicit class OnfleetContainerOps[Self <: OnfleetContainer] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganization(value: String): Self = this.set("organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTasksVarargs(value: String*): Self = this.set("tasks", js.Array(value :_*))
    
    @scala.inline
    def setTasks(value: js.Array[String]): Self = this.set("tasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeCreated(value: Double): Self = this.set("timeCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeLastModified(value: Double): Self = this.set("timeLastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ORGANIZATION | TEAM | WORKER): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorker(value: String): Self = this.set("worker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveTask(value: String): Self = this.set("activeTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveTaskNull: Self = this.set("activeTask", null)
  }
}
