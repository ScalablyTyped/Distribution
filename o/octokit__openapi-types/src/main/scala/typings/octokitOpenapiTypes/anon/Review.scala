package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.dismissed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Review extends StObject {
  
  /** @enum {string} */
  var action: dismissed
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  /** Simple Pull Request */
  var pull_request: AuthorassociationAutomerge
  
  var repository: Allowupdatebranch
  
  /** @description The review that was affected. */
  var review: CommitidHtmlurl
  
  var sender: Avatarurl
}
object Review {
  
  inline def apply(
    pull_request: AuthorassociationAutomerge,
    repository: Allowupdatebranch,
    review: CommitidHtmlurl,
    sender: Avatarurl
  ): Review = {
    val __obj = js.Dynamic.literal(action = "dismissed", pull_request = pull_request.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], review = review.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[Review]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Review] (val x: Self) extends AnyVal {
    
    inline def setAction(value: dismissed): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setPull_request(value: AuthorassociationAutomerge): Self = StObject.set(x, "pull_request", value.asInstanceOf[js.Any])
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setReview(value: CommitidHtmlurl): Self = StObject.set(x, "review", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
