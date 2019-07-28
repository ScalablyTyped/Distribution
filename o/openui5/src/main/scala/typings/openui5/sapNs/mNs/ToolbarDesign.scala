package typings.openui5.sapNs.mNs

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
  sealed trait Auto extends ToolbarDesign
  
  @js.native
  sealed trait Info extends ToolbarDesign
  
  @js.native
  sealed trait Solid extends ToolbarDesign
  
  @js.native
  sealed trait Transparent extends ToolbarDesign
  
  /* 0 */ val Auto: typings.openui5.sapNs.mNs.ToolbarDesign.Auto with Double = js.native
  /* 1 */ val Info: typings.openui5.sapNs.mNs.ToolbarDesign.Info with Double = js.native
  /* 2 */ val Solid: typings.openui5.sapNs.mNs.ToolbarDesign.Solid with Double = js.native
  /* 3 */ val Transparent: typings.openui5.sapNs.mNs.ToolbarDesign.Transparent with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ToolbarDesign with Double] = js.native
}

