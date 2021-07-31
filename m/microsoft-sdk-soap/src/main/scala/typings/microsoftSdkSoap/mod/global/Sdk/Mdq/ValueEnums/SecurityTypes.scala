package typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SecurityTypes extends StObject
@JSGlobal("Sdk.Mdq.ValueEnums.SecurityTypes")
@js.native
object SecurityTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SecurityTypes & Double] = js.native
  
  @js.native
  sealed trait Append
    extends StObject
       with SecurityTypes
  /* 0 */ val Append: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.SecurityTypes.Append & Double = js.native
  
  @js.native
  sealed trait Inheritance
    extends StObject
       with SecurityTypes
  /* 1 */ val Inheritance: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.SecurityTypes.Inheritance & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with SecurityTypes
  /* 2 */ val None: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.SecurityTypes.None & Double = js.native
  
  @js.native
  sealed trait ParentChild
    extends StObject
       with SecurityTypes
  /* 3 */ val ParentChild: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.SecurityTypes.ParentChild & Double = js.native
  
  @js.native
  sealed trait Pointer
    extends StObject
       with SecurityTypes
  /* 4 */ val Pointer: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.SecurityTypes.Pointer & Double = js.native
}
