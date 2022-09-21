package typings.node.anon

import typings.node.bufferMod.global.BufferEncoding
import typings.node.fsMod.OpenMode
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  encoding :node.buffer.<global>.BufferEncoding,   flag :node.node:fs.OpenMode | undefined} & node.node:events.Abortable */
trait encodingBufferEncodingfla extends StObject {
  
  var encoding: BufferEncoding
  
  var flag: js.UndefOr[OpenMode] = js.undefined
  
  /**
    * When provided the corresponding `AbortController` can be used to cancel an asynchronous action.
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object encodingBufferEncodingfla {
  
  inline def apply(encoding: BufferEncoding): encodingBufferEncodingfla = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[encodingBufferEncodingfla]
  }
  
  extension [Self <: encodingBufferEncodingfla](x: Self) {
    
    inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setFlag(value: OpenMode): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
