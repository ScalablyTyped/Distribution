package typings.node.streamWebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformStream[I, O] extends StObject {
  
  val readable: ReadableStream[O]
  
  val writable: WritableStream[I]
}
object TransformStream {
  
  inline def apply[I, O](readable: ReadableStream[O], writable: WritableStream[I]): TransformStream[I, O] = {
    val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformStream[I, O]]
  }
  
  extension [Self <: TransformStream[?, ?], I, O](x: Self & (TransformStream[I, O])) {
    
    inline def setReadable(value: ReadableStream[O]): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
    
    inline def setWritable(value: WritableStream[I]): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
  }
}
