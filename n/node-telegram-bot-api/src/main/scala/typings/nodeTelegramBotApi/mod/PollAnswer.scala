package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PollAnswer extends StObject {
  
  var option_ids: js.Array[Double]
  
  var poll_id: String
  
  var user: User
}
object PollAnswer {
  
  @scala.inline
  def apply(option_ids: js.Array[Double], poll_id: String, user: User): PollAnswer = {
    val __obj = js.Dynamic.literal(option_ids = option_ids.asInstanceOf[js.Any], poll_id = poll_id.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[PollAnswer]
  }
  
  @scala.inline
  implicit class PollAnswerMutableBuilder[Self <: PollAnswer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOption_ids(value: js.Array[Double]): Self = StObject.set(x, "option_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOption_idsVarargs(value: Double*): Self = StObject.set(x, "option_ids", js.Array(value :_*))
    
    @scala.inline
    def setPoll_id(value: String): Self = StObject.set(x, "poll_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
