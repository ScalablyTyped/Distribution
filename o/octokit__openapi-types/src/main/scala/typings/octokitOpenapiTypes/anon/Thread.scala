package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.resolved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Thread extends StObject {
  
  /** @enum {string} */
  var action: resolved
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  /** Simple Pull Request */
  var pull_request: CommentsurlCommitsurl
  
  var repository: Allowupdatebranch
  
  var sender: js.UndefOr[Avatarurl] = js.undefined
  
  var thread: CommentsNodeid
}
object Thread {
  
  inline def apply(pull_request: CommentsurlCommitsurl, repository: Allowupdatebranch, thread: CommentsNodeid): Thread = {
    val __obj = js.Dynamic.literal(action = "resolved", pull_request = pull_request.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], thread = thread.asInstanceOf[js.Any])
    __obj.asInstanceOf[Thread]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Thread] (val x: Self) extends AnyVal {
    
    inline def setAction(value: resolved): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setPull_request(value: CommentsurlCommitsurl): Self = StObject.set(x, "pull_request", value.asInstanceOf[js.Any])
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
    
    inline def setThread(value: CommentsNodeid): Self = StObject.set(x, "thread", value.asInstanceOf[js.Any])
  }
}
