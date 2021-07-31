package typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StringFormat extends StObject
@JSGlobal("Sdk.Mdq.ValueEnums.StringFormat")
@js.native
object StringFormat extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StringFormat & Double] = js.native
  
  @js.native
  sealed trait Email
    extends StObject
       with StringFormat
  /* 0 */ val Email: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.StringFormat.Email & Double = js.native
  
  @js.native
  sealed trait PhoneticGuide
    extends StObject
       with StringFormat
  /* 1 */ val PhoneticGuide: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.StringFormat.PhoneticGuide & Double = js.native
  
  @js.native
  sealed trait Text
    extends StObject
       with StringFormat
  /* 2 */ val Text: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.StringFormat.Text & Double = js.native
  
  @js.native
  sealed trait TextArea
    extends StObject
       with StringFormat
  /* 3 */ val TextArea: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.StringFormat.TextArea & Double = js.native
  
  @js.native
  sealed trait TickerSymbol
    extends StObject
       with StringFormat
  /* 4 */ val TickerSymbol: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.StringFormat.TickerSymbol & Double = js.native
  
  @js.native
  sealed trait Url
    extends StObject
       with StringFormat
  /* 5 */ val Url: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.StringFormat.Url & Double = js.native
  
  @js.native
  sealed trait VersionNumber
    extends StObject
       with StringFormat
  /* 6 */ val VersionNumber: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.StringFormat.VersionNumber & Double = js.native
}
