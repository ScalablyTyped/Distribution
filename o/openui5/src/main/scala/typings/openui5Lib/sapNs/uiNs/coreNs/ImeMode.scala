package typings
package openui5Lib.sapNs.uiNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ImeMode extends js.Object

/**
  * State of the Input Method Editor (IME) for the control.Depending on its value, it allows users to
  * enter and edit for example Chinese characters.
  */
@JSGlobal("sap.ui.core.ImeMode")
@js.native
object ImeMode extends js.Object {
  @js.native
  sealed trait Active
    extends openui5Lib.sapNs.uiNs.coreNs.ImeMode
  
  @js.native
  sealed trait Auto
    extends openui5Lib.sapNs.uiNs.coreNs.ImeMode
  
  @js.native
  sealed trait Disabled
    extends openui5Lib.sapNs.uiNs.coreNs.ImeMode
  
  @js.native
  sealed trait Inactive
    extends openui5Lib.sapNs.uiNs.coreNs.ImeMode
  
  /* 0 */ val Active: Active with scala.Double = js.native
  /* 1 */ val Auto: Auto with scala.Double = js.native
  /* 2 */ val Disabled: Disabled with scala.Double = js.native
  /* 3 */ val Inactive: Inactive with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.uiNs.coreNs.ImeMode with scala.Double] = js.native
}

