package typings.plugapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawChatMessage extends StObject {
  
  var cid: String
  
  var message: String
  
  var sub: Double
  
  var uid: Double
  
  var un: String
}
object RawChatMessage {
  
  @scala.inline
  def apply(cid: String, message: String, sub: Double, uid: Double, un: String): RawChatMessage = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], un = un.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawChatMessage]
  }
  
  @scala.inline
  implicit class RawChatMessageMutableBuilder[Self <: RawChatMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSub(value: Double): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUn(value: String): Self = StObject.set(x, "un", value.asInstanceOf[js.Any])
  }
}
