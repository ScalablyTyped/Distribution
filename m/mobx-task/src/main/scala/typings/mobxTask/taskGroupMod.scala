package typings.mobxTask

import typings.mobxTask.taskMod.Task_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskGroupMod {
  
  /* Inlined std.Pick<mobx-task.mobx-task/lib/task.Task<A, R>, mobx-task.mobx-task/lib/task-group.QueryableMethods> */
  trait TaskGroup[A /* <: js.Array[js.Any] */, R] extends StObject {
    
    var error: js.UndefOr[js.Any] = js.undefined
    
    var `match`: js.UndefOr[js.Any] = js.undefined
    
    var pending: js.UndefOr[js.Any] = js.undefined
    
    var rejected: js.UndefOr[js.Any] = js.undefined
    
    var resolved: js.UndefOr[js.Any] = js.undefined
    
    var result: js.UndefOr[js.Any] = js.undefined
    
    var state: js.UndefOr[js.Any] = js.undefined
  }
  object TaskGroup {
    
    @JSImport("mobx-task/lib/task-group", "TaskGroup")
    @js.native
    def apply[A /* <: js.Array[js.Any] */, R](tasks: js.Array[Task_[A, R]]): TaskGroup[A, R] = js.native
    
    @scala.inline
    implicit class TaskGroupMutableBuilder[Self <: TaskGroup[?, ?], A /* <: js.Array[js.Any] */, R] (val x: Self & (TaskGroup[A, R])) extends AnyVal {
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setMatch(value: js.Any): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      @scala.inline
      def setPending(value: js.Any): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPendingUndefined: Self = StObject.set(x, "pending", js.undefined)
      
      @scala.inline
      def setRejected(value: js.Any): Self = StObject.set(x, "rejected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectedUndefined: Self = StObject.set(x, "rejected", js.undefined)
      
      @scala.inline
      def setResolved(value: js.Any): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolvedUndefined: Self = StObject.set(x, "resolved", js.undefined)
      
      @scala.inline
      def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      @scala.inline
      def setState(value: js.Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
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
    
    @scala.inline
    def error: typings.mobxTask.mobxTaskStrings.error = "error".asInstanceOf[typings.mobxTask.mobxTaskStrings.error]
    
    @scala.inline
    def `match`: typings.mobxTask.mobxTaskStrings.`match` = "match".asInstanceOf[typings.mobxTask.mobxTaskStrings.`match`]
    
    @scala.inline
    def pending: typings.mobxTask.mobxTaskStrings.pending = "pending".asInstanceOf[typings.mobxTask.mobxTaskStrings.pending]
    
    @scala.inline
    def rejected: typings.mobxTask.mobxTaskStrings.rejected = "rejected".asInstanceOf[typings.mobxTask.mobxTaskStrings.rejected]
    
    @scala.inline
    def resolved: typings.mobxTask.mobxTaskStrings.resolved = "resolved".asInstanceOf[typings.mobxTask.mobxTaskStrings.resolved]
    
    @scala.inline
    def result: typings.mobxTask.mobxTaskStrings.result = "result".asInstanceOf[typings.mobxTask.mobxTaskStrings.result]
    
    @scala.inline
    def state: typings.mobxTask.mobxTaskStrings.state = "state".asInstanceOf[typings.mobxTask.mobxTaskStrings.state]
  }
}
