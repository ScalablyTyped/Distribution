package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScimProvisionAndInviteUserParamsEmails extends StObject {
  
  var primary: Boolean
  
  var `type`: String
  
  var value: String
}
object ScimProvisionAndInviteUserParamsEmails {
  
  @scala.inline
  def apply(primary: Boolean, `type`: String, value: String): ScimProvisionAndInviteUserParamsEmails = {
    val __obj = js.Dynamic.literal(primary = primary.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScimProvisionAndInviteUserParamsEmails]
  }
  
  @scala.inline
  implicit class ScimProvisionAndInviteUserParamsEmailsMutableBuilder[Self <: ScimProvisionAndInviteUserParamsEmails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
