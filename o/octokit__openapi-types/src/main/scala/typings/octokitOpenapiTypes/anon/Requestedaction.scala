package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.requested_action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Requestedaction extends StObject {
  
  /** @enum {string} */
  var action: requested_action
  
  var check_run: Detailsurl
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  var repository: Allowupdatebranch
  
  /** @description The action requested by the user. */
  var requested_action: js.UndefOr[`526`] = js.undefined
  
  var sender: Avatarurl
}
object Requestedaction {
  
  inline def apply(check_run: Detailsurl, repository: Allowupdatebranch, sender: Avatarurl): Requestedaction = {
    val __obj = js.Dynamic.literal(action = "requested_action", check_run = check_run.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[Requestedaction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Requestedaction] (val x: Self) extends AnyVal {
    
    inline def setAction(value: requested_action): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setCheck_run(value: Detailsurl): Self = StObject.set(x, "check_run", value.asInstanceOf[js.Any])
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRequested_action(value: `526`): Self = StObject.set(x, "requested_action", value.asInstanceOf[js.Any])
    
    inline def setRequested_actionUndefined: Self = StObject.set(x, "requested_action", js.undefined)
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
