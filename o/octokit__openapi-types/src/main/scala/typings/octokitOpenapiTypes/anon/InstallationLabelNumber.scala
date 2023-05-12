package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.unlabeled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstallationLabelNumber extends StObject {
  
  /** @enum {string} */
  var action: unlabeled
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  /** Label */
  var label: js.UndefOr[ColorDefaultDescription] = js.undefined
  
  /** @description The pull request number. */
  var number: Double
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  /** Pull Request */
  var pull_request: Mergeable
  
  var repository: Allowupdatebranch
  
  var sender: Avatarurl
}
object InstallationLabelNumber {
  
  inline def apply(number: Double, pull_request: Mergeable, repository: Allowupdatebranch, sender: Avatarurl): InstallationLabelNumber = {
    val __obj = js.Dynamic.literal(action = "unlabeled", number = number.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallationLabelNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstallationLabelNumber] (val x: Self) extends AnyVal {
    
    inline def setAction(value: unlabeled): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setLabel(value: ColorDefaultDescription): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setPull_request(value: Mergeable): Self = StObject.set(x, "pull_request", value.asInstanceOf[js.Any])
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
