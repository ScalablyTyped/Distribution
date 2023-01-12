package typings.node.anon

import typings.node.AbortSignal
import typings.node.bufferMod.global.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  encoding :node.buffer.<global>.BufferEncoding,   flag :string | undefined} & node.node:events.Abortable */
trait encodingBufferEncodingflaEncoding extends StObject {
  
  var encoding: BufferEncoding
  
  var flag: js.UndefOr[String] = js.undefined
  
  /**
    * When provided the corresponding `AbortController` can be used to cancel an asynchronous action.
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object encodingBufferEncodingflaEncoding {
  
  inline def apply(encoding: BufferEncoding): encodingBufferEncodingflaEncoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[encodingBufferEncodingflaEncoding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: encodingBufferEncodingflaEncoding] (val x: Self) extends AnyVal {
    
    inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
