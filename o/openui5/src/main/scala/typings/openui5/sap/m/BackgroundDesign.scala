package typings.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BackgroundDesign extends js.Object

/**
  * Available Background Design.
  */
@JSGlobal("sap.m.BackgroundDesign")
@js.native
object BackgroundDesign extends js.Object {
  @js.native
  sealed trait Solid extends BackgroundDesign
  
  @js.native
  sealed trait Translucent extends BackgroundDesign
  
  @js.native
  sealed trait Transparent extends BackgroundDesign
  
  /* 0 */ val Solid: typings.openui5.sap.m.BackgroundDesign.Solid with Double = js.native
  /* 1 */ val Translucent: typings.openui5.sap.m.BackgroundDesign.Translucent with Double = js.native
  /* 2 */ val Transparent: typings.openui5.sap.m.BackgroundDesign.Transparent with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BackgroundDesign with Double] = js.native
}

