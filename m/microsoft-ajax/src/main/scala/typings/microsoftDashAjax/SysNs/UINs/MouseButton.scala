package typings.microsoftDashAjax.SysNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MouseButton extends js.Object

/**
  * Describes mouse button locations.
  */
@JSGlobal("Sys.UI.MouseButton")
@js.native
object MouseButton extends js.Object {
  /**
    * Represents the left mouse button.
    */
  @js.native
  sealed trait leftButton extends MouseButton
  
  /**
    * Represents the middle mouse button.
    */
  @js.native
  sealed trait middleButton extends MouseButton
  
  /**
    * Represents the right mouse button.
    */
  @js.native
  sealed trait rightButton extends MouseButton
  
  /* 0 */ val leftButton: typings.microsoftDashAjax.SysNs.UINs.MouseButton.leftButton with Double = js.native
  /* 1 */ val middleButton: typings.microsoftDashAjax.SysNs.UINs.MouseButton.middleButton with Double = js.native
  /* 2 */ val rightButton: typings.microsoftDashAjax.SysNs.UINs.MouseButton.rightButton with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MouseButton with Double] = js.native
}

