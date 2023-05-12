package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.review_requested
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestedreviewerSender extends StObject {
  
  /** @enum {string} */
  var action: review_requested
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  /** @description The pull request number. */
  var number: Double
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  /** Pull Request */
  var pull_request: AdditionsAssignee
  
  var repository: Allowupdatebranch
  
  /** User */
  var requested_reviewer: Organizationsurl | Null
  
  var sender: Avatarurl
}
object RequestedreviewerSender {
  
  inline def apply(number: Double, pull_request: AdditionsAssignee, repository: Allowupdatebranch, sender: Avatarurl): RequestedreviewerSender = {
    val __obj = js.Dynamic.literal(action = "review_requested", number = number.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], requested_reviewer = null)
    __obj.asInstanceOf[RequestedreviewerSender]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestedreviewerSender] (val x: Self) extends AnyVal {
    
    inline def setAction(value: review_requested): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setPull_request(value: AdditionsAssignee): Self = StObject.set(x, "pull_request", value.asInstanceOf[js.Any])
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRequested_reviewer(value: Organizationsurl): Self = StObject.set(x, "requested_reviewer", value.asInstanceOf[js.Any])
    
    inline def setRequested_reviewerNull: Self = StObject.set(x, "requested_reviewer", null)
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
