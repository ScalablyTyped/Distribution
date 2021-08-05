package typings.pngAsync

import typings.node.streamMod.Duplex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chunkStreamMod {
  
  @JSImport("png-async/lib/chunk-stream", JSImport.Namespace)
  @js.native
  class ^ () extends ChunkStream
  
  @js.native
  trait ChunkStream extends Duplex {
    
    /* private */ var _buffered: js.Any = js.native
    
    /* private */ var _buffers: js.Any = js.native
    
    /* private */ var _encoding: js.Any = js.native
    
    /* private */ var _end: js.Any = js.native
    
    /* private */ var _paused: js.Any = js.native
    
    /* private */ var _process: js.Any = js.native
    
    def _read(size: js.Any): Unit = js.native
    
    /* private */ var _reads: js.Any = js.native
    
    def _write(data: js.Any, encoding: js.Any, cb: js.Any): Boolean = js.native
    
    def destroySoon(): Unit = js.native
    def destroySoon(data: js.Any): Unit = js.native
    
    def read(length: js.Any): Unit = js.native
    def read(length: js.Any, callback: js.Any): Unit = js.native
  }
}
