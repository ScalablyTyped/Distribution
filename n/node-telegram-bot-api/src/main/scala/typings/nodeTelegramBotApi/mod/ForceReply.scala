package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForceReply extends StObject {
  
  var force_reply: Boolean
  
  var input_field_placeholder: js.UndefOr[String] = js.undefined
  
  var selective: js.UndefOr[Boolean] = js.undefined
}
object ForceReply {
  
  inline def apply(force_reply: Boolean): ForceReply = {
    val __obj = js.Dynamic.literal(force_reply = force_reply.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceReply]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ForceReply] (val x: Self) extends AnyVal {
    
    inline def setForce_reply(value: Boolean): Self = StObject.set(x, "force_reply", value.asInstanceOf[js.Any])
    
    inline def setInput_field_placeholder(value: String): Self = StObject.set(x, "input_field_placeholder", value.asInstanceOf[js.Any])
    
    inline def setInput_field_placeholderUndefined: Self = StObject.set(x, "input_field_placeholder", js.undefined)
    
    inline def setSelective(value: Boolean): Self = StObject.set(x, "selective", value.asInstanceOf[js.Any])
    
    inline def setSelectiveUndefined: Self = StObject.set(x, "selective", js.undefined)
  }
}
