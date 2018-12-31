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
  
  val Active: Active with java.lang.String = js.native
  val Auto: Auto with java.lang.String = js.native
  val Disabled: Disabled with java.lang.String = js.native
  val Inactive: Inactive with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.uiNs.coreNs.ImeMode with java.lang.String] = js.native
}

