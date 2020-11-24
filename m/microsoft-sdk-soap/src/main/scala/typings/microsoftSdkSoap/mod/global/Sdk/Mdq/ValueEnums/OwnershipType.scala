package typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OwnershipType extends js.Object
@JSGlobal("Sdk.Mdq.ValueEnums.OwnershipType")
@js.native
object OwnershipType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OwnershipType with Double] = js.native
  
  @js.native
  sealed trait None extends OwnershipType
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait OrganizationOwned extends OwnershipType
  /* 1 */ @js.native
  object OrganizationOwned extends TopLevel[OrganizationOwned with Double]
  
  @js.native
  sealed trait TeamOwned extends OwnershipType
  /* 2 */ @js.native
  object TeamOwned extends TopLevel[TeamOwned with Double]
  
  @js.native
  sealed trait UserOwned extends OwnershipType
  /* 3 */ @js.native
  object UserOwned extends TopLevel[UserOwned with Double]
}
