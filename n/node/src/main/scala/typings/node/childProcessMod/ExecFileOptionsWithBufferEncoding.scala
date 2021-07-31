package typings.node.childProcessMod

import typings.node.nodeStrings.buffer_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecFileOptionsWithBufferEncoding
  extends StObject
     with ExecFileOptions {
  
  var encoding: buffer_ | Null
}
object ExecFileOptionsWithBufferEncoding {
  
  @scala.inline
  def apply(): ExecFileOptionsWithBufferEncoding = {
    val __obj = js.Dynamic.literal(encoding = null)
    __obj.asInstanceOf[ExecFileOptionsWithBufferEncoding]
  }
  
  @scala.inline
  implicit class ExecFileOptionsWithBufferEncodingMutableBuilder[Self <: ExecFileOptionsWithBufferEncoding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: buffer_): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingNull: Self = StObject.set(x, "encoding", null)
  }
}
