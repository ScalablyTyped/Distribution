package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScimSetInformationForProvisionedUserParamsName extends StObject {
  
  var familyName: String = js.native
  
  var givenName: String = js.native
}
object ScimSetInformationForProvisionedUserParamsName {
  
  @scala.inline
  def apply(familyName: String, givenName: String): ScimSetInformationForProvisionedUserParamsName = {
    val __obj = js.Dynamic.literal(familyName = familyName.asInstanceOf[js.Any], givenName = givenName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScimSetInformationForProvisionedUserParamsName]
  }
  
  @scala.inline
  implicit class ScimSetInformationForProvisionedUserParamsNameMutableBuilder[Self <: ScimSetInformationForProvisionedUserParamsName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
  }
}
