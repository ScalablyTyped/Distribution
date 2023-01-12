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
  
  inline def apply(): ExecFileOptionsWithBufferEncoding = {
    val __obj = js.Dynamic.literal(encoding = null)
    __obj.asInstanceOf[ExecFileOptionsWithBufferEncoding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecFileOptionsWithBufferEncoding] (val x: Self) extends AnyVal {
    
    inline def setEncoding(value: buffer_): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
  }
}
