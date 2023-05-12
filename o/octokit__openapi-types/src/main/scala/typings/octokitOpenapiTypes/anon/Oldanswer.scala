package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.unanswered
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Oldanswer extends StObject {
  
  /** @enum {string} */
  var action: unanswered
  
  var discussion: Answerchosenat
  
  var old_answer: Childcommentcount
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  var repository: Allowupdatebranch
  
  var sender: js.UndefOr[Avatarurl] = js.undefined
}
object Oldanswer {
  
  inline def apply(discussion: Answerchosenat, old_answer: Childcommentcount, repository: Allowupdatebranch): Oldanswer = {
    val __obj = js.Dynamic.literal(action = "unanswered", discussion = discussion.asInstanceOf[js.Any], old_answer = old_answer.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[Oldanswer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Oldanswer] (val x: Self) extends AnyVal {
    
    inline def setAction(value: unanswered): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setDiscussion(value: Answerchosenat): Self = StObject.set(x, "discussion", value.asInstanceOf[js.Any])
    
    inline def setOld_answer(value: Childcommentcount): Self = StObject.set(x, "old_answer", value.asInstanceOf[js.Any])
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
  }
}
