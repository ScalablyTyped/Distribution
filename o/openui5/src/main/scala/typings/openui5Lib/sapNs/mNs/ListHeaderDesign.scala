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
  
  val Plain: Plain with java.lang.String = js.native
  val Standard: Standard with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.ListHeaderDesign with java.lang.String] = js.native
}

