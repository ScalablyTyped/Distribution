package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums

import org.scalablytyped.runtime.TopLevel
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
  def apply(value: Double): js.UndefOr[StringFormat with Double] = js.native
  /* 0 */ @js.native
  object Email extends TopLevel[Email with Double]
  
  /* 1 */ @js.native
  object PhoneticGuide extends TopLevel[PhoneticGuide with Double]
  
  /* 2 */ @js.native
  object Text extends TopLevel[Text with Double]
  
  /* 3 */ @js.native
  object TextArea extends TopLevel[TextArea with Double]
  
  /* 4 */ @js.native
  object TickerSymbol extends TopLevel[TickerSymbol with Double]
  
  /* 5 */ @js.native
  object Url extends TopLevel[Url with Double]
  
  /* 6 */ @js.native
  object VersionNumber extends TopLevel[VersionNumber with Double]
  
}

