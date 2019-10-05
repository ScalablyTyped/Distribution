package typings.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SwitchType extends js.Object

/**
  * Enumaration for different switch types.
  */
@JSGlobal("sap.m.SwitchType")
@js.native
object SwitchType extends js.Object {
  @js.native
  sealed trait AcceptReject extends SwitchType
  
  @js.native
  sealed trait Default extends SwitchType
  
  /* 0 */ val AcceptReject: typings.openui5.sap.m.SwitchType.AcceptReject with Double = js.native
  /* 1 */ val Default: typings.openui5.sap.m.SwitchType.Default with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SwitchType with Double] = js.native
}

