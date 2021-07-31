package typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OwnershipType extends StObject
@JSGlobal("Sdk.Mdq.ValueEnums.OwnershipType")
@js.native
object OwnershipType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OwnershipType & Double] = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with OwnershipType
  /* 0 */ val None: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.OwnershipType.None & Double = js.native
  
  @js.native
  sealed trait OrganizationOwned
    extends StObject
       with OwnershipType
  /* 1 */ val OrganizationOwned: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.OwnershipType.OrganizationOwned & Double = js.native
  
  @js.native
  sealed trait TeamOwned
    extends StObject
       with OwnershipType
  /* 2 */ val TeamOwned: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.OwnershipType.TeamOwned & Double = js.native
  
  @js.native
  sealed trait UserOwned
    extends StObject
       with OwnershipType
  /* 3 */ val UserOwned: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.OwnershipType.UserOwned & Double = js.native
}
