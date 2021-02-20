package typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OwnershipType extends StObject
@JSGlobal("Sdk.Mdq.ValueEnums.OwnershipType")
@js.native
object OwnershipType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OwnershipType with Double] = js.native
  
  @js.native
  sealed trait None extends OwnershipType
  /* 0 */ val None: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.OwnershipType.None with Double = js.native
  
  @js.native
  sealed trait OrganizationOwned extends OwnershipType
  /* 1 */ val OrganizationOwned: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.OwnershipType.OrganizationOwned with Double = js.native
  
  @js.native
  sealed trait TeamOwned extends OwnershipType
  /* 2 */ val TeamOwned: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.OwnershipType.TeamOwned with Double = js.native
  
  @js.native
  sealed trait UserOwned extends OwnershipType
  /* 3 */ val UserOwned: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.OwnershipType.UserOwned with Double = js.native
}
