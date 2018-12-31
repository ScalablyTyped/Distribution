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
  
  val Bottom: Bottom with java.lang.String = js.native
  val Top: Top with java.lang.String = js.native
  val Vertical: Vertical with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.VerticalPlacementType with java.lang.String] = js.native
}

