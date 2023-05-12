package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Targettype extends StObject {
  
  var account: Following
  
  var action: String
  
  var changes: LoginSlug
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: NodeidString
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  var repository: js.UndefOr[Allowupdatebranch] = js.undefined
  
  var sender: js.UndefOr[Avatarurl] = js.undefined
  
  var target_type: String
}
object Targettype {
  
  inline def apply(
    account: Following,
    action: String,
    changes: LoginSlug,
    installation: NodeidString,
    target_type: String
  ): Targettype = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], action = action.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any], installation = installation.asInstanceOf[js.Any], target_type = target_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Targettype]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Targettype] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: Following): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setChanges(value: LoginSlug): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
    
    inline def setTarget_type(value: String): Self = StObject.set(x, "target_type", value.asInstanceOf[js.Any])
  }
}
