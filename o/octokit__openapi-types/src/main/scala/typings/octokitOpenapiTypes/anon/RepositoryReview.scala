package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.edited
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositoryReview extends StObject {
  
  /** @enum {string} */
  var action: edited
  
  var changes: `527`
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  /** Simple Pull Request */
  var pull_request: AutomergeBase
  
  var repository: Allowupdatebranch
  
  /** @description The review that was affected. */
  var review: IdLinks
  
  var sender: Avatarurl
}
object RepositoryReview {
  
  inline def apply(
    changes: `527`,
    pull_request: AutomergeBase,
    repository: Allowupdatebranch,
    review: IdLinks,
    sender: Avatarurl
  ): RepositoryReview = {
    val __obj = js.Dynamic.literal(action = "edited", changes = changes.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], review = review.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryReview]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RepositoryReview] (val x: Self) extends AnyVal {
    
    inline def setAction(value: edited): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setChanges(value: `527`): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setPull_request(value: AutomergeBase): Self = StObject.set(x, "pull_request", value.asInstanceOf[js.Any])
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setReview(value: IdLinks): Self = StObject.set(x, "review", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
