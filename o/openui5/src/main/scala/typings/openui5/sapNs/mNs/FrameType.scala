package typings.openui5.sapNs.mNs

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
  
  /* 0 */ val Auto: typings.openui5.sapNs.mNs.FrameType.Auto with Double = js.native
  /* 1 */ val OneByOne: typings.openui5.sapNs.mNs.FrameType.OneByOne with Double = js.native
  /* 2 */ val TwoByOne: typings.openui5.sapNs.mNs.FrameType.TwoByOne with Double = js.native
  /* 3 */ val TwoThirds: typings.openui5.sapNs.mNs.FrameType.TwoThirds with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FrameType with Double] = js.native
}

