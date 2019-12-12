package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums

import org.scalablytyped.runtime.TopLevel
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums.StringFormat.Email
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums.StringFormat.PhoneticGuide
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums.StringFormat.Text
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums.StringFormat.TextArea
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums.StringFormat.TickerSymbol
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums.StringFormat.Url
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums.StringFormat.VersionNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StringFormat extends js.Object

@JSGlobal("Sdk.Mdq.ValueEnums.StringFormat")
@js.native
object StringFormat extends js.Object {
  @js.native
  sealed trait Email extends StringFormat
  
  @js.native
  sealed trait PhoneticGuide extends StringFormat
  
  @js.native
  sealed trait Text extends StringFormat
  
  @js.native
  sealed trait TextArea extends StringFormat
  
  @js.native
  sealed trait TickerSymbol extends StringFormat
  
  @js.native
  sealed trait Url extends StringFormat
  
  @js.native
  sealed trait VersionNumber extends StringFormat
  
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[StringFormat with scala.Double] = js.native
  /* 0 */ @js.native
  object Email
    extends TopLevel[Email with scala.Double]
  
  /* 1 */ @js.native
  object PhoneticGuide
    extends TopLevel[PhoneticGuide with scala.Double]
  
  /* 2 */ @js.native
  object Text
    extends TopLevel[Text with scala.Double]
  
  /* 3 */ @js.native
  object TextArea
    extends TopLevel[TextArea with scala.Double]
  
  /* 4 */ @js.native
  object TickerSymbol
    extends TopLevel[TickerSymbol with scala.Double]
  
  /* 5 */ @js.native
  object Url
    extends TopLevel[Url with scala.Double]
  
  /* 6 */ @js.native
  object VersionNumber
    extends TopLevel[VersionNumber with scala.Double]
  
}

