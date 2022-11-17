package typings.node.childProcessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecFileSyncOptionsWithBufferEncoding
  extends StObject
     with ExecFileSyncOptions {
  
  @JSName("encoding")
  var encoding_ExecFileSyncOptionsWithBufferEncoding: js.UndefOr["buffer" | Null] = js.undefined
}
object ExecFileSyncOptionsWithBufferEncoding {
  
  inline def apply(): ExecFileSyncOptionsWithBufferEncoding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecFileSyncOptionsWithBufferEncoding]
  }
  
  extension [Self <: ExecFileSyncOptionsWithBufferEncoding](x: Self) {
    
    inline def setEncoding(value: "buffer"): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
  }
}
