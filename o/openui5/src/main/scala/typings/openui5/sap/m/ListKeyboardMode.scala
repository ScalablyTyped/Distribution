package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
import typings.openui5.sap.m.ListKeyboardMode.Edit
import typings.openui5.sap.m.ListKeyboardMode.Navigation
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ListKeyboardMode with Double] = js.native
  /* 0 */ @js.native
  object Edit extends TopLevel[Edit with Double]
  
  /* 1 */ @js.native
  object Navigation extends TopLevel[Navigation with Double]
  
}

