package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
import typings.openui5.sap.m.FlexWrap.NoWrap
import typings.openui5.sap.m.FlexWrap.Wrap
import typings.openui5.sap.m.FlexWrap.WrapReverse
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FlexWrap with Double] = js.native
  /* 0 */ @js.native
  object NoWrap extends TopLevel[NoWrap with Double]
  
  /* 1 */ @js.native
  object Wrap extends TopLevel[Wrap with Double]
  
  /* 2 */ @js.native
  object WrapReverse extends TopLevel[WrapReverse with Double]
  
}

