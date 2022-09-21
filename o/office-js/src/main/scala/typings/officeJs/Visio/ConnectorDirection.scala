package typings.officeJs.Visio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConnectorDirection extends StObject
/**
  *
  * Direction of connector in DataVisualizer diagram.
  *
  * [Api set:  1.1]
  */
@JSGlobal("Visio.ConnectorDirection")
@js.native
object ConnectorDirection extends StObject {
  
  /**
    *
    * Direction will be from target to source shape.
    *
    */
  @js.native
  sealed trait fromTarget
    extends StObject
       with ConnectorDirection
  
  /**
    *
    * Direction will be from source to target shape.
    *
    */
  @js.native
  sealed trait toTarget
    extends StObject
       with ConnectorDirection
}
