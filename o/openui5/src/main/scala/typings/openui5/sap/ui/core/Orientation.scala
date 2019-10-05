package typings.openui5.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Orientation extends js.Object

/**
  * Orientation of an UI element
  */
@JSGlobal("sap.ui.core.Orientation")
@js.native
object Orientation extends js.Object {
  @js.native
  sealed trait Horizontal extends Orientation
  
  @js.native
  sealed trait Vertical extends Orientation
  
  /* 0 */ val Horizontal: typings.openui5.sap.ui.core.Orientation.Horizontal with Double = js.native
  /* 1 */ val Vertical: typings.openui5.sap.ui.core.Orientation.Vertical with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Orientation with Double] = js.native
}

