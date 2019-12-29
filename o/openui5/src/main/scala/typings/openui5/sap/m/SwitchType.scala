package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SwitchType with Double] = js.native
  /* 0 */ @js.native
  object AcceptReject extends TopLevel[AcceptReject with Double]
  
  /* 1 */ @js.native
  object Default extends TopLevel[Default with Double]
  
}

