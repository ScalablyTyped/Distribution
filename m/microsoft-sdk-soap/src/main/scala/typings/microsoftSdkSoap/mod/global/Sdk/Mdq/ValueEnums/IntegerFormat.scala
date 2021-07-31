package typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IntegerFormat extends StObject
@JSGlobal("Sdk.Mdq.ValueEnums.IntegerFormat")
@js.native
object IntegerFormat extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IntegerFormat & Double] = js.native
  
  @js.native
  sealed trait Duration
    extends StObject
       with IntegerFormat
  /* 0 */ val Duration: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.IntegerFormat.Duration & Double = js.native
  
  @js.native
  sealed trait Language
    extends StObject
       with IntegerFormat
  /* 1 */ val Language: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.IntegerFormat.Language & Double = js.native
  
  @js.native
  sealed trait Locale
    extends StObject
       with IntegerFormat
  /* 2 */ val Locale: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.IntegerFormat.Locale & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with IntegerFormat
  /* 3 */ val None: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.IntegerFormat.None & Double = js.native
  
  @js.native
  sealed trait TimeZone
    extends StObject
       with IntegerFormat
  /* 4 */ val TimeZone: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.IntegerFormat.TimeZone & Double = js.native
}
