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
  
  val leftButton: leftButton with java.lang.String = js.native
  val middleButton: middleButton with java.lang.String = js.native
  val rightButton: rightButton with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[microsoftDashAjaxLib.SysNs.UINs.MouseButton with java.lang.String] = js.native
}

