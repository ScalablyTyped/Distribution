package typings
package openui5Lib.sapNs.mNs

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
  sealed trait Delimited
    extends openui5Lib.sapNs.mNs.SelectListKeyboardNavigationMode
  
  @js.native
  sealed trait None
    extends openui5Lib.sapNs.mNs.SelectListKeyboardNavigationMode
  
  /* 0 */ val Delimited: Delimited with scala.Double = js.native
  /* 1 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.SelectListKeyboardNavigationMode with scala.Double] = js.native
}

