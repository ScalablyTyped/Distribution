package typings.officeJsPreview.Visio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DataVisualizerDiagramResultType extends StObject
/**
  *
  * Result of Data Visualizer Diagram operations.
  *
  * [Api set:  1.1]
  */
@JSGlobal("Visio.DataVisualizerDiagramResultType")
@js.native
object DataVisualizerDiagramResultType extends StObject {
  
  /**
    *
    * Conflict error in operation.
    *
    */
  @js.native
  sealed trait conflictError
    extends StObject
       with DataVisualizerDiagramResultType
  
  /**
    *
    * Operation is success.
    *
    */
  @js.native
  sealed trait success
    extends StObject
       with DataVisualizerDiagramResultType
  
  /**
    *
    * Unexpected error during operation.
    *
    */
  @js.native
  sealed trait unexpected
    extends StObject
       with DataVisualizerDiagramResultType
  
  /**
    *
    * Validation error in operation.
    *
    */
  @js.native
  sealed trait validationError
    extends StObject
       with DataVisualizerDiagramResultType
}
