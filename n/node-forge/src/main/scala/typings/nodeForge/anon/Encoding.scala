package typings.nodeForge.anon

import typings.nodeForge.mod.pki.ed25519.ToNativeBufferParameters
import typings.nodeForge.nodeForgeStrings.binary
import typings.nodeForge.nodeForgeStrings.utf8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Encoding
  extends StObject
     with ToNativeBufferParameters {
  
  var encoding: binary | utf8
  
  var message: String
}
object Encoding {
  
  inline def apply(encoding: binary | utf8, message: String): Encoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encoding]
  }
  
  extension [Self <: Encoding](x: Self) {
    
    inline def setEncoding(value: binary | utf8): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
