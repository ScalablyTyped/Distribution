package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProjectViewTypes extends js.Object

/**
  * Specifies the types of views that the {@link Office.Document | Document}.getSelectedViewAsync method can recognize.
  *
  * @remarks
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
  sealed trait Calendar
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectViewTypes
  
  /**
    * The Gantt chart view.
    */
  @js.native
  sealed trait Gantt
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectViewTypes
  
  /**
    * The Network Diagram view.
    */
  @js.native
  sealed trait NetworkDiagram
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectViewTypes
  
  /**
    * The Resource Form view.
    */
  @js.native
  sealed trait ResourceForm
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectViewTypes
  
  /**
    * The Resource Graph view.
    */
  @js.native
  sealed trait ResourceGraph
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectViewTypes
  
  /**
    * The Resource Names view.
    */
  @js.native
  sealed trait ResourceNames
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectViewTypes
  
  /**
    * The Resource Sheet view.
    */
  @js.native
  sealed trait ResourceSheet
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectViewTypes
  
  /**
    * The Resource Usage view.
    */
  @js.native
  sealed trait ResourceUsage
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectViewTypes
  
  /**
    * The Task Details view.
    */
  @js.native
  sealed trait TaskDetails
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectViewTypes
  
  /**
    * The Task Diagram view.
    */
  @js.native
  sealed trait TaskDiagram
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectViewTypes
  
  /**
    * The Task form view.
    */
  @js.native
  sealed trait TaskForm
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectViewTypes
  
  /**
    * The Task Name Form view.
    */
  @js.native
  sealed trait TaskNameForm
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectViewTypes
  
  /**
    * The Task Sheet view.
    */
  @js.native
  sealed trait TaskSheet
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectViewTypes
  
  /**
    * The Task Usage view.
    */
  @js.native
  sealed trait TaskUsage
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectViewTypes
  
  /**
    * The Team Planner view.
    */
  @js.native
  sealed trait TeamPlanner
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectViewTypes
  
  /**
    * The Timeline view.
    */
  @js.native
  sealed trait Timeline
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectViewTypes
  
  /* 12 */ val Calendar: Calendar with scala.Double = js.native
  /* 0 */ val Gantt: Gantt with scala.Double = js.native
  /* 1 */ val NetworkDiagram: NetworkDiagram with scala.Double = js.native
  /* 5 */ val ResourceForm: ResourceForm with scala.Double = js.native
  /* 7 */ val ResourceGraph: ResourceGraph with scala.Double = js.native
  /* 11 */ val ResourceNames: ResourceNames with scala.Double = js.native
  /* 6 */ val ResourceSheet: ResourceSheet with scala.Double = js.native
  /* 14 */ val ResourceUsage: ResourceUsage with scala.Double = js.native
  /* 9 */ val TaskDetails: TaskDetails with scala.Double = js.native
  /* 2 */ val TaskDiagram: TaskDiagram with scala.Double = js.native
  /* 3 */ val TaskForm: TaskForm with scala.Double = js.native
  /* 10 */ val TaskNameForm: TaskNameForm with scala.Double = js.native
  /* 4 */ val TaskSheet: TaskSheet with scala.Double = js.native
  /* 13 */ val TaskUsage: TaskUsage with scala.Double = js.native
  /* 8 */ val TeamPlanner: TeamPlanner with scala.Double = js.native
  /* 15 */ val Timeline: Timeline with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[officeDashJsDashPreviewLib.OfficeNs.ProjectViewTypes with scala.Double] = js.native
}

