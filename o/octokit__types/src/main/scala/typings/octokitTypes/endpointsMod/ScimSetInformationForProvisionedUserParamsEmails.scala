package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScimSetInformationForProvisionedUserParamsEmails extends StObject {
  
  var primary: Boolean = js.native
  
  var `type`: String = js.native
  
  var value: String = js.native
}
object ScimSetInformationForProvisionedUserParamsEmails {
  
  @scala.inline
  def apply(primary: Boolean, `type`: String, value: String): ScimSetInformationForProvisionedUserParamsEmails = {
    val __obj = js.Dynamic.literal(primary = primary.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScimSetInformationForProvisionedUserParamsEmails]
  }
  
  @scala.inline
  implicit class ScimSetInformationForProvisionedUserParamsEmailsMutableBuilder[Self <: ScimSetInformationForProvisionedUserParamsEmails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
