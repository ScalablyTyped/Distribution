package typings.officeJs.Visio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DataVisualizerDiagramOperationType extends StObject
/**
  *
  * Type of the Data Visualizer Diagram operation
  *
  * [Api set:  1.1]
  */
@JSGlobal("Visio.DataVisualizerDiagramOperationType")
@js.native
object DataVisualizerDiagramOperationType extends StObject {
  
  /**
    *
    * Creation operation.
    *
    */
  @js.native
  sealed trait create
    extends StObject
       with DataVisualizerDiagramOperationType
  
  /**
    *
    * Delete the diagram content.
    *
    */
  @js.native
  sealed trait delete
    extends StObject
       with DataVisualizerDiagramOperationType
  
  /**
    *
    * unknown operation type.
    *
    */
  @js.native
  sealed trait unknown
    extends StObject
       with DataVisualizerDiagramOperationType
  
  /**
    *
    * Update both data and mappings.
    *
    */
  @js.native
  sealed trait update
    extends StObject
       with DataVisualizerDiagramOperationType
  
  /**
    *
    * Update data associated with diagram.
    *
    */
  @js.native
  sealed trait updateData
    extends StObject
       with DataVisualizerDiagramOperationType
  
  /**
    *
    * Update Mappings operation.
    *
    */
  @js.native
  sealed trait updateMappings
    extends StObject
       with DataVisualizerDiagramOperationType
}
