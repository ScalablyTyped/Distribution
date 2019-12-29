package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BackgroundDesign with Double] = js.native
  /* 0 */ @js.native
  object Solid extends TopLevel[Solid with Double]
  
  /* 1 */ @js.native
  object Translucent extends TopLevel[Translucent with Double]
  
  /* 2 */ @js.native
  object Transparent extends TopLevel[Transparent with Double]
  
}

