package typings.mz.anon

import typings.std.Int16Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferInt16Array extends StObject {
  
  var buffer: Int16Array
  
  var bytesRead: Double
}
object BufferInt16Array {
  
  inline def apply(buffer: Int16Array, bytesRead: Double): BufferInt16Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferInt16Array]
  }
  
  extension [Self <: BufferInt16Array](x: Self) {
    
    inline def setBuffer(value: Int16Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBytesRead(value: Double): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
  }
}
