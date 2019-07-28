package typings.openui5.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectListKeyboardNavigationMode extends js.Object

/**
  * Defines the keyboard navigation mode.
  */
@JSGlobal("sap.m.SelectListKeyboardNavigationMode")
@js.native
object SelectListKeyboardNavigationMode extends js.Object {
  @js.native
  sealed trait Delimited extends SelectListKeyboardNavigationMode
  
  @js.native
  sealed trait None extends SelectListKeyboardNavigationMode
  
  /* 0 */ val Delimited: typings.openui5.sapNs.mNs.SelectListKeyboardNavigationMode.Delimited with Double = js.native
  /* 1 */ val None: typings.openui5.sapNs.mNs.SelectListKeyboardNavigationMode.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectListKeyboardNavigationMode with Double] = js.native
}

