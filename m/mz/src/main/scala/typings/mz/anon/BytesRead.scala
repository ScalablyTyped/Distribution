package typings.mz.anon

import typings.std.Uint8ClampedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BytesRead extends StObject {
  
  var buffer: Uint8ClampedArray = js.native
  
  var bytesRead: Double = js.native
}
object BytesRead {
  
  @scala.inline
  def apply(buffer: Uint8ClampedArray, bytesRead: Double): BytesRead = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[BytesRead]
  }
  
  @scala.inline
  implicit class BytesReadMutableBuilder[Self <: BytesRead] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: Uint8ClampedArray): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesRead(value: Double): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
  }
}
