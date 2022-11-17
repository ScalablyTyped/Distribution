package typings.node.childProcessMod

import typings.node.NodeJS.ArrayBufferView
import typings.node.bufferMod.global.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpawnSyncOptions
  extends StObject
     with CommonSpawnOptions {
  
  var encoding: js.UndefOr[BufferEncoding | "buffer" | Null] = js.undefined
  
  var input: js.UndefOr[String | ArrayBufferView] = js.undefined
  
  var maxBuffer: js.UndefOr[Double] = js.undefined
}
object SpawnSyncOptions {
  
  inline def apply(): SpawnSyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpawnSyncOptions]
  }
  
  extension [Self <: SpawnSyncOptions](x: Self) {
    
    inline def setEncoding(value: BufferEncoding | "buffer"): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setInput(value: String | ArrayBufferView): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setMaxBuffer(value: Double): Self = StObject.set(x, "maxBuffer", value.asInstanceOf[js.Any])
    
    inline def setMaxBufferUndefined: Self = StObject.set(x, "maxBuffer", js.undefined)
  }
}
