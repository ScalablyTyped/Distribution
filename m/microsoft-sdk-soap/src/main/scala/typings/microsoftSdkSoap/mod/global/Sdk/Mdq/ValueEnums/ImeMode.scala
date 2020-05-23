package typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ImeMode extends js.Object

@JSGlobal("Sdk.Mdq.ValueEnums.ImeMode")
@js.native
object ImeMode extends js.Object {
  @js.native
  sealed trait Active extends ImeMode
  
  @js.native
  sealed trait Auto extends ImeMode
  
  @js.native
  sealed trait Disabled extends ImeMode
  
  @js.native
  sealed trait Inactive extends ImeMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ImeMode with Double] = js.native
  /* 0 */ @js.native
  object Active extends TopLevel[Active with Double]
  
  /* 1 */ @js.native
  object Auto extends TopLevel[Auto with Double]
  
  /* 2 */ @js.native
  object Disabled extends TopLevel[Disabled with Double]
  
  /* 3 */ @js.native
  object Inactive extends TopLevel[Inactive with Double]
  
}

