package typings.openui5.sapNs.mNs

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
  
  /* 0 */ val List: typings.openui5.sapNs.mNs.PageBackgroundDesign.List with Double = js.native
  /* 1 */ val Solid: typings.openui5.sapNs.mNs.PageBackgroundDesign.Solid with Double = js.native
  /* 2 */ val Standard: typings.openui5.sapNs.mNs.PageBackgroundDesign.Standard with Double = js.native
  /* 3 */ val Transparent: typings.openui5.sapNs.mNs.PageBackgroundDesign.Transparent with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PageBackgroundDesign with Double] = js.native
}

