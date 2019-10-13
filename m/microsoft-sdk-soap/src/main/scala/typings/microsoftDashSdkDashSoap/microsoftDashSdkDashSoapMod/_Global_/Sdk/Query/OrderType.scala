package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Query

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OrderType extends js.Object

@JSGlobal("Sdk.Query.OrderType")
@js.native
object OrderType extends js.Object {
  @js.native
  sealed trait Ascending extends OrderType
  
  @js.native
  sealed trait Descending extends OrderType
  
  /* 0 */ val Ascending: typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Query.OrderType.Ascending with scala.Double = js.native
  /* 1 */ val Descending: typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Query.OrderType.Descending with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[OrderType with scala.Double] = js.native
}

