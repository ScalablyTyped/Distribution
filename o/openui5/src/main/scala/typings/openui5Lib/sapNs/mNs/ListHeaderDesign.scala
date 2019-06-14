package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ListHeaderDesign extends js.Object

/**
  * Defines the different header styles.
  */
@JSGlobal("sap.m.ListHeaderDesign")
@js.native
object ListHeaderDesign extends js.Object {
  @js.native
  sealed trait Plain
    extends openui5Lib.sapNs.mNs.ListHeaderDesign
  
  @js.native
  sealed trait Standard
    extends openui5Lib.sapNs.mNs.ListHeaderDesign
  
  /* 0 */ val Plain: Plain with scala.Double = js.native
  /* 1 */ val Standard: Standard with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.ListHeaderDesign with scala.Double] = js.native
}

