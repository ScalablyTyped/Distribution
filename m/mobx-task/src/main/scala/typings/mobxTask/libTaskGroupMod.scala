package typings.mobxTask

import typings.mobxTask.libTaskMod.Task_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTaskGroupMod {
  
  /* Inlined std.Pick<mobx-task.mobx-task/lib/task.Task<A, R>, mobx-task.mobx-task/lib/task-group.QueryableMethods> */
  trait TaskGroup[A /* <: js.Array[Any] */, R] extends StObject {
    
    var error: js.UndefOr[Any] = js.undefined
    
    var `match`: js.UndefOr[Any] = js.undefined
    
    var pending: js.UndefOr[Any] = js.undefined
    
    var rejected: js.UndefOr[Any] = js.undefined
    
    var resolved: js.UndefOr[Any] = js.undefined
    
    var result: js.UndefOr[Any] = js.undefined
    
    var state: js.UndefOr[Any] = js.undefined
  }
  object TaskGroup {
    
    @JSImport("mobx-task/lib/task-group", "TaskGroup")
    @js.native
    def apply[A /* <: js.Array[Any] */, R](tasks: js.Array[Task_[A, R]]): TaskGroup[A, R] = js.native
    
    extension [Self <: TaskGroup[?, ?], A /* <: js.Array[Any] */, R](x: Self & (TaskGroup[A, R])) {
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setMatch(value: Any): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      inline def setPending(value: Any): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      inline def setPendingUndefined: Self = StObject.set(x, "pending", js.undefined)
      
      inline def setRejected(value: Any): Self = StObject.set(x, "rejected", value.asInstanceOf[js.Any])
      
      inline def setRejectedUndefined: Self = StObject.set(x, "rejected", js.undefined)
      
      inline def setResolved(value: Any): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
      
      inline def setResolvedUndefined: Self = StObject.set(x, "resolved", js.undefined)
      
      inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mobxTask.mobxTaskStrings.state
    - typings.mobxTask.mobxTaskStrings.pending
    - typings.mobxTask.mobxTaskStrings.resolved
    - typings.mobxTask.mobxTaskStrings.rejected
    - typings.mobxTask.mobxTaskStrings.result
    - typings.mobxTask.mobxTaskStrings.error
    - typings.mobxTask.mobxTaskStrings.`match`
  */
  trait QueryableMethods extends StObject
  object QueryableMethods {
    
    inline def error: typings.mobxTask.mobxTaskStrings.error = "error".asInstanceOf[typings.mobxTask.mobxTaskStrings.error]
    
    inline def `match`: typings.mobxTask.mobxTaskStrings.`match` = "match".asInstanceOf[typings.mobxTask.mobxTaskStrings.`match`]
    
    inline def pending: typings.mobxTask.mobxTaskStrings.pending = "pending".asInstanceOf[typings.mobxTask.mobxTaskStrings.pending]
    
    inline def rejected: typings.mobxTask.mobxTaskStrings.rejected = "rejected".asInstanceOf[typings.mobxTask.mobxTaskStrings.rejected]
    
    inline def resolved: typings.mobxTask.mobxTaskStrings.resolved = "resolved".asInstanceOf[typings.mobxTask.mobxTaskStrings.resolved]
    
    inline def result: typings.mobxTask.mobxTaskStrings.result = "result".asInstanceOf[typings.mobxTask.mobxTaskStrings.result]
    
    inline def state: typings.mobxTask.mobxTaskStrings.state = "state".asInstanceOf[typings.mobxTask.mobxTaskStrings.state]
  }
}
