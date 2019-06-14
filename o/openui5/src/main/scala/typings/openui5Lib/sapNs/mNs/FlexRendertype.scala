package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FlexRendertype extends js.Object

/**
  * Determines the type of HTML elements used for rendering controls.
  */
@JSGlobal("sap.m.FlexRendertype")
@js.native
object FlexRendertype extends js.Object {
  @js.native
  sealed trait Div
    extends openui5Lib.sapNs.mNs.FlexRendertype
  
  @js.native
  sealed trait List
    extends openui5Lib.sapNs.mNs.FlexRendertype
  
  /* 0 */ val Div: Div with scala.Double = js.native
  /* 1 */ val List: List with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.FlexRendertype with scala.Double] = js.native
}

