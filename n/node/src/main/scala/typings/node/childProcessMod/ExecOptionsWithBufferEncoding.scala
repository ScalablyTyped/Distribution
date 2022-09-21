package typings.node.childProcessMod

import typings.node.bufferMod.global.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecOptionsWithBufferEncoding
  extends StObject
     with ExecOptions {
  
  var encoding: BufferEncoding | Null
}
object ExecOptionsWithBufferEncoding {
  
  inline def apply(): ExecOptionsWithBufferEncoding = {
    val __obj = js.Dynamic.literal(encoding = null)
    __obj.asInstanceOf[ExecOptionsWithBufferEncoding]
  }
  
  extension [Self <: ExecOptionsWithBufferEncoding](x: Self) {
    
    inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
  }
}
