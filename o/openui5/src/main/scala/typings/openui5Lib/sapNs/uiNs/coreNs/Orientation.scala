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
  
  val Horizontal: Horizontal with java.lang.String = js.native
  val Vertical: Vertical with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.uiNs.coreNs.Orientation with java.lang.String] = js.native
}

