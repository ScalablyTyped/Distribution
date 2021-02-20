package typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SecurityTypes extends StObject
@JSGlobal("Sdk.Mdq.ValueEnums.SecurityTypes")
@js.native
object SecurityTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SecurityTypes with Double] = js.native
  
  @js.native
  sealed trait Append extends SecurityTypes
  /* 0 */ val Append: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.SecurityTypes.Append with Double = js.native
  
  @js.native
  sealed trait Inheritance extends SecurityTypes
  /* 1 */ val Inheritance: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.SecurityTypes.Inheritance with Double = js.native
  
  @js.native
  sealed trait None extends SecurityTypes
  /* 2 */ val None: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.SecurityTypes.None with Double = js.native
  
  @js.native
  sealed trait ParentChild extends SecurityTypes
  /* 3 */ val ParentChild: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.SecurityTypes.ParentChild with Double = js.native
  
  @js.native
  sealed trait Pointer extends SecurityTypes
  /* 4 */ val Pointer: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.SecurityTypes.Pointer with Double = js.native
}
