package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.converted_to_draft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseInstallationNumber extends StObject {
  
  /** @enum {string} */
  var action: converted_to_draft
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  /** @description The pull request number. */
  var number: Double
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  var pull_request: Locked & Mergecommitmessage
  
  var repository: Allowupdatebranch
  
  var sender: Avatarurl
}
object EnterpriseInstallationNumber {
  
  inline def apply(
    number: Double,
    pull_request: Locked & Mergecommitmessage,
    repository: Allowupdatebranch,
    sender: Avatarurl
  ): EnterpriseInstallationNumber = {
    val __obj = js.Dynamic.literal(action = "converted_to_draft", number = number.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseInstallationNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnterpriseInstallationNumber] (val x: Self) extends AnyVal {
    
    inline def setAction(value: converted_to_draft): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setPull_request(value: Locked & Mergecommitmessage): Self = StObject.set(x, "pull_request", value.asInstanceOf[js.Any])
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
