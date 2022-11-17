package typings.node.childProcessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecFileOptionsWithBufferEncoding
  extends StObject
     with ExecFileOptions {
  
  var encoding: "buffer" | Null
}
object ExecFileOptionsWithBufferEncoding {
  
  inline def apply(): ExecFileOptionsWithBufferEncoding = {
    val __obj = js.Dynamic.literal(encoding = null)
    __obj.asInstanceOf[ExecFileOptionsWithBufferEncoding]
  }
  
  extension [Self <: ExecFileOptionsWithBufferEncoding](x: Self) {
    
    inline def setEncoding(value: "buffer"): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
  }
}
