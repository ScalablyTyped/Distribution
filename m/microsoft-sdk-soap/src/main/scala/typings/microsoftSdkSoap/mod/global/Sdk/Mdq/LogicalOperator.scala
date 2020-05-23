package typings.microsoftSdkSoap.mod.global.Sdk.Mdq

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LogicalOperator extends js.Object

@JSGlobal("Sdk.Mdq.LogicalOperator")
@js.native
object LogicalOperator extends js.Object {
  @js.native
  sealed trait And extends LogicalOperator
  
  @js.native
  sealed trait Or extends LogicalOperator
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogicalOperator with Double] = js.native
  /* 0 */ @js.native
  object And extends TopLevel[And with Double]
  
  /* 1 */ @js.native
  object Or extends TopLevel[Or with Double]
  
}

