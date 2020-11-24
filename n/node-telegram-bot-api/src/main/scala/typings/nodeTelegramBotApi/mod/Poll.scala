package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Poll extends js.Object {
  
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
  implicit class PollOps[Self <: Poll] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllows_multiple_answers(value: Boolean): Self = this.set("allows_multiple_answers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_anonymous(value: Boolean): Self = this.set("is_anonymous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_closed(value: Boolean): Self = this.set("is_closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsVarargs(value: PollOption*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[PollOption]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestion(value: String): Self = this.set("question", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_voter_count(value: Double): Self = this.set("total_voter_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PollType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
