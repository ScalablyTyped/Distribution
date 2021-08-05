package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForceReply extends StObject {
  
  var force_reply: Boolean
  
  var selective: js.UndefOr[Boolean] = js.undefined
}
object ForceReply {
  
  inline def apply(force_reply: Boolean): ForceReply = {
    val __obj = js.Dynamic.literal(force_reply = force_reply.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceReply]
  }
  
  extension [Self <: ForceReply](x: Self) {
    
    inline def setForce_reply(value: Boolean): Self = StObject.set(x, "force_reply", value.asInstanceOf[js.Any])
    
    inline def setSelective(value: Boolean): Self = StObject.set(x, "selective", value.asInstanceOf[js.Any])
    
    inline def setSelectiveUndefined: Self = StObject.set(x, "selective", js.undefined)
  }
}
