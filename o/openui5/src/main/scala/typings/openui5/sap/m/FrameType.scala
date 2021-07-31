package typings.openui5.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FrameType extends StObject
/**
  * Enum for possible frame size types for sap.m.DynamicContent and sap.m.GenricTile control.
  */
@JSGlobal("sap.m.FrameType")
@js.native
object FrameType extends StObject {
  
  @js.native
  sealed trait Auto
    extends StObject
       with FrameType
  
  @js.native
  sealed trait OneByOne
    extends StObject
       with FrameType
  
  @js.native
  sealed trait TwoByOne
    extends StObject
       with FrameType
  
  @js.native
  sealed trait TwoThirds
    extends StObject
       with FrameType
}
