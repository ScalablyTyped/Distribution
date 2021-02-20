package typings.mz.anon

import typings.std.DataView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferDataView extends StObject {
  
  var buffer: DataView = js.native
  
  var bytesRead: Double = js.native
}
object BufferDataView {
  
  @scala.inline
  def apply(buffer: DataView, bytesRead: Double): BufferDataView = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferDataView]
  }
  
  @scala.inline
  implicit class BufferDataViewMutableBuilder[Self <: BufferDataView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: DataView): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesRead(value: Double): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
  }
}
