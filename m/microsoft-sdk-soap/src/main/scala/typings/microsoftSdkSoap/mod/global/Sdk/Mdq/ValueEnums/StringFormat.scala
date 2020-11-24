package typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StringFormat extends js.Object
@JSGlobal("Sdk.Mdq.ValueEnums.StringFormat")
@js.native
object StringFormat extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StringFormat with Double] = js.native
  
  @js.native
  sealed trait Email extends StringFormat
  /* 0 */ @js.native
  object Email extends TopLevel[Email with Double]
  
  @js.native
  sealed trait PhoneticGuide extends StringFormat
  /* 1 */ @js.native
  object PhoneticGuide extends TopLevel[PhoneticGuide with Double]
  
  @js.native
  sealed trait Text extends StringFormat
  /* 2 */ @js.native
  object Text extends TopLevel[Text with Double]
  
  @js.native
  sealed trait TextArea extends StringFormat
  /* 3 */ @js.native
  object TextArea extends TopLevel[TextArea with Double]
  
  @js.native
  sealed trait TickerSymbol extends StringFormat
  /* 4 */ @js.native
  object TickerSymbol extends TopLevel[TickerSymbol with Double]
  
  @js.native
  sealed trait Url extends StringFormat
  /* 5 */ @js.native
  object Url extends TopLevel[Url with Double]
  
  @js.native
  sealed trait VersionNumber extends StringFormat
  /* 6 */ @js.native
  object VersionNumber extends TopLevel[VersionNumber with Double]
}
