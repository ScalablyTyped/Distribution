package typings
package microsoftDashAjaxLib.SysNs.UINs

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
  sealed trait leftButton
    extends microsoftDashAjaxLib.SysNs.UINs.MouseButton
  
  /**
    * Represents the middle mouse button.
    */
  @js.native
  sealed trait middleButton
    extends microsoftDashAjaxLib.SysNs.UINs.MouseButton
  
  /**
    * Represents the right mouse button.
    */
  @js.native
  sealed trait rightButton
    extends microsoftDashAjaxLib.SysNs.UINs.MouseButton
  
  /* 0 */ val leftButton: leftButton with scala.Double = js.native
  /* 1 */ val middleButton: middleButton with scala.Double = js.native
  /* 2 */ val rightButton: rightButton with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[microsoftDashAjaxLib.SysNs.UINs.MouseButton with scala.Double] = js.native
}

