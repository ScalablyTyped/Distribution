package typings.node.childProcessMod

import typings.node.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecFileSyncOptionsWithBufferEncoding
  extends StObject
     with ExecFileSyncOptions {
  
  @JSName("encoding")
  var encoding_ExecFileSyncOptionsWithBufferEncoding: BufferEncoding
}
object ExecFileSyncOptionsWithBufferEncoding {
  
  inline def apply(encoding: BufferEncoding): ExecFileSyncOptionsWithBufferEncoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecFileSyncOptionsWithBufferEncoding]
  }
  
  extension [Self <: ExecFileSyncOptionsWithBufferEncoding](x: Self) {
    
    inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
  }
}
