package typings.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
