package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.deleted_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hook extends StObject {
  
  /** @enum {string} */
  var action: deleted_
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  /** @description The modified webhook. This will contain different keys based on the type of webhook it is: repository, organization, business, app, or GitHub Marketplace. */
  var hook: ActiveConfig
  
  /** @description The id of the modified webhook. */
  var hook_id: Double
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  var repository: js.UndefOr[Allowupdatebranch | Null] = js.undefined
  
  var sender: js.UndefOr[Avatarurl] = js.undefined
}
object Hook {
  
  inline def apply(hook: ActiveConfig, hook_id: Double): Hook = {
    val __obj = js.Dynamic.literal(action = "deleted", hook = hook.asInstanceOf[js.Any], hook_id = hook_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hook]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Hook] (val x: Self) extends AnyVal {
    
    inline def setAction(value: deleted_): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setHook(value: ActiveConfig): Self = StObject.set(x, "hook", value.asInstanceOf[js.Any])
    
    inline def setHook_id(value: Double): Self = StObject.set(x, "hook_id", value.asInstanceOf[js.Any])
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNull: Self = StObject.set(x, "repository", null)
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
  }
}
