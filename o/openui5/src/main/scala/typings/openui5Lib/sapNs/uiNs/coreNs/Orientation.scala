package typings
package openui5Lib.sapNs.uiNs.coreNs

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
  sealed trait Horizontal
    extends openui5Lib.sapNs.uiNs.coreNs.Orientation
  
  @js.native
  sealed trait Vertical
    extends openui5Lib.sapNs.uiNs.coreNs.Orientation
  
  /* 0 */ val Horizontal: Horizontal with scala.Double = js.native
  /* 1 */ val Vertical: Vertical with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.uiNs.coreNs.Orientation with scala.Double] = js.native
}

