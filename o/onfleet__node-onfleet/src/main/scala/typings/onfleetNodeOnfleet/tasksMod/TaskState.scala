package typings.onfleetNodeOnfleet.tasksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskState extends StObject
@JSImport("@onfleet/node-onfleet/Resources/Tasks", "TaskState")
@js.native
object TaskState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskState & Double] = js.native
  
  @js.native
  sealed trait Active
    extends StObject
       with TaskState
  /* 2 */ val Active: typings.onfleetNodeOnfleet.tasksMod.TaskState.Active & Double = js.native
  
  @js.native
  sealed trait Assigned
    extends StObject
       with TaskState
  /* 1 */ val Assigned: typings.onfleetNodeOnfleet.tasksMod.TaskState.Assigned & Double = js.native
  
  @js.native
  sealed trait Completed
    extends StObject
       with TaskState
  /* 3 */ val Completed: typings.onfleetNodeOnfleet.tasksMod.TaskState.Completed & Double = js.native
  
  @js.native
  sealed trait Unassigned
    extends StObject
       with TaskState
  /* 0 */ val Unassigned: typings.onfleetNodeOnfleet.tasksMod.TaskState.Unassigned & Double = js.native
}
