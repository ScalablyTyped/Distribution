package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq

import org.scalablytyped.runtime.TopLevel
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.LogicalOperator.And
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.LogicalOperator.Or
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
  def apply(value: scala.Double): js.UndefOr[LogicalOperator with scala.Double] = js.native
  /* 0 */ @js.native
  object And
    extends TopLevel[And with scala.Double]
  
  /* 1 */ @js.native
  object Or
    extends TopLevel[Or with scala.Double]
  
}

