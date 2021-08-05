package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskAssistant extends StObject {
  
  def provideTasks(): AssistantArray[Task]
}
object TaskAssistant {
  
  inline def apply(provideTasks: () => AssistantArray[Task]): TaskAssistant = {
    val __obj = js.Dynamic.literal(provideTasks = js.Any.fromFunction0(provideTasks))
    __obj.asInstanceOf[TaskAssistant]
  }
  
  extension [Self <: TaskAssistant](x: Self) {
    
    inline def setProvideTasks(value: () => AssistantArray[Task]): Self = StObject.set(x, "provideTasks", js.Any.fromFunction0(value))
  }
}
