package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskAssistant extends StObject {
  
  def provideTasks(): AssistantArray[Task]
  
  var resolveTaskAction: js.UndefOr[
    js.Function1[
      /* context */ TaskActionResolveContext[Transferrable], 
      ResolvedTaskAction | js.Promise[ResolvedTaskAction]
    ]
  ] = js.undefined
}
object TaskAssistant {
  
  inline def apply(provideTasks: () => AssistantArray[Task]): TaskAssistant = {
    val __obj = js.Dynamic.literal(provideTasks = js.Any.fromFunction0(provideTasks))
    __obj.asInstanceOf[TaskAssistant]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskAssistant] (val x: Self) extends AnyVal {
    
    inline def setProvideTasks(value: () => AssistantArray[Task]): Self = StObject.set(x, "provideTasks", js.Any.fromFunction0(value))
    
    inline def setResolveTaskAction(
      value: /* context */ TaskActionResolveContext[Transferrable] => ResolvedTaskAction | js.Promise[ResolvedTaskAction]
    ): Self = StObject.set(x, "resolveTaskAction", js.Any.fromFunction1(value))
    
    inline def setResolveTaskActionUndefined: Self = StObject.set(x, "resolveTaskAction", js.undefined)
  }
}
