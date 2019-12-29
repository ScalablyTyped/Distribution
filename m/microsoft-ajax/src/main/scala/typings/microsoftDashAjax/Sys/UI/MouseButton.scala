package typings.microsoftDashAjax.Sys.UI

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MouseButton with Double] = js.native
  /* 0 */ @js.native
  object leftButton extends TopLevel[leftButton with Double]
  
  /* 1 */ @js.native
  object middleButton extends TopLevel[middleButton with Double]
  
  /* 2 */ @js.native
  object rightButton extends TopLevel[rightButton with Double]
  
}

