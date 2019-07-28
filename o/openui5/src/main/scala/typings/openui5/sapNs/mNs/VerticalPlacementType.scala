package typings.openui5.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VerticalPlacementType extends js.Object

/**
  * Types for the placement of message popover control.
  */
@JSGlobal("sap.m.VerticalPlacementType")
@js.native
object VerticalPlacementType extends js.Object {
  @js.native
  sealed trait Bottom extends VerticalPlacementType
  
  @js.native
  sealed trait Top extends VerticalPlacementType
  
  @js.native
  sealed trait Vertical extends VerticalPlacementType
  
  /* 0 */ val Bottom: typings.openui5.sapNs.mNs.VerticalPlacementType.Bottom with Double = js.native
  /* 1 */ val Top: typings.openui5.sapNs.mNs.VerticalPlacementType.Top with Double = js.native
  /* 2 */ val Vertical: typings.openui5.sapNs.mNs.VerticalPlacementType.Vertical with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VerticalPlacementType with Double] = js.native
}

