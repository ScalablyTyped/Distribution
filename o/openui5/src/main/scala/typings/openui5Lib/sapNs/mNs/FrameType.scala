package typings
package openui5Lib.sapNs.mNs

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
  sealed trait Auto
    extends openui5Lib.sapNs.mNs.FrameType
  
  @js.native
  sealed trait OneByOne
    extends openui5Lib.sapNs.mNs.FrameType
  
  @js.native
  sealed trait TwoByOne
    extends openui5Lib.sapNs.mNs.FrameType
  
  @js.native
  sealed trait TwoThirds
    extends openui5Lib.sapNs.mNs.FrameType
  
  /* 0 */ val Auto: Auto with scala.Double = js.native
  /* 1 */ val OneByOne: OneByOne with scala.Double = js.native
  /* 2 */ val TwoByOne: TwoByOne with scala.Double = js.native
  /* 3 */ val TwoThirds: TwoThirds with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.FrameType with scala.Double] = js.native
}

