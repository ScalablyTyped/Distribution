package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.added
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Member extends StObject {
  
  /** @enum {string} */
  var action: added
  
  var changes: js.UndefOr[`528`] = js.undefined
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  /** User */
  var member: Deleted | Null
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  var repository: Allowupdatebranch
  
  var sender: Avatarurl
}
object Member {
  
  inline def apply(repository: Allowupdatebranch, sender: Avatarurl): Member = {
    val __obj = js.Dynamic.literal(action = "added", repository = repository.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], member = null)
    __obj.asInstanceOf[Member]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Member] (val x: Self) extends AnyVal {
    
    inline def setAction(value: added): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setChanges(value: `528`): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setChangesUndefined: Self = StObject.set(x, "changes", js.undefined)
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setMember(value: Deleted): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    
    inline def setMemberNull: Self = StObject.set(x, "member", null)
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
