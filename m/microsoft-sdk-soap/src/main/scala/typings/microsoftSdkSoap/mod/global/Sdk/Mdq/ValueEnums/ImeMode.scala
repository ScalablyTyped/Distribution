package typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ImeMode extends StObject
@JSGlobal("Sdk.Mdq.ValueEnums.ImeMode")
@js.native
object ImeMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ImeMode with Double] = js.native
  
  @js.native
  sealed trait Active extends ImeMode
  /* 0 */ val Active: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.ImeMode.Active with Double = js.native
  
  @js.native
  sealed trait Auto extends ImeMode
  /* 1 */ val Auto: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.ImeMode.Auto with Double = js.native
  
  @js.native
  sealed trait Disabled extends ImeMode
  /* 2 */ val Disabled: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.ImeMode.Disabled with Double = js.native
  
  @js.native
  sealed trait Inactive extends ImeMode
  /* 3 */ val Inactive: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.ImeMode.Inactive with Double = js.native
}
