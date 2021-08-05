package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScimProvisionAndInviteUserParamsName extends StObject {
  
  var familyName: String
  
  var givenName: String
}
object ScimProvisionAndInviteUserParamsName {
  
  inline def apply(familyName: String, givenName: String): ScimProvisionAndInviteUserParamsName = {
    val __obj = js.Dynamic.literal(familyName = familyName.asInstanceOf[js.Any], givenName = givenName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScimProvisionAndInviteUserParamsName]
  }
  
  extension [Self <: ScimProvisionAndInviteUserParamsName](x: Self) {
    
    inline def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
    
    inline def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
  }
}
