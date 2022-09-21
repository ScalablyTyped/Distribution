package typings.officeJsPreview.Visio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DataVisualizerDiagramType extends StObject
/**
  *
  * DiagramType for Data Visualizer diagrams
  *
  * [Api set:  1.1]
  */
@JSGlobal("Visio.DataVisualizerDiagramType")
@js.native
object DataVisualizerDiagramType extends StObject {
  
  /**
    *
    * Audit
    *
    */
  @js.native
  sealed trait audit
    extends StObject
       with DataVisualizerDiagramType
  
  /**
    *
    * Basic Flowchart
    *
    */
  @js.native
  sealed trait basicFlowchart
    extends StObject
       with DataVisualizerDiagramType
  
  /**
    *
    * Horizontal Cross-Functional Flowchart
    *
    */
  @js.native
  sealed trait crossFunctionalFlowchart_Horizontal
    extends StObject
       with DataVisualizerDiagramType
  
  /**
    *
    * Vertical Cross-Functional Flowchart
    *
    */
  @js.native
  sealed trait crossFunctionalFlowchart_Vertical
    extends StObject
       with DataVisualizerDiagramType
  
  /**
    *
    * Network
    *
    */
  @js.native
  sealed trait network
    extends StObject
       with DataVisualizerDiagramType
  
  /**
    *
    * OrgChart
    *
    */
  @js.native
  sealed trait orgChart
    extends StObject
       with DataVisualizerDiagramType
  
  /**
    *
    * Unknown
    *
    */
  @js.native
  sealed trait unknown
    extends StObject
       with DataVisualizerDiagramType
}
