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
  * 
  * **Support details**
  * 
  * A capital Y in the following matrix indicates that this enumeration is supported in the corresponding Office host application. 
  * An empty cell indicates that the Office host application doesn't support this enumeration.
  * 
  * For more information about Office host application and server requirements, see 
  * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
  * 
  * *Supported hosts, by platform*
  *  <table>
  *   <tr><th>                          </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th></tr>
  *   <tr><td><strong> Project </strong></td><td> Y                          </td><td>                            </td></tr>
  *  </table>
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
  
  val Calendar: Calendar with java.lang.String = js.native
  val Gantt: Gantt with java.lang.String = js.native
  val NetworkDiagram: NetworkDiagram with java.lang.String = js.native
  val ResourceForm: ResourceForm with java.lang.String = js.native
  val ResourceGraph: ResourceGraph with java.lang.String = js.native
  val ResourceNames: ResourceNames with java.lang.String = js.native
  val ResourceSheet: ResourceSheet with java.lang.String = js.native
  val ResourceUsage: ResourceUsage with java.lang.String = js.native
  val TaskDetails: TaskDetails with java.lang.String = js.native
  val TaskDiagram: TaskDiagram with java.lang.String = js.native
  val TaskForm: TaskForm with java.lang.String = js.native
  val TaskNameForm: TaskNameForm with java.lang.String = js.native
  val TaskSheet: TaskSheet with java.lang.String = js.native
  val TaskUsage: TaskUsage with java.lang.String = js.native
  val TeamPlanner: TeamPlanner with java.lang.String = js.native
  val Timeline: Timeline with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.OfficeNs.ProjectViewTypes with java.lang.String] = js.native
}

