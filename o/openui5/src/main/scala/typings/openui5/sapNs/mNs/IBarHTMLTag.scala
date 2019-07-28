package typings.openui5.sapNs.mNs

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
  sealed trait Div extends IBarHTMLTag
  
  @js.native
  sealed trait Footer extends IBarHTMLTag
  
  @js.native
  sealed trait Header extends IBarHTMLTag
  
  /* 0 */ val Div: typings.openui5.sapNs.mNs.IBarHTMLTag.Div with Double = js.native
  /* 1 */ val Footer: typings.openui5.sapNs.mNs.IBarHTMLTag.Footer with Double = js.native
  /* 2 */ val Header: typings.openui5.sapNs.mNs.IBarHTMLTag.Header with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IBarHTMLTag with Double] = js.native
}

