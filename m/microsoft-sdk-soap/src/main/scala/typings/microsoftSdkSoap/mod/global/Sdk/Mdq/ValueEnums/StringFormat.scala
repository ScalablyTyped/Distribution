package typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StringFormat extends StObject
@JSGlobal("Sdk.Mdq.ValueEnums.StringFormat")
@js.native
object StringFormat extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StringFormat with Double] = js.native
  
  @js.native
  sealed trait Email extends StringFormat
  /* 0 */ val Email: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.StringFormat.Email with Double = js.native
  
  @js.native
  sealed trait PhoneticGuide extends StringFormat
  /* 1 */ val PhoneticGuide: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.StringFormat.PhoneticGuide with Double = js.native
  
  @js.native
  sealed trait Text extends StringFormat
  /* 2 */ val Text: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.StringFormat.Text with Double = js.native
  
  @js.native
  sealed trait TextArea extends StringFormat
  /* 3 */ val TextArea: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.StringFormat.TextArea with Double = js.native
  
  @js.native
  sealed trait TickerSymbol extends StringFormat
  /* 4 */ val TickerSymbol: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.StringFormat.TickerSymbol with Double = js.native
  
  @js.native
  sealed trait Url extends StringFormat
  /* 5 */ val Url: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.StringFormat.Url with Double = js.native
  
  @js.native
  sealed trait VersionNumber extends StringFormat
  /* 6 */ val VersionNumber: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.StringFormat.VersionNumber with Double = js.native
}
