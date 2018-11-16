package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LabelDesign extends js.Object

/**
     * Available label display modes.
    */
@JSGlobal("sap.m.LabelDesign")
@js.native
object LabelDesign extends js.Object {
  @js.native
  sealed trait Bold
    extends openui5Lib.sapNs.mNs.LabelDesign
  
  @js.native
  sealed trait Standard
    extends openui5Lib.sapNs.mNs.LabelDesign
  
  val Bold: Bold with java.lang.String = js.native
  val Standard: Standard with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.LabelDesign with java.lang.String] = js.native
}

