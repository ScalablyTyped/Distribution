package typings.openui5.sapNs.uiNs.coreNs

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
  sealed trait Active extends ImeMode
  
  @js.native
  sealed trait Auto extends ImeMode
  
  @js.native
  sealed trait Disabled extends ImeMode
  
  @js.native
  sealed trait Inactive extends ImeMode
  
  /* 0 */ val Active: typings.openui5.sapNs.uiNs.coreNs.ImeMode.Active with Double = js.native
  /* 1 */ val Auto: typings.openui5.sapNs.uiNs.coreNs.ImeMode.Auto with Double = js.native
  /* 2 */ val Disabled: typings.openui5.sapNs.uiNs.coreNs.ImeMode.Disabled with Double = js.native
  /* 3 */ val Inactive: typings.openui5.sapNs.uiNs.coreNs.ImeMode.Inactive with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ImeMode with Double] = js.native
}

