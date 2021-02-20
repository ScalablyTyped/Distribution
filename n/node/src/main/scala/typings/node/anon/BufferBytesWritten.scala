package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferBytesWritten extends StObject {
  
  var buffer: String = js.native
  
  var bytesWritten: Double = js.native
}
object BufferBytesWritten {
  
  @scala.inline
  def apply(buffer: String, bytesWritten: Double): BufferBytesWritten = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferBytesWritten]
  }
  
  @scala.inline
  implicit class BufferBytesWrittenMutableBuilder[Self <: BufferBytesWritten] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: String): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
  }
}
