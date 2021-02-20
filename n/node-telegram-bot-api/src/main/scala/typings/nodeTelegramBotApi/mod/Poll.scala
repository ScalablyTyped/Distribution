package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Poll extends StObject {
  
  var allows_multiple_answers: Boolean = js.native
  
  var id: String = js.native
  
  var is_anonymous: Boolean = js.native
  
  var is_closed: Boolean = js.native
  
  var options: js.Array[PollOption] = js.native
  
  var question: String = js.native
  
  var total_voter_count: Double = js.native
  
  var `type`: PollType = js.native
}
object Poll {
  
  @scala.inline
  def apply(
    allows_multiple_answers: Boolean,
    id: String,
    is_anonymous: Boolean,
    is_closed: Boolean,
    options: js.Array[PollOption],
    question: String,
    total_voter_count: Double,
    `type`: PollType
  ): Poll = {
    val __obj = js.Dynamic.literal(allows_multiple_answers = allows_multiple_answers.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_anonymous = is_anonymous.asInstanceOf[js.Any], is_closed = is_closed.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], total_voter_count = total_voter_count.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Poll]
  }
  
  @scala.inline
  implicit class PollMutableBuilder[Self <: Poll] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllows_multiple_answers(value: Boolean): Self = StObject.set(x, "allows_multiple_answers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_anonymous(value: Boolean): Self = StObject.set(x, "is_anonymous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_closed(value: Boolean): Self = StObject.set(x, "is_closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: js.Array[PollOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsVarargs(value: PollOption*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setQuestion(value: String): Self = StObject.set(x, "question", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_voter_count(value: Double): Self = StObject.set(x, "total_voter_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PollType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
