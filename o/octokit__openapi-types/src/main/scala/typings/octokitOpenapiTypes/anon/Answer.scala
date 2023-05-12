package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.answered
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Answer extends StObject {
  
  /** @enum {string} */
  var action: answered
  
  var answer: Childcommentcount
  
  var discussion: Answerchosenat
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  var repository: Allowupdatebranch
  
  var sender: Avatarurl
}
object Answer {
  
  inline def apply(
    answer: Childcommentcount,
    discussion: Answerchosenat,
    repository: Allowupdatebranch,
    sender: Avatarurl
  ): Answer = {
    val __obj = js.Dynamic.literal(action = "answered", answer = answer.asInstanceOf[js.Any], discussion = discussion.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[Answer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Answer] (val x: Self) extends AnyVal {
    
    inline def setAction(value: answered): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setAnswer(value: Childcommentcount): Self = StObject.set(x, "answer", value.asInstanceOf[js.Any])
    
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
