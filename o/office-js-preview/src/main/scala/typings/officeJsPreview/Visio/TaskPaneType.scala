package typings.officeJsPreview.Visio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskPaneType extends StObject
/**
  *
  * TaskPaneType represents the types of the First Party TaskPanes that are supported by Host through APIs. Used in case of Show TaskPane API/ TaskPane State Changed Event etc
  *
  * [Api set:  1.1]
  */
@JSGlobal("Visio.TaskPaneType")
@js.native
object TaskPaneType extends StObject {
  
  /**
    *
    * Data Visualizer Organisation Mapping Pane
    *
    */
  @js.native
  sealed trait dataVisualizerOrgChartMappings
    extends StObject
       with TaskPaneType
  
  /**
    *
    * Data Visualizer Process Mapping Pane
    *
    */
  @js.native
  sealed trait dataVisualizerProcessMappings
    extends StObject
       with TaskPaneType
  
  /**
    *
    * None Type
    *
    */
  @js.native
  sealed trait none
    extends StObject
       with TaskPaneType
}
