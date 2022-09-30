package typings.node.streamWebMod

import typings.node.nodeStrings.bytes
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnderlyingByteSource extends StObject {
  
  var autoAllocateChunkSize: js.UndefOr[Double] = js.undefined
  
  var cancel: js.UndefOr[ReadableStreamErrorCallback] = js.undefined
  
  var pull: js.UndefOr[ReadableByteStreamControllerCallback] = js.undefined
  
  var start: js.UndefOr[ReadableByteStreamControllerCallback] = js.undefined
  
  var `type`: bytes
}
object UnderlyingByteSource {
  
  inline def apply(): UnderlyingByteSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("bytes")
    __obj.asInstanceOf[UnderlyingByteSource]
  }
  
  extension [Self <: UnderlyingByteSource](x: Self) {
    
    inline def setAutoAllocateChunkSize(value: Double): Self = StObject.set(x, "autoAllocateChunkSize", value.asInstanceOf[js.Any])
    
    inline def setAutoAllocateChunkSizeUndefined: Self = StObject.set(x, "autoAllocateChunkSize", js.undefined)
    
    inline def setCancel(value: /* reason */ Any => Unit | PromiseLike[Unit]): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setPull(value: /* controller */ ReadableByteStreamController => Unit | PromiseLike[Unit]): Self = StObject.set(x, "pull", js.Any.fromFunction1(value))
    
    inline def setPullUndefined: Self = StObject.set(x, "pull", js.undefined)
    
    inline def setStart(value: /* controller */ ReadableByteStreamController => Unit | PromiseLike[Unit]): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setType(value: bytes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
