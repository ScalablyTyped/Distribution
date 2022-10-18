package typings.pngAsync

import typings.node.streamMod.Duplex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libChunkStreamMod {
  
  @JSImport("png-async/lib/chunk-stream", JSImport.Namespace)
  @js.native
  open class ^ () extends ChunkStream
  
  @js.native
  trait ChunkStream extends Duplex {
    
    /* private */ var _buffered: Any = js.native
    
    /* private */ var _buffers: Any = js.native
    
    /* private */ var _encoding: Any = js.native
    
    /* private */ var _end: Any = js.native
    
    /* private */ var _paused: Any = js.native
    
    /* private */ var _process: Any = js.native
    
    def _read(size: Any): Unit = js.native
    
    /* private */ var _reads: Any = js.native
    
    def _write(data: Any, encoding: Any, cb: Any): Boolean = js.native
    
    def destroy(): Unit = js.native
    
    def destroySoon(): Unit = js.native
    def destroySoon(data: Any): Unit = js.native
    
    def read(length: Any): Unit = js.native
    def read(length: Any, callback: Any): Unit = js.native
  }
}
