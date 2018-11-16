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
  
  val List: List with java.lang.String = js.native
  val Solid: Solid with java.lang.String = js.native
  val Standard: Standard with java.lang.String = js.native
  val Transparent: Transparent with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.PageBackgroundDesign with java.lang.String] = js.native
}

