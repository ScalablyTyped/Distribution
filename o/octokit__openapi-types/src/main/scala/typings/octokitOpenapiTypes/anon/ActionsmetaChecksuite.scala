package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.rerequested
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsmetaChecksuite extends StObject {
  
  /** @enum {string} */
  var action: rerequested
  
  var actions_meta: js.UndefOr[Reruninfo | Null] = js.undefined
  
  /** @description The [check_suite](https://docs.github.com/rest/reference/checks#suites). */
  var check_suite: Rerequestable
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  var repository: Allowupdatebranch
  
  var sender: Avatarurl
}
object ActionsmetaChecksuite {
  
  inline def apply(check_suite: Rerequestable, repository: Allowupdatebranch, sender: Avatarurl): ActionsmetaChecksuite = {
    val __obj = js.Dynamic.literal(action = "rerequested", check_suite = check_suite.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsmetaChecksuite]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionsmetaChecksuite] (val x: Self) extends AnyVal {
    
    inline def setAction(value: rerequested): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActions_meta(value: Reruninfo): Self = StObject.set(x, "actions_meta", value.asInstanceOf[js.Any])
    
    inline def setActions_metaNull: Self = StObject.set(x, "actions_meta", null)
    
    inline def setActions_metaUndefined: Self = StObject.set(x, "actions_meta", js.undefined)
    
    inline def setCheck_suite(value: Rerequestable): Self = StObject.set(x, "check_suite", value.asInstanceOf[js.Any])
    
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
