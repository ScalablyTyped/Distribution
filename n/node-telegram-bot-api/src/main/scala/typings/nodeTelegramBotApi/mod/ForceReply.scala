package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForceReply extends StObject {
  
  var force_reply: Boolean = js.native
  
  var selective: js.UndefOr[Boolean] = js.native
}
object ForceReply {
  
  @scala.inline
  def apply(force_reply: Boolean): ForceReply = {
    val __obj = js.Dynamic.literal(force_reply = force_reply.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceReply]
  }
  
  @scala.inline
  implicit class ForceReplyMutableBuilder[Self <: ForceReply] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForce_reply(value: Boolean): Self = StObject.set(x, "force_reply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelective(value: Boolean): Self = StObject.set(x, "selective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectiveUndefined: Self = StObject.set(x, "selective", js.undefined)
  }
}
