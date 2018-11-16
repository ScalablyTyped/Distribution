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
  
  val Div: Div with java.lang.String = js.native
  val Footer: Footer with java.lang.String = js.native
  val Header: Header with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.IBarHTMLTag with java.lang.String] = js.native
}

