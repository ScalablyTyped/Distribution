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
  
  /* 0 */ val Bold: Bold with scala.Double = js.native
  /* 1 */ val Standard: Standard with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.LabelDesign with scala.Double] = js.native
}

