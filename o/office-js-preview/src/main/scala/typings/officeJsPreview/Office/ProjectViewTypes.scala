package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProjectViewTypes extends StObject
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
object ProjectViewTypes extends StObject {
  
  /**
    * The Calendar view.
    */
  @js.native
  sealed trait Calendar
    extends StObject
       with ProjectViewTypes
  
  /**
    * The Gantt chart view.
    */
  @js.native
  sealed trait Gantt
    extends StObject
       with ProjectViewTypes
  
  /**
    * The Network Diagram view.
    */
  @js.native
  sealed trait NetworkDiagram
    extends StObject
       with ProjectViewTypes
  
  /**
    * The Resource Form view.
    */
  @js.native
  sealed trait ResourceForm
    extends StObject
       with ProjectViewTypes
  
  /**
    * The Resource Graph view.
    */
  @js.native
  sealed trait ResourceGraph
    extends StObject
       with ProjectViewTypes
  
  /**
    * The Resource Names view.
    */
  @js.native
  sealed trait ResourceNames
    extends StObject
       with ProjectViewTypes
  
  /**
    * The Resource Sheet view.
    */
  @js.native
  sealed trait ResourceSheet
    extends StObject
       with ProjectViewTypes
  
  /**
    * The Resource Usage view.
    */
  @js.native
  sealed trait ResourceUsage
    extends StObject
       with ProjectViewTypes
  
  /**
    * The Task Details view.
    */
  @js.native
  sealed trait TaskDetails
    extends StObject
       with ProjectViewTypes
  
  /**
    * The Task Diagram view.
    */
  @js.native
  sealed trait TaskDiagram
    extends StObject
       with ProjectViewTypes
  
  /**
    * The Task form view.
    */
  @js.native
  sealed trait TaskForm
    extends StObject
       with ProjectViewTypes
  
  /**
    * The Task Name Form view.
    */
  @js.native
  sealed trait TaskNameForm
    extends StObject
       with ProjectViewTypes
  
  /**
    * The Task Sheet view.
    */
  @js.native
  sealed trait TaskSheet
    extends StObject
       with ProjectViewTypes
  
  /**
    * The Task Usage view.
    */
  @js.native
  sealed trait TaskUsage
    extends StObject
       with ProjectViewTypes
  
  /**
    * The Team Planner view.
    */
  @js.native
  sealed trait TeamPlanner
    extends StObject
       with ProjectViewTypes
  
  /**
    * The Timeline view.
    */
  @js.native
  sealed trait Timeline
    extends StObject
       with ProjectViewTypes
}
