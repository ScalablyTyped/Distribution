package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IconTabFilterDesign extends js.Object

/**
     * Available Filter Item Design.
    */
@JSGlobal("sap.m.IconTabFilterDesign")
@js.native
object IconTabFilterDesign extends js.Object {
  @js.native
  sealed trait Horizontal
    extends openui5Lib.sapNs.mNs.IconTabFilterDesign
  
  @js.native
  sealed trait Vertical
    extends openui5Lib.sapNs.mNs.IconTabFilterDesign
  
  val Horizontal: Horizontal with java.lang.String = js.native
  val Vertical: Vertical with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.IconTabFilterDesign with java.lang.String] = js.native
}

