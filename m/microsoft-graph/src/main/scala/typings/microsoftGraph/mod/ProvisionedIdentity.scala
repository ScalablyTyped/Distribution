package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisionedIdentity
  extends StObject
     with Identity {
  
  // Details of the identity.
  var details: js.UndefOr[NullableOption[DetailsInfo]] = js.undefined
  
  // Type of identity that has been provisioned, such as 'user' or 'group'.
  var identityType: js.UndefOr[NullableOption[String]] = js.undefined
}
object ProvisionedIdentity {
  
  inline def apply(): ProvisionedIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionedIdentity]
  }
  
  extension [Self <: ProvisionedIdentity](x: Self) {
    
    inline def setDetails(value: NullableOption[DetailsInfo]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsNull: Self = StObject.set(x, "details", null)
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setIdentityType(value: NullableOption[String]): Self = StObject.set(x, "identityType", value.asInstanceOf[js.Any])
    
    inline def setIdentityTypeNull: Self = StObject.set(x, "identityType", null)
    
    inline def setIdentityTypeUndefined: Self = StObject.set(x, "identityType", js.undefined)
  }
}
