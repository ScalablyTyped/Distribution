package typings.meteorSjobs.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Job extends js.Object {
  
  var _id: js.UndefOr[String] = js.native
  
  var arguments: js.Array[_] = js.native
  
  var created: Date = js.native
  
  var data: js.Any = js.native
  
  var due: Date = js.native
  
  var history: js.Array[HistoryItem] = js.native
  
  var name: String = js.native
  
  var priority: Double = js.native
  
  var serverId: String = js.native
  
  var state: JobState = js.native
}
object Job {
  
  @scala.inline
  def apply(
    arguments: js.Array[_],
    created: Date,
    data: js.Any,
    due: Date,
    history: js.Array[HistoryItem],
    name: String,
    priority: Double,
    serverId: String,
    state: JobState
  ): Job = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], due = due.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], serverId = serverId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Job]
  }
  
  @scala.inline
  implicit class JobOps[Self <: Job] (val x: Self) extends AnyVal {
    
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
    def setArgumentsVarargs(value: js.Any*): Self = this.set("arguments", js.Array(value :_*))
    
    @scala.inline
    def setArguments(value: js.Array[_]): Self = this.set("arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated(value: Date): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDue(value: Date): Self = this.set("due", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryVarargs(value: HistoryItem*): Self = this.set("history", js.Array(value :_*))
    
    @scala.inline
    def setHistory(value: js.Array[HistoryItem]): Self = this.set("history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerId(value: String): Self = this.set("serverId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: JobState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_id(value: String): Self = this.set("_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_id: Self = this.set("_id", js.undefined)
  }
}
