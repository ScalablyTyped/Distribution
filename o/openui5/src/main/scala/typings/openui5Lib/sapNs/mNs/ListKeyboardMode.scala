package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ListKeyboardMode extends js.Object

/**
  * Defines the keyboard handling behavior of the <code>sap.m.List</code> or <code>sap.m.Table</code>.
  */
@JSGlobal("sap.m.ListKeyboardMode")
@js.native
object ListKeyboardMode extends js.Object {
  @js.native
  sealed trait Edit
    extends openui5Lib.sapNs.mNs.ListKeyboardMode
  
  @js.native
  sealed trait Navigation
    extends openui5Lib.sapNs.mNs.ListKeyboardMode
  
  /* 0 */ val Edit: Edit with scala.Double = js.native
  /* 1 */ val Navigation: Navigation with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.ListKeyboardMode with scala.Double] = js.native
}

