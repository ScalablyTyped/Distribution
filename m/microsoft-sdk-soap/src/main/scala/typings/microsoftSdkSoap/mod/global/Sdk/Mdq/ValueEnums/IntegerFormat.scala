package typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IntegerFormat extends js.Object
@JSGlobal("Sdk.Mdq.ValueEnums.IntegerFormat")
@js.native
object IntegerFormat extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IntegerFormat with Double] = js.native
  
  @js.native
  sealed trait Duration extends IntegerFormat
  /* 0 */ @js.native
  object Duration extends TopLevel[Duration with Double]
  
  @js.native
  sealed trait Language extends IntegerFormat
  /* 1 */ @js.native
  object Language extends TopLevel[Language with Double]
  
  @js.native
  sealed trait Locale extends IntegerFormat
  /* 2 */ @js.native
  object Locale extends TopLevel[Locale with Double]
  
  @js.native
  sealed trait None extends IntegerFormat
  /* 3 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait TimeZone extends IntegerFormat
  /* 4 */ @js.native
  object TimeZone extends TopLevel[TimeZone with Double]
}
