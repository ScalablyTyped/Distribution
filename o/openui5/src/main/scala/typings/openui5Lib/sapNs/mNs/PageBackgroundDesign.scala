package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PageBackgroundDesign extends js.Object

/**
  * Available Page Background Design.
  */
@JSGlobal("sap.m.PageBackgroundDesign")
@js.native
object PageBackgroundDesign extends js.Object {
  @js.native
  sealed trait List
    extends openui5Lib.sapNs.mNs.PageBackgroundDesign
  
  @js.native
  sealed trait Solid
    extends openui5Lib.sapNs.mNs.PageBackgroundDesign
  
  @js.native
  sealed trait Standard
    extends openui5Lib.sapNs.mNs.PageBackgroundDesign
  
  @js.native
  sealed trait Transparent
    extends openui5Lib.sapNs.mNs.PageBackgroundDesign
  
  /* 0 */ val List: List with scala.Double = js.native
  /* 1 */ val Solid: Solid with scala.Double = js.native
  /* 2 */ val Standard: Standard with scala.Double = js.native
  /* 3 */ val Transparent: Transparent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.PageBackgroundDesign with scala.Double] = js.native
}

