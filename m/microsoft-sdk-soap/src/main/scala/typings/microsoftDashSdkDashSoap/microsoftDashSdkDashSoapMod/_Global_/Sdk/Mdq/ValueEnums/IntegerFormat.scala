package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums

import org.scalablytyped.runtime.TopLevel
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums.IntegerFormat.Duration
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums.IntegerFormat.Language
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums.IntegerFormat.Locale
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums.IntegerFormat.None
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums.IntegerFormat.TimeZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IntegerFormat extends js.Object

@JSGlobal("Sdk.Mdq.ValueEnums.IntegerFormat")
@js.native
object IntegerFormat extends js.Object {
  @js.native
  sealed trait Duration extends IntegerFormat
  
  @js.native
  sealed trait Language extends IntegerFormat
  
  @js.native
  sealed trait Locale extends IntegerFormat
  
  @js.native
  sealed trait None extends IntegerFormat
  
  @js.native
  sealed trait TimeZone extends IntegerFormat
  
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[IntegerFormat with scala.Double] = js.native
  /* 0 */ @js.native
  object Duration
    extends TopLevel[Duration with scala.Double]
  
  /* 1 */ @js.native
  object Language
    extends TopLevel[Language with scala.Double]
  
  /* 2 */ @js.native
  object Locale
    extends TopLevel[Locale with scala.Double]
  
  /* 3 */ @js.native
  object None
    extends TopLevel[None with scala.Double]
  
  /* 4 */ @js.native
  object TimeZone
    extends TopLevel[TimeZone with scala.Double]
  
}

