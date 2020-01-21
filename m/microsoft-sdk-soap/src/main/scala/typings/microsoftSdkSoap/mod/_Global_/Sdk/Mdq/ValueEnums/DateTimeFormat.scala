package typings.microsoftSdkSoap.mod._Global_.Sdk.Mdq.ValueEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DateTimeFormat extends js.Object

@JSGlobal("Sdk.Mdq.ValueEnums.DateTimeFormat")
@js.native
object DateTimeFormat extends js.Object {
  @js.native
  sealed trait DateAndTime extends DateTimeFormat
  
  @js.native
  sealed trait DateOnly extends DateTimeFormat
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DateTimeFormat with Double] = js.native
  /* 0 */ @js.native
  object DateAndTime extends TopLevel[DateAndTime with Double]
  
  /* 1 */ @js.native
  object DateOnly extends TopLevel[DateOnly with Double]
  
}

