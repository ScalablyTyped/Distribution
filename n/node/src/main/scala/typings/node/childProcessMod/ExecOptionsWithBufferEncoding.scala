package typings.node.childProcessMod

import typings.node.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecOptionsWithBufferEncoding extends ExecOptions {
  
  var encoding: BufferEncoding | Null = js.native
}
object ExecOptionsWithBufferEncoding {
  
  @scala.inline
  def apply(): ExecOptionsWithBufferEncoding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecOptionsWithBufferEncoding]
  }
  
  @scala.inline
  implicit class ExecOptionsWithBufferEncodingMutableBuilder[Self <: ExecOptionsWithBufferEncoding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingNull: Self = StObject.set(x, "encoding", null)
  }
}
