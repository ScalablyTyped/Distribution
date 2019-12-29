package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IBarHTMLTag with Double] = js.native
  /* 0 */ @js.native
  object Div extends TopLevel[Div with Double]
  
  /* 1 */ @js.native
  object Footer extends TopLevel[Footer with Double]
  
  /* 2 */ @js.native
  object Header extends TopLevel[Header with Double]
  
}

