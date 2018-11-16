package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BackgroundDesign extends js.Object

/**
     * Available Background Design.
    */
@JSGlobal("sap.m.BackgroundDesign")
@js.native
object BackgroundDesign extends js.Object {
  @js.native
  sealed trait Solid
    extends openui5Lib.sapNs.mNs.BackgroundDesign
  
  @js.native
  sealed trait Translucent
    extends openui5Lib.sapNs.mNs.BackgroundDesign
  
  @js.native
  sealed trait Transparent
    extends openui5Lib.sapNs.mNs.BackgroundDesign
  
  val Solid: Solid with java.lang.String = js.native
  val Translucent: Translucent with java.lang.String = js.native
  val Transparent: Transparent with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.BackgroundDesign with java.lang.String] = js.native
}

