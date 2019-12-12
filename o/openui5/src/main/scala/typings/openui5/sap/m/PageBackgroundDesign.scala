package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
import typings.openui5.sap.m.PageBackgroundDesign.Solid
import typings.openui5.sap.m.PageBackgroundDesign.Standard
import typings.openui5.sap.m.PageBackgroundDesign.Transparent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PageBackgroundDesign extends js.Object

/**
  * Available Page Background Design.
  */
@JSGlobal("sap.m.PageBackgroundDesign")
@js.native
object PageBackgroundDesign extends js.Object {
  @js.native
  sealed trait List extends PageBackgroundDesign
  
  @js.native
  sealed trait Solid extends PageBackgroundDesign
  
  @js.native
  sealed trait Standard extends PageBackgroundDesign
  
  @js.native
  sealed trait Transparent extends PageBackgroundDesign
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PageBackgroundDesign with Double] = js.native
  /* 0 */ @js.native
  object List
    extends TopLevel[typings.openui5.sap.m.PageBackgroundDesign.List with Double]
  
  /* 1 */ @js.native
  object Solid extends TopLevel[Solid with Double]
  
  /* 2 */ @js.native
  object Standard extends TopLevel[Standard with Double]
  
  /* 3 */ @js.native
  object Transparent extends TopLevel[Transparent with Double]
  
}

