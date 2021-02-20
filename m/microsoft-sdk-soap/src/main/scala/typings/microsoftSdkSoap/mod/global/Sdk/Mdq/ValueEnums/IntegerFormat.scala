package typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IntegerFormat extends StObject
@JSGlobal("Sdk.Mdq.ValueEnums.IntegerFormat")
@js.native
object IntegerFormat extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IntegerFormat with Double] = js.native
  
  @js.native
  sealed trait Duration extends IntegerFormat
  /* 0 */ val Duration: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.IntegerFormat.Duration with Double = js.native
  
  @js.native
  sealed trait Language extends IntegerFormat
  /* 1 */ val Language: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.IntegerFormat.Language with Double = js.native
  
  @js.native
  sealed trait Locale extends IntegerFormat
  /* 2 */ val Locale: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.IntegerFormat.Locale with Double = js.native
  
  @js.native
  sealed trait None extends IntegerFormat
  /* 3 */ val None: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.IntegerFormat.None with Double = js.native
  
  @js.native
  sealed trait TimeZone extends IntegerFormat
  /* 4 */ val TimeZone: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.IntegerFormat.TimeZone with Double = js.native
}
