package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
import typings.openui5.sap.m.FrameType.Auto
import typings.openui5.sap.m.FrameType.OneByOne
import typings.openui5.sap.m.FrameType.TwoByOne
import typings.openui5.sap.m.FrameType.TwoThirds
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FrameType with Double] = js.native
  /* 0 */ @js.native
  object Auto extends TopLevel[Auto with Double]
  
  /* 1 */ @js.native
  object OneByOne extends TopLevel[OneByOne with Double]
  
  /* 2 */ @js.native
  object TwoByOne extends TopLevel[TwoByOne with Double]
  
  /* 3 */ @js.native
  object TwoThirds extends TopLevel[TwoThirds with Double]
  
}

