package typings.openui5.sap.ui.core

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
  
}

