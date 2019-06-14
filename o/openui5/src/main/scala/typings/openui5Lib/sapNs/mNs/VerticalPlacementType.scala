package typings
package openui5Lib.sapNs.mNs

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
  sealed trait Bottom
    extends openui5Lib.sapNs.mNs.VerticalPlacementType
  
  @js.native
  sealed trait Top
    extends openui5Lib.sapNs.mNs.VerticalPlacementType
  
  @js.native
  sealed trait Vertical
    extends openui5Lib.sapNs.mNs.VerticalPlacementType
  
  /* 0 */ val Bottom: Bottom with scala.Double = js.native
  /* 1 */ val Top: Top with scala.Double = js.native
  /* 2 */ val Vertical: Vertical with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.VerticalPlacementType with scala.Double] = js.native
}

