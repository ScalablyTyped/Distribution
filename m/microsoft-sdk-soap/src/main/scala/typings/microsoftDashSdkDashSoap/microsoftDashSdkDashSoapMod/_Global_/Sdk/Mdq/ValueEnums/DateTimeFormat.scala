package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums

import org.scalablytyped.runtime.TopLevel
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums.DateTimeFormat.DateAndTime
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums.DateTimeFormat.DateOnly
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
  
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[DateTimeFormat with scala.Double] = js.native
  /* 0 */ @js.native
  object DateAndTime
    extends TopLevel[DateAndTime with scala.Double]
  
  /* 1 */ @js.native
  object DateOnly
    extends TopLevel[DateOnly with scala.Double]
  
}

