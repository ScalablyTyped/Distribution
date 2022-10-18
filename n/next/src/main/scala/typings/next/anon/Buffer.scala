package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Buffer extends StObject {
  
  var buffer: typings.node.bufferMod.global.Buffer
  
  var contentType: String
  
  var maxAge: Double
}
object Buffer {
  
  inline def apply(buffer: typings.node.bufferMod.global.Buffer, contentType: String, maxAge: Double): Buffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], maxAge = maxAge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffer]
  }
  
  extension [Self <: Buffer](x: Self) {
    
    inline def setBuffer(value: typings.node.bufferMod.global.Buffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
  }
}
