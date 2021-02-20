package typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AttributeRequiredLevel extends StObject
@JSGlobal("Sdk.Mdq.ValueEnums.AttributeRequiredLevel")
@js.native
object AttributeRequiredLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AttributeRequiredLevel with Double] = js.native
  
  @js.native
  sealed trait ApplicationRequired extends AttributeRequiredLevel
  /* 0 */ val ApplicationRequired: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.AttributeRequiredLevel.ApplicationRequired with Double = js.native
  
  @js.native
  sealed trait None extends AttributeRequiredLevel
  /* 1 */ val None: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.AttributeRequiredLevel.None with Double = js.native
  
  @js.native
  sealed trait Recommended extends AttributeRequiredLevel
  /* 2 */ val Recommended: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.AttributeRequiredLevel.Recommended with Double = js.native
  
  @js.native
  sealed trait SystemRequired extends AttributeRequiredLevel
  /* 3 */ val SystemRequired: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.AttributeRequiredLevel.SystemRequired with Double = js.native
}
