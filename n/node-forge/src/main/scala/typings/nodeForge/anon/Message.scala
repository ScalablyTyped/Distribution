package typings.nodeForge.anon

import typings.nodeForge.mod.pki.ed25519.NativeBuffer
import typings.nodeForge.mod.pki.ed25519.ToNativeBufferParameters
import typings.nodeForge.mod.util.ByteBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message
  extends StObject
     with ToNativeBufferParameters {
  
  var message: NativeBuffer | ByteBuffer
}
object Message {
  
  inline def apply(message: NativeBuffer | ByteBuffer): Message = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: NativeBuffer | ByteBuffer): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
