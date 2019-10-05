package typings.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LabelDesign extends js.Object

/**
  * Available label display modes.
  */
@JSGlobal("sap.m.LabelDesign")
@js.native
object LabelDesign extends js.Object {
  @js.native
  sealed trait Bold extends LabelDesign
  
  @js.native
  sealed trait Standard extends LabelDesign
  
  /* 0 */ val Bold: typings.openui5.sap.m.LabelDesign.Bold with Double = js.native
  /* 1 */ val Standard: typings.openui5.sap.m.LabelDesign.Standard with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LabelDesign with Double] = js.native
}

