package typings.node.fsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteVResult extends StObject {
  
  var buffers: js.Array[js.typedarray.ArrayBufferView]
  
  var bytesWritten: Double
}
object WriteVResult {
  
  inline def apply(buffers: js.Array[js.typedarray.ArrayBufferView], bytesWritten: Double): WriteVResult = {
    val __obj = js.Dynamic.literal(buffers = buffers.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteVResult]
  }
  
  extension [Self <: WriteVResult](x: Self) {
    
    inline def setBuffers(value: js.Array[js.typedarray.ArrayBufferView]): Self = StObject.set(x, "buffers", value.asInstanceOf[js.Any])
    
    inline def setBuffersVarargs(value: js.typedarray.ArrayBufferView*): Self = StObject.set(x, "buffers", js.Array(value*))
    
    inline def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
  }
}
