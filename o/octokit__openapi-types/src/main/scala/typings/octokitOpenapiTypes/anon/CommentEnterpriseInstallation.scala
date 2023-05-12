package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.deleted_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentEnterpriseInstallation extends StObject {
  
  /** @enum {string} */
  var action: deleted_
  
  /**
    * Pull Request Review Comment
    * @description The [comment](https://docs.github.com/rest/reference/pulls#comments) itself.
    */
  var comment: Originalposition
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  var pull_request: Reviewcommentsurl
  
  var repository: Allowupdatebranch
  
  var sender: Avatarurl
}
object CommentEnterpriseInstallation {
  
  inline def apply(
    comment: Originalposition,
    pull_request: Reviewcommentsurl,
    repository: Allowupdatebranch,
    sender: Avatarurl
  ): CommentEnterpriseInstallation = {
    val __obj = js.Dynamic.literal(action = "deleted", comment = comment.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentEnterpriseInstallation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommentEnterpriseInstallation] (val x: Self) extends AnyVal {
    
    inline def setAction(value: deleted_): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setComment(value: Originalposition): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setPull_request(value: Reviewcommentsurl): Self = StObject.set(x, "pull_request", value.asInstanceOf[js.Any])
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
