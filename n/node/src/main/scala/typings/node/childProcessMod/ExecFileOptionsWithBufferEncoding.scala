package typings.node.childProcessMod

import typings.node.nodeStrings.buffer_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecFileOptionsWithBufferEncoding extends ExecFileOptions {
  
  var encoding: buffer_ | Null = js.native
}
object ExecFileOptionsWithBufferEncoding {
  
  @scala.inline
  def apply(): ExecFileOptionsWithBufferEncoding = {
    val __obj = js.Dynamic.literal()
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
