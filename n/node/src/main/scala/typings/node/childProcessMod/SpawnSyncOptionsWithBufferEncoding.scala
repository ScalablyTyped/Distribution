package typings.node.childProcessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpawnSyncOptionsWithBufferEncoding
  extends StObject
     with SpawnSyncOptions {
  
  @JSName("encoding")
  var encoding_SpawnSyncOptionsWithBufferEncoding: js.UndefOr["buffer" | Null] = js.undefined
}
object SpawnSyncOptionsWithBufferEncoding {
  
  inline def apply(): SpawnSyncOptionsWithBufferEncoding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpawnSyncOptionsWithBufferEncoding]
  }
  
  extension [Self <: SpawnSyncOptionsWithBufferEncoding](x: Self) {
    
    inline def setEncoding(value: "buffer"): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
  }
}
