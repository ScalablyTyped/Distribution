package typings.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FrameType extends js.Object

/**
  * Enum for possible frame size types for sap.m.DynamicContent and sap.m.GenricTile control.
  */
@JSGlobal("sap.m.FrameType")
@js.native
object FrameType extends js.Object {
  @js.native
  sealed trait Auto extends FrameType
  
  @js.native
  sealed trait OneByOne extends FrameType
  
  @js.native
  sealed trait TwoByOne extends FrameType
  
  @js.native
  sealed trait TwoThirds extends FrameType
  
}

