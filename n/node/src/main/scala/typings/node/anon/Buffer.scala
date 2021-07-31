package typings.node.anon

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Buffer[TBuffer /* <: Uint8Array */] extends StObject {
  
  var buffer: TBuffer
  
  var bytesRead: Double
}
object Buffer {
  
  @scala.inline
  def apply[TBuffer /* <: Uint8Array */](buffer: TBuffer, bytesRead: Double): Buffer[TBuffer] = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffer[TBuffer]]
  }
  
  @scala.inline
  implicit class BufferMutableBuilder[Self <: Buffer[?], TBuffer /* <: Uint8Array */] (val x: Self & Buffer[TBuffer]) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: TBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesRead(value: Double): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
  }
}
