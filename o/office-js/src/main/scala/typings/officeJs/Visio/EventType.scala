package typings.officeJs.Visio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventType extends StObject
/**
  *
  * EventType represents the type of the events Host supports
  *
  * [Api set:  1.1]
  */
@JSGlobal("Visio.EventType")
@js.native
object EventType extends StObject {
  
  /**
    *
    * DataVisualizer diagram operation complete Event
    *
    */
  @js.native
  sealed trait dataVisualizerDiagramOperationCompleted
    extends StObject
       with EventType
}
