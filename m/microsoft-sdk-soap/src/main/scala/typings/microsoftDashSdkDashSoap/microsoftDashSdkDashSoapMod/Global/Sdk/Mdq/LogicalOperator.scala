package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod.Global.Sdk.Mdq

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
  
  /* 0 */ val And: typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod.Global.Sdk.Mdq.LogicalOperator.And with scala.Double = js.native
  /* 1 */ val Or: typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod.Global.Sdk.Mdq.LogicalOperator.Or with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[LogicalOperator with scala.Double] = js.native
}

