package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.requested
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionActionsmeta extends StObject {
  
  /** @enum {string} */
  var action: requested
  
  var actions_meta: js.UndefOr[(Record[String, Any]) | Null] = js.undefined
  
  /** @description The [check_suite](https://docs.github.com/rest/reference/checks#suites). */
  var check_suite: Latestcheckrunscount
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  var repository: Allowupdatebranch
  
  var sender: Avatarurl
}
object ActionActionsmeta {
  
  inline def apply(check_suite: Latestcheckrunscount, repository: Allowupdatebranch, sender: Avatarurl): ActionActionsmeta = {
    val __obj = js.Dynamic.literal(action = "requested", check_suite = check_suite.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionActionsmeta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionActionsmeta] (val x: Self) extends AnyVal {
    
    inline def setAction(value: requested): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActions_meta(value: Record[String, Any]): Self = StObject.set(x, "actions_meta", value.asInstanceOf[js.Any])
    
    inline def setActions_metaNull: Self = StObject.set(x, "actions_meta", null)
    
    inline def setActions_metaUndefined: Self = StObject.set(x, "actions_meta", js.undefined)
    
    inline def setCheck_suite(value: Latestcheckrunscount): Self = StObject.set(x, "check_suite", value.asInstanceOf[js.Any])
    
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
