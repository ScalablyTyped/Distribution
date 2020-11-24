package typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DateTimeFormat extends js.Object
@JSGlobal("Sdk.Mdq.ValueEnums.DateTimeFormat")
@js.native
object DateTimeFormat extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DateTimeFormat with Double] = js.native
  
  @js.native
  sealed trait DateAndTime extends DateTimeFormat
  /* 0 */ @js.native
  object DateAndTime extends TopLevel[DateAndTime with Double]
  
  @js.native
  sealed trait DateOnly extends DateTimeFormat
  /* 1 */ @js.native
  object DateOnly extends TopLevel[DateOnly with Double]
}
