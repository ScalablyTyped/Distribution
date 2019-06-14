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
  
  /* 0 */ val Auto: Auto with scala.Double = js.native
  /* 1 */ val Footer: Footer with scala.Double = js.native
  /* 2 */ val Header: Header with scala.Double = js.native
  /* 3 */ val SubHeader: SubHeader with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.BarDesign with scala.Double] = js.native
}

