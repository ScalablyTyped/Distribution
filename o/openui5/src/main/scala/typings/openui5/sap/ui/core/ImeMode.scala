package typings.openui5.sap.ui.core

import org.scalablytyped.runtime.TopLevel
import typings.openui5.sap.ui.core.ImeMode.Active
import typings.openui5.sap.ui.core.ImeMode.Auto
import typings.openui5.sap.ui.core.ImeMode.Disabled
import typings.openui5.sap.ui.core.ImeMode.Inactive
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ImeMode with Double] = js.native
  /* 0 */ @js.native
  object Active extends TopLevel[Active with Double]
  
  /* 1 */ @js.native
  object Auto extends TopLevel[Auto with Double]
  
  /* 2 */ @js.native
  object Disabled extends TopLevel[Disabled with Double]
  
  /* 3 */ @js.native
  object Inactive extends TopLevel[Inactive with Double]
  
}

