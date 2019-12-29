package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FlexRendertype with Double] = js.native
  /* 0 */ @js.native
  object Div extends TopLevel[Div with Double]
  
  /* 1 */ @js.native
  object List
    extends TopLevel[typings.openui5.sap.m.FlexRendertype.List with Double]
  
}

