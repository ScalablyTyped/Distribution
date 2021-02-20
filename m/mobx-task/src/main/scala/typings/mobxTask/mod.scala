package typings.mobxTask

import typings.mobxTask.taskMod.TaskFactory
import typings.mobxTask.taskMod.Task_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mobx-task", "TaskGroup")
  @js.native
  def TaskGroup[A /* <: js.Array[_] */, R](tasks: js.Array[Task_[A, R]]): typings.mobxTask.taskGroupMod.TaskGroup[A, R] = js.native
  
  /**
    * Creates a task in the `pending` state.
    */
  @JSImport("mobx-task", "task")
  @js.native
  val task: TaskFactory = js.native
}
