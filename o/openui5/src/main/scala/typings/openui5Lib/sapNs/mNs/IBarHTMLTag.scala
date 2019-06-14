package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IBarHTMLTag extends js.Object

/**
  * Allowed tags for the implementation of the IBar interface.
  */
@JSGlobal("sap.m.IBarHTMLTag")
@js.native
object IBarHTMLTag extends js.Object {
  @js.native
  sealed trait Div
    extends openui5Lib.sapNs.mNs.IBarHTMLTag
  
  @js.native
  sealed trait Footer
    extends openui5Lib.sapNs.mNs.IBarHTMLTag
  
  @js.native
  sealed trait Header
    extends openui5Lib.sapNs.mNs.IBarHTMLTag
  
  /* 0 */ val Div: Div with scala.Double = js.native
  /* 1 */ val Footer: Footer with scala.Double = js.native
  /* 2 */ val Header: Header with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.IBarHTMLTag with scala.Double] = js.native
}

