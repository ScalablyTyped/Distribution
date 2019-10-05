package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod.Global.Sdk.Mdq.ValueEnums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DateTimeFormat extends js.Object

@JSGlobal("Sdk.Mdq.ValueEnums.DateTimeFormat")
@js.native
object DateTimeFormat extends js.Object {
  @js.native
  sealed trait DateAndTime extends DateTimeFormat
  
  @js.native
  sealed trait DateOnly extends DateTimeFormat
  
  /* 0 */ val DateAndTime: typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod.Global.Sdk.Mdq.ValueEnums.DateTimeFormat.DateAndTime with scala.Double = js.native
  /* 1 */ val DateOnly: typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod.Global.Sdk.Mdq.ValueEnums.DateTimeFormat.DateOnly with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[DateTimeFormat with scala.Double] = js.native
}

