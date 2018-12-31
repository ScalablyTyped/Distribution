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
  
  val Auto: Auto with java.lang.String = js.native
  val OneByOne: OneByOne with java.lang.String = js.native
  val TwoByOne: TwoByOne with java.lang.String = js.native
  val TwoThirds: TwoThirds with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.FrameType with java.lang.String] = js.native
}

