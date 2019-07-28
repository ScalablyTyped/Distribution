package typings.openui5.sapNs.mNs

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
  sealed trait Edit extends ListKeyboardMode
  
  @js.native
  sealed trait Navigation extends ListKeyboardMode
  
  /* 0 */ val Edit: typings.openui5.sapNs.mNs.ListKeyboardMode.Edit with Double = js.native
  /* 1 */ val Navigation: typings.openui5.sapNs.mNs.ListKeyboardMode.Navigation with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ListKeyboardMode with Double] = js.native
}

