package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod.Global.Sdk.Query

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait JoinOperator extends js.Object

@JSGlobal("Sdk.Query.JoinOperator")
@js.native
object JoinOperator extends js.Object {
  @js.native
  sealed trait Inner extends JoinOperator
  
  @js.native
  sealed trait LeftOuter extends JoinOperator
  
  @js.native
  sealed trait Natural extends JoinOperator
  
  /* 0 */ val Inner: typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod.Global.Sdk.Query.JoinOperator.Inner with scala.Double = js.native
  /* 1 */ val LeftOuter: typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod.Global.Sdk.Query.JoinOperator.LeftOuter with scala.Double = js.native
  /* 2 */ val Natural: typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod.Global.Sdk.Query.JoinOperator.Natural with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[JoinOperator with scala.Double] = js.native
}

