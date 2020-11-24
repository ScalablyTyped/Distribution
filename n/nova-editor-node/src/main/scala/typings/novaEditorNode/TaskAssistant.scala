package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskAssistant extends js.Object {
  
  def provideTasks(): AssistantArray[Task] = js.native
}
object TaskAssistant {
  
  @scala.inline
  def apply(provideTasks: () => AssistantArray[Task]): TaskAssistant = {
    val __obj = js.Dynamic.literal(provideTasks = js.Any.fromFunction0(provideTasks))
    __obj.asInstanceOf[TaskAssistant]
  }
  
  @scala.inline
  implicit class TaskAssistantOps[Self <: TaskAssistant] (val x: Self) extends AnyVal {
    
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
    def setProvideTasks(value: () => AssistantArray[Task]): Self = this.set("provideTasks", js.Any.fromFunction0(value))
  }
}
