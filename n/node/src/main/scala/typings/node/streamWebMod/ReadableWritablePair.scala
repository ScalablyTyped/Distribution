package typings.node.streamWebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// stub module, pending copy&paste from .d.ts or manual impl
// copy from lib.dom.d.ts
trait ReadableWritablePair[R, W] extends StObject {
  
  var readable: ReadableStream[R]
  
  /**
    * Provides a convenient, chainable way of piping this readable stream
    * through a transform stream (or any other { writable, readable }
    * pair). It simply pipes the stream into the writable side of the
    * supplied pair, and returns the readable side for further use.
    *
    * Piping a stream will lock it for the duration of the pipe, preventing
    * any other consumer from acquiring a reader.
    */
  var writable: WritableStream[W]
}
object ReadableWritablePair {
  
  inline def apply[R, W](readable: ReadableStream[R], writable: WritableStream[W]): ReadableWritablePair[R, W] = {
    val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadableWritablePair[R, W]]
  }
  
  extension [Self <: ReadableWritablePair[?, ?], R, W](x: Self & (ReadableWritablePair[R, W])) {
    
    inline def setReadable(value: ReadableStream[R]): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
    
    inline def setWritable(value: WritableStream[W]): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
  }
}
