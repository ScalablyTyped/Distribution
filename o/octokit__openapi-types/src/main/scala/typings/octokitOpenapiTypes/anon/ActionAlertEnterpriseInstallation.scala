package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.create
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionAlertEnterpriseInstallation extends StObject {
  
  /** @enum {string} */
  var action: create
  
  var alert: Affectedpackagename
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  var repository: Allowupdatebranch
  
  var sender: Avatarurl
}
object ActionAlertEnterpriseInstallation {
  
  inline def apply(alert: Affectedpackagename, repository: Allowupdatebranch, sender: Avatarurl): ActionAlertEnterpriseInstallation = {
    val __obj = js.Dynamic.literal(action = "create", alert = alert.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionAlertEnterpriseInstallation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionAlertEnterpriseInstallation] (val x: Self) extends AnyVal {
    
    inline def setAction(value: create): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setAlert(value: Affectedpackagename): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
