package typings.microsoftSdkSoap.mod._Global_.Sdk.Mdq.ValueEnums

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OwnershipType with Double] = js.native
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object OrganizationOwned extends TopLevel[OrganizationOwned with Double]
  
  /* 2 */ @js.native
  object TeamOwned extends TopLevel[TeamOwned with Double]
  
  /* 3 */ @js.native
  object UserOwned extends TopLevel[UserOwned with Double]
  
}

