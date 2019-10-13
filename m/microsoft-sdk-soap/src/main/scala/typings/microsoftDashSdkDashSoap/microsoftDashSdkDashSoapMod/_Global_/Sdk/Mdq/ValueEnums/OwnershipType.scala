package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OwnershipType extends js.Object

@JSGlobal("Sdk.Mdq.ValueEnums.OwnershipType")
@js.native
object OwnershipType extends js.Object {
  @js.native
  sealed trait None extends OwnershipType
  
  @js.native
  sealed trait OrganizationOwned extends OwnershipType
  
  @js.native
  sealed trait TeamOwned extends OwnershipType
  
  @js.native
  sealed trait UserOwned extends OwnershipType
  
  /* 0 */ val None: typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums.OwnershipType.None with scala.Double = js.native
  /* 1 */ val OrganizationOwned: typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums.OwnershipType.OrganizationOwned with scala.Double = js.native
  /* 2 */ val TeamOwned: typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums.OwnershipType.TeamOwned with scala.Double = js.native
  /* 3 */ val UserOwned: typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.ValueEnums.OwnershipType.UserOwned with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[OwnershipType with scala.Double] = js.native
}

