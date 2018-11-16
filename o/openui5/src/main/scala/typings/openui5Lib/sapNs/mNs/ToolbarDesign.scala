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
  
  val Auto: Auto with java.lang.String = js.native
  val Info: Info with java.lang.String = js.native
  val Solid: Solid with java.lang.String = js.native
  val Transparent: Transparent with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.ToolbarDesign with java.lang.String] = js.native
}

