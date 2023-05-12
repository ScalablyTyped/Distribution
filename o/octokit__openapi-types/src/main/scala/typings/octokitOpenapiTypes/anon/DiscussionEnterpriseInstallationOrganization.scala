package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.unlocked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiscussionEnterpriseInstallationOrganization extends StObject {
  
  /** @enum {string} */
  var action: unlocked
  
  var discussion: Answerchosenat
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  var repository: Allowupdatebranch
  
  var sender: Avatarurl
}
object DiscussionEnterpriseInstallationOrganization {
  
  inline def apply(discussion: Answerchosenat, repository: Allowupdatebranch, sender: Avatarurl): DiscussionEnterpriseInstallationOrganization = {
    val __obj = js.Dynamic.literal(action = "unlocked", discussion = discussion.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscussionEnterpriseInstallationOrganization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiscussionEnterpriseInstallationOrganization] (val x: Self) extends AnyVal {
    
    inline def setAction(value: unlocked): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setDiscussion(value: Answerchosenat): Self = StObject.set(x, "discussion", value.asInstanceOf[js.Any])
    
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
