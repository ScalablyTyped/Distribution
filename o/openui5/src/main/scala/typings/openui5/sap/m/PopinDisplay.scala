package typings.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PopinDisplay extends js.Object

/**
  * Defines the display of table pop-ins
  */
@JSGlobal("sap.m.PopinDisplay")
@js.native
object PopinDisplay extends js.Object {
  @js.native
  sealed trait Block extends PopinDisplay
  
  @js.native
  sealed trait Inline extends PopinDisplay
  
  @js.native
  sealed trait WithoutHeader extends PopinDisplay
  
  /* 0 */ val Block: typings.openui5.sap.m.PopinDisplay.Block with Double = js.native
  /* 1 */ val Inline: typings.openui5.sap.m.PopinDisplay.Inline with Double = js.native
  /* 2 */ val WithoutHeader: typings.openui5.sap.m.PopinDisplay.WithoutHeader with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PopinDisplay with Double] = js.native
}

