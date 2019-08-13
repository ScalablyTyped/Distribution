package typings.officeDashJs.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProjectViewTypes extends js.Object

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
  /**
    * The Calendar view.
    */
  @js.native
  sealed trait Calendar extends ProjectViewTypes
  
  /**
    * The Gantt chart view.
    */
  @js.native
  sealed trait Gantt extends ProjectViewTypes
  
  /**
    * The Network Diagram view.
    */
  @js.native
  sealed trait NetworkDiagram extends ProjectViewTypes
  
  /**
    * The Resource Form view.
    */
  @js.native
  sealed trait ResourceForm extends ProjectViewTypes
  
  /**
    * The Resource Graph view.
    */
  @js.native
  sealed trait ResourceGraph extends ProjectViewTypes
  
  /**
    * The Resource Names view.
    */
  @js.native
  sealed trait ResourceNames extends ProjectViewTypes
  
  /**
    * The Resource Sheet view.
    */
  @js.native
  sealed trait ResourceSheet extends ProjectViewTypes
  
  /**
    * The Resource Usage view.
    */
  @js.native
  sealed trait ResourceUsage extends ProjectViewTypes
  
  /**
    * The Task Details view.
    */
  @js.native
  sealed trait TaskDetails extends ProjectViewTypes
  
  /**
    * The Task Diagram view.
    */
  @js.native
  sealed trait TaskDiagram extends ProjectViewTypes
  
  /**
    * The Task form view.
    */
  @js.native
  sealed trait TaskForm extends ProjectViewTypes
  
  /**
    * The Task Name Form view.
    */
  @js.native
  sealed trait TaskNameForm extends ProjectViewTypes
  
  /**
    * The Task Sheet view.
    */
  @js.native
  sealed trait TaskSheet extends ProjectViewTypes
  
  /**
    * The Task Usage view.
    */
  @js.native
  sealed trait TaskUsage extends ProjectViewTypes
  
  /**
    * The Team Planner view.
    */
  @js.native
  sealed trait TeamPlanner extends ProjectViewTypes
  
  /**
    * The Timeline view.
    */
  @js.native
  sealed trait Timeline extends ProjectViewTypes
  
  /* 12 */ val Calendar: typings.officeDashJs.OfficeNs.ProjectViewTypes.Calendar with Double = js.native
  /* 0 */ val Gantt: typings.officeDashJs.OfficeNs.ProjectViewTypes.Gantt with Double = js.native
  /* 1 */ val NetworkDiagram: typings.officeDashJs.OfficeNs.ProjectViewTypes.NetworkDiagram with Double = js.native
  /* 5 */ val ResourceForm: typings.officeDashJs.OfficeNs.ProjectViewTypes.ResourceForm with Double = js.native
  /* 7 */ val ResourceGraph: typings.officeDashJs.OfficeNs.ProjectViewTypes.ResourceGraph with Double = js.native
  /* 11 */ val ResourceNames: typings.officeDashJs.OfficeNs.ProjectViewTypes.ResourceNames with Double = js.native
  /* 6 */ val ResourceSheet: typings.officeDashJs.OfficeNs.ProjectViewTypes.ResourceSheet with Double = js.native
  /* 14 */ val ResourceUsage: typings.officeDashJs.OfficeNs.ProjectViewTypes.ResourceUsage with Double = js.native
  /* 9 */ val TaskDetails: typings.officeDashJs.OfficeNs.ProjectViewTypes.TaskDetails with Double = js.native
  /* 2 */ val TaskDiagram: typings.officeDashJs.OfficeNs.ProjectViewTypes.TaskDiagram with Double = js.native
  /* 3 */ val TaskForm: typings.officeDashJs.OfficeNs.ProjectViewTypes.TaskForm with Double = js.native
  /* 10 */ val TaskNameForm: typings.officeDashJs.OfficeNs.ProjectViewTypes.TaskNameForm with Double = js.native
  /* 4 */ val TaskSheet: typings.officeDashJs.OfficeNs.ProjectViewTypes.TaskSheet with Double = js.native
  /* 13 */ val TaskUsage: typings.officeDashJs.OfficeNs.ProjectViewTypes.TaskUsage with Double = js.native
  /* 8 */ val TeamPlanner: typings.officeDashJs.OfficeNs.ProjectViewTypes.TeamPlanner with Double = js.native
  /* 15 */ val Timeline: typings.officeDashJs.OfficeNs.ProjectViewTypes.Timeline with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProjectViewTypes with Double] = js.native
}

