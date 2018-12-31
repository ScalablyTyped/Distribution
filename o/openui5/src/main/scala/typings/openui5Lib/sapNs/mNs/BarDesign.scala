package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BarDesign extends js.Object

/**
  * Types of the Bar design
  */
@JSGlobal("sap.m.BarDesign")
@js.native
object BarDesign extends js.Object {
  @js.native
  sealed trait Auto
    extends openui5Lib.sapNs.mNs.BarDesign
  
  @js.native
  sealed trait Footer
    extends openui5Lib.sapNs.mNs.BarDesign
  
  @js.native
  sealed trait Header
    extends openui5Lib.sapNs.mNs.BarDesign
  
  @js.native
  sealed trait SubHeader
    extends openui5Lib.sapNs.mNs.BarDesign
  
  val Auto: Auto with java.lang.String = js.native
  val Footer: Footer with java.lang.String = js.native
  val Header: Header with java.lang.String = js.native
  val SubHeader: SubHeader with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.BarDesign with java.lang.String] = js.native
}

