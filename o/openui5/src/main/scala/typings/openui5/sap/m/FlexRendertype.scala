package typings.openui5.sap.m

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
  sealed trait Div extends FlexRendertype
  
  @js.native
  sealed trait List extends FlexRendertype
  
  /* 0 */ val Div: typings.openui5.sap.m.FlexRendertype.Div with Double = js.native
  /* 1 */ val List: typings.openui5.sap.m.FlexRendertype.List with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FlexRendertype with Double] = js.native
}

