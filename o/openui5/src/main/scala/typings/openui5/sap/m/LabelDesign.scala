package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LabelDesign with Double] = js.native
  /* 0 */ @js.native
  object Bold extends TopLevel[Bold with Double]
  
  /* 1 */ @js.native
  object Standard extends TopLevel[Standard with Double]
  
}

