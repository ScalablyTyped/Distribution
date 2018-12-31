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
  
  val Delimited: Delimited with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.SelectListKeyboardNavigationMode with java.lang.String] = js.native
}

