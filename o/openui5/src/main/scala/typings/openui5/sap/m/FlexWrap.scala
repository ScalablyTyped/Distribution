package typings.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FlexWrap extends js.Object

/**
  * Available options for the wrapping behavior of a flex container.
  */
@JSGlobal("sap.m.FlexWrap")
@js.native
object FlexWrap extends js.Object {
  @js.native
  sealed trait NoWrap extends FlexWrap
  
  @js.native
  sealed trait Wrap extends FlexWrap
  
  @js.native
  sealed trait WrapReverse extends FlexWrap
  
  /* 0 */ val NoWrap: typings.openui5.sap.m.FlexWrap.NoWrap with Double = js.native
  /* 1 */ val Wrap: typings.openui5.sap.m.FlexWrap.Wrap with Double = js.native
  /* 2 */ val WrapReverse: typings.openui5.sap.m.FlexWrap.WrapReverse with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FlexWrap with Double] = js.native
}

