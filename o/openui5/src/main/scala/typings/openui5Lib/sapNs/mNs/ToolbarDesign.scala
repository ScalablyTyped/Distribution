package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ToolbarDesign extends js.Object

/**
  * Types of the Toolbar Design.
  */
@JSGlobal("sap.m.ToolbarDesign")
@js.native
object ToolbarDesign extends js.Object {
  @js.native
  sealed trait Auto
    extends openui5Lib.sapNs.mNs.ToolbarDesign
  
  @js.native
  sealed trait Info
    extends openui5Lib.sapNs.mNs.ToolbarDesign
  
  @js.native
  sealed trait Solid
    extends openui5Lib.sapNs.mNs.ToolbarDesign
  
  @js.native
  sealed trait Transparent
    extends openui5Lib.sapNs.mNs.ToolbarDesign
  
  /* 0 */ val Auto: Auto with scala.Double = js.native
  /* 1 */ val Info: Info with scala.Double = js.native
  /* 2 */ val Solid: Solid with scala.Double = js.native
  /* 3 */ val Transparent: Transparent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.ToolbarDesign with scala.Double] = js.native
}

