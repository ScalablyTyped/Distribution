package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.revoked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlertPushprotectionbypassedat extends StObject {
  
  /** @enum {string} */
  var action: revoked
  
  var alert: Pushprotectionbypassedat
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  var repository: Allowupdatebranch
  
  var sender: js.UndefOr[Avatarurl] = js.undefined
}
object AlertPushprotectionbypassedat {
  
  inline def apply(alert: Pushprotectionbypassedat, repository: Allowupdatebranch): AlertPushprotectionbypassedat = {
    val __obj = js.Dynamic.literal(action = "revoked", alert = alert.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertPushprotectionbypassedat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlertPushprotectionbypassedat] (val x: Self) extends AnyVal {
    
    inline def setAction(value: revoked): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setAlert(value: Pushprotectionbypassedat): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
  }
}
