package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AttributeRequiredLevel extends js.Object

@JSGlobal("Sdk.Mdq.ValueEnums.AttributeRequiredLevel")
@js.native
object AttributeRequiredLevel extends js.Object {
  @js.native
  sealed trait ApplicationRequired extends AttributeRequiredLevel
  
  @js.native
  sealed trait None extends AttributeRequiredLevel
  
  @js.native
  sealed trait Recommended extends AttributeRequiredLevel
  
  @js.native
  sealed trait SystemRequired extends AttributeRequiredLevel
  
  /* 0 */ val ApplicationRequired: typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums.AttributeRequiredLevel.ApplicationRequired with scala.Double = js.native
  /* 1 */ val None: typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums.AttributeRequiredLevel.None with scala.Double = js.native
  /* 2 */ val Recommended: typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums.AttributeRequiredLevel.Recommended with scala.Double = js.native
  /* 3 */ val SystemRequired: typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums.AttributeRequiredLevel.SystemRequired with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[AttributeRequiredLevel with scala.Double] = js.native
}

