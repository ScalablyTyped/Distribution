package typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DateTimeFormat extends StObject
@JSGlobal("Sdk.Mdq.ValueEnums.DateTimeFormat")
@js.native
object DateTimeFormat extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DateTimeFormat & Double] = js.native
  
  @js.native
  sealed trait DateAndTime
    extends StObject
       with DateTimeFormat
  /* 0 */ val DateAndTime: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.DateTimeFormat.DateAndTime & Double = js.native
  
  @js.native
  sealed trait DateOnly
    extends StObject
       with DateTimeFormat
  /* 1 */ val DateOnly: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.DateTimeFormat.DateOnly & Double = js.native
}
