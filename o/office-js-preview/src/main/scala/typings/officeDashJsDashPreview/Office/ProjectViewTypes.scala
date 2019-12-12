package typings.officeDashJsDashPreview.Office

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJsDashPreview.Office.ProjectViewTypes.Calendar
import typings.officeDashJsDashPreview.Office.ProjectViewTypes.Gantt
import typings.officeDashJsDashPreview.Office.ProjectViewTypes.NetworkDiagram
import typings.officeDashJsDashPreview.Office.ProjectViewTypes.ResourceForm
import typings.officeDashJsDashPreview.Office.ProjectViewTypes.ResourceGraph
import typings.officeDashJsDashPreview.Office.ProjectViewTypes.ResourceNames
import typings.officeDashJsDashPreview.Office.ProjectViewTypes.ResourceSheet
import typings.officeDashJsDashPreview.Office.ProjectViewTypes.ResourceUsage
import typings.officeDashJsDashPreview.Office.ProjectViewTypes.TaskDetails
import typings.officeDashJsDashPreview.Office.ProjectViewTypes.TaskDiagram
import typings.officeDashJsDashPreview.Office.ProjectViewTypes.TaskForm
import typings.officeDashJsDashPreview.Office.ProjectViewTypes.TaskNameForm
import typings.officeDashJsDashPreview.Office.ProjectViewTypes.TaskSheet
import typings.officeDashJsDashPreview.Office.ProjectViewTypes.TaskUsage
import typings.officeDashJsDashPreview.Office.ProjectViewTypes.TeamPlanner
import typings.officeDashJsDashPreview.Office.ProjectViewTypes.Timeline
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProjectViewTypes with Double] = js.native
  /* 12 */ @js.native
  object Calendar extends TopLevel[Calendar with Double]
  
  /* 0 */ @js.native
  object Gantt extends TopLevel[Gantt with Double]
  
  /* 1 */ @js.native
  object NetworkDiagram extends TopLevel[NetworkDiagram with Double]
  
  /* 5 */ @js.native
  object ResourceForm extends TopLevel[ResourceForm with Double]
  
  /* 7 */ @js.native
  object ResourceGraph extends TopLevel[ResourceGraph with Double]
  
  /* 11 */ @js.native
  object ResourceNames extends TopLevel[ResourceNames with Double]
  
  /* 6 */ @js.native
  object ResourceSheet extends TopLevel[ResourceSheet with Double]
  
  /* 14 */ @js.native
  object ResourceUsage extends TopLevel[ResourceUsage with Double]
  
  /* 9 */ @js.native
  object TaskDetails extends TopLevel[TaskDetails with Double]
  
  /* 2 */ @js.native
  object TaskDiagram extends TopLevel[TaskDiagram with Double]
  
  /* 3 */ @js.native
  object TaskForm extends TopLevel[TaskForm with Double]
  
  /* 10 */ @js.native
  object TaskNameForm extends TopLevel[TaskNameForm with Double]
  
  /* 4 */ @js.native
  object TaskSheet extends TopLevel[TaskSheet with Double]
  
  /* 13 */ @js.native
  object TaskUsage extends TopLevel[TaskUsage with Double]
  
  /* 8 */ @js.native
  object TeamPlanner extends TopLevel[TeamPlanner with Double]
  
  /* 15 */ @js.native
  object Timeline extends TopLevel[Timeline with Double]
  
}

