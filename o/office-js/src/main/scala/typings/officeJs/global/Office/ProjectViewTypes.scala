package typings.officeJs.global.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the types of views that the {@link Office.Document | Document}.getSelectedViewAsync method can recognize.
  *
  * @remarks
  * 
  * The {@link Office.Document | Document}.getSelectedViewAsync method returns the ProjectViewTypes constant value and name that corresponds to the 
  * active view.
  */
@JSGlobal("Office.ProjectViewTypes")
@js.native
object ProjectViewTypes extends js.Object {
  /* 12 */ val Calendar: typings.officeJs.Office.ProjectViewTypes.Calendar with Double = js.native
  /* 0 */ val Gantt: typings.officeJs.Office.ProjectViewTypes.Gantt with Double = js.native
  /* 1 */ val NetworkDiagram: typings.officeJs.Office.ProjectViewTypes.NetworkDiagram with Double = js.native
  /* 5 */ val ResourceForm: typings.officeJs.Office.ProjectViewTypes.ResourceForm with Double = js.native
  /* 7 */ val ResourceGraph: typings.officeJs.Office.ProjectViewTypes.ResourceGraph with Double = js.native
  /* 11 */ val ResourceNames: typings.officeJs.Office.ProjectViewTypes.ResourceNames with Double = js.native
  /* 6 */ val ResourceSheet: typings.officeJs.Office.ProjectViewTypes.ResourceSheet with Double = js.native
  /* 14 */ val ResourceUsage: typings.officeJs.Office.ProjectViewTypes.ResourceUsage with Double = js.native
  /* 9 */ val TaskDetails: typings.officeJs.Office.ProjectViewTypes.TaskDetails with Double = js.native
  /* 2 */ val TaskDiagram: typings.officeJs.Office.ProjectViewTypes.TaskDiagram with Double = js.native
  /* 3 */ val TaskForm: typings.officeJs.Office.ProjectViewTypes.TaskForm with Double = js.native
  /* 10 */ val TaskNameForm: typings.officeJs.Office.ProjectViewTypes.TaskNameForm with Double = js.native
  /* 4 */ val TaskSheet: typings.officeJs.Office.ProjectViewTypes.TaskSheet with Double = js.native
  /* 13 */ val TaskUsage: typings.officeJs.Office.ProjectViewTypes.TaskUsage with Double = js.native
  /* 8 */ val TeamPlanner: typings.officeJs.Office.ProjectViewTypes.TeamPlanner with Double = js.native
  /* 15 */ val Timeline: typings.officeJs.Office.ProjectViewTypes.Timeline with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.officeJs.Office.ProjectViewTypes with Double] = js.native
}

