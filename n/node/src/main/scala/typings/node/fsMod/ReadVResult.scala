package typings.node.fsMod

import typings.node.NodeJS.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadVResult extends StObject {
  
  var buffers: js.Array[ArrayBufferView]
  
  var bytesRead: Double
}
object ReadVResult {
  
  inline def apply(buffers: js.Array[ArrayBufferView], bytesRead: Double): ReadVResult = {
    val __obj = js.Dynamic.literal(buffers = buffers.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadVResult]
  }
  
  extension [Self <: ReadVResult](x: Self) {
    
    inline def setBuffers(value: js.Array[ArrayBufferView]): Self = StObject.set(x, "buffers", value.asInstanceOf[js.Any])
    
    inline def setBuffersVarargs(value: ArrayBufferView*): Self = StObject.set(x, "buffers", js.Array(value*))
    
    inline def setBytesRead(value: Double): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
  }
}
