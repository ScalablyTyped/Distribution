package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums

import org.scalablytyped.runtime.TopLevel
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums.ImeMode.Active
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums.ImeMode.Auto
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums.ImeMode.Disabled
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums.ImeMode.Inactive
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
  def apply(value: scala.Double): js.UndefOr[ImeMode with scala.Double] = js.native
  /* 0 */ @js.native
  object Active
    extends TopLevel[Active with scala.Double]
  
  /* 1 */ @js.native
  object Auto
    extends TopLevel[Auto with scala.Double]
  
  /* 2 */ @js.native
  object Disabled
    extends TopLevel[Disabled with scala.Double]
  
  /* 3 */ @js.native
  object Inactive
    extends TopLevel[Inactive with scala.Double]
  
}

