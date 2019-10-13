package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums

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
  
  /* 0 */ val Active: typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums.ImeMode.Active with scala.Double = js.native
  /* 1 */ val Auto: typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums.ImeMode.Auto with scala.Double = js.native
  /* 2 */ val Disabled: typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums.ImeMode.Disabled with scala.Double = js.native
  /* 3 */ val Inactive: typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums.ImeMode.Inactive with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ImeMode with scala.Double] = js.native
}

