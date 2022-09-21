package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Buffer[TBuffer /* <: js.typedarray.Uint8Array */] extends StObject {
  
  var buffer: TBuffer
  
  var bytesWritten: Double
}
object Buffer {
  
  inline def apply[TBuffer /* <: js.typedarray.Uint8Array */](buffer: TBuffer, bytesWritten: Double): Buffer[TBuffer] = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffer[TBuffer]]
  }
  
  extension [Self <: Buffer[?], TBuffer /* <: js.typedarray.Uint8Array */](x: Self & Buffer[TBuffer]) {
    
    inline def setBuffer(value: TBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
  }
}
