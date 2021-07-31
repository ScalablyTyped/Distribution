package typings.mz.anon

import typings.std.Int32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferInt32Array extends StObject {
  
  var buffer: Int32Array
  
  var bytesRead: Double
}
object BufferInt32Array {
  
  @scala.inline
  def apply(buffer: Int32Array, bytesRead: Double): BufferInt32Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferInt32Array]
  }
  
  @scala.inline
  implicit class BufferInt32ArrayMutableBuilder[Self <: BufferInt32Array] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: Int32Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesRead(value: Double): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
  }
}
