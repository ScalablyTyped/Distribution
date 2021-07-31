package typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ImeMode extends StObject
@JSGlobal("Sdk.Mdq.ValueEnums.ImeMode")
@js.native
object ImeMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ImeMode & Double] = js.native
  
  @js.native
  sealed trait Active
    extends StObject
       with ImeMode
  /* 0 */ val Active: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.ImeMode.Active & Double = js.native
  
  @js.native
  sealed trait Auto
    extends StObject
       with ImeMode
  /* 1 */ val Auto: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.ImeMode.Auto & Double = js.native
  
  @js.native
  sealed trait Disabled
    extends StObject
       with ImeMode
  /* 2 */ val Disabled: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.ImeMode.Disabled & Double = js.native
  
  @js.native
  sealed trait Inactive
    extends StObject
       with ImeMode
  /* 3 */ val Inactive: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.ImeMode.Inactive & Double = js.native
}
