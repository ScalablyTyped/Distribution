package typings.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IconTabFilterDesign extends js.Object

/**
  * Available Filter Item Design.
  */
@JSGlobal("sap.m.IconTabFilterDesign")
@js.native
object IconTabFilterDesign extends js.Object {
  @js.native
  sealed trait Horizontal extends IconTabFilterDesign
  
  @js.native
  sealed trait Vertical extends IconTabFilterDesign
  
  /* 0 */ val Horizontal: typings.openui5.sap.m.IconTabFilterDesign.Horizontal with Double = js.native
  /* 1 */ val Vertical: typings.openui5.sap.m.IconTabFilterDesign.Vertical with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IconTabFilterDesign with Double] = js.native
}

