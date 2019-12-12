package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
import typings.openui5.sap.m.SelectListKeyboardNavigationMode.Delimited
import typings.openui5.sap.m.SelectListKeyboardNavigationMode.None
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectListKeyboardNavigationMode with Double] = js.native
  /* 0 */ @js.native
  object Delimited extends TopLevel[Delimited with Double]
  
  /* 1 */ @js.native
  object None extends TopLevel[None with Double]
  
}

