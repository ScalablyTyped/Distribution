package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums

import org.scalablytyped.runtime.TopLevel
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums.SecurityTypes.Append
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums.SecurityTypes.Inheritance
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums.SecurityTypes.None
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums.SecurityTypes.ParentChild
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums.SecurityTypes.Pointer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SecurityTypes extends js.Object

@JSGlobal("Sdk.Mdq.ValueEnums.SecurityTypes")
@js.native
object SecurityTypes extends js.Object {
  @js.native
  sealed trait Append extends SecurityTypes
  
  @js.native
  sealed trait Inheritance extends SecurityTypes
  
  @js.native
  sealed trait None extends SecurityTypes
  
  @js.native
  sealed trait ParentChild extends SecurityTypes
  
  @js.native
  sealed trait Pointer extends SecurityTypes
  
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[SecurityTypes with scala.Double] = js.native
  /* 0 */ @js.native
  object Append
    extends TopLevel[Append with scala.Double]
  
  /* 1 */ @js.native
  object Inheritance
    extends TopLevel[Inheritance with scala.Double]
  
  /* 2 */ @js.native
  object None
    extends TopLevel[None with scala.Double]
  
  /* 3 */ @js.native
  object ParentChild
    extends TopLevel[ParentChild with scala.Double]
  
  /* 4 */ @js.native
  object Pointer
    extends TopLevel[Pointer with scala.Double]
  
}

