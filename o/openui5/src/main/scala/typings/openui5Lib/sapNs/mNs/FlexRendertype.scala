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
  
  val Div: Div with java.lang.String = js.native
  val List: List with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.FlexRendertype with java.lang.String] = js.native
}

