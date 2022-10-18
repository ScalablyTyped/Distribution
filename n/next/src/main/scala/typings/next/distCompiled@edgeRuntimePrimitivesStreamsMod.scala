package typings.next

import typings.next.anon.Done
import typings.next.anon.Value
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `distCompiled@edgeRuntimePrimitivesStreamsMod` {
  
  /* was `typeof ReadableStreamBYOBReader` */
  @JSImport("next/dist/compiled/@edge-runtime/primitives/streams", "ReadableStreamBYOBReader")
  @js.native
  open class ReadableStreamBYOBReader protected () extends StObject {
    def this(stream: ReadableStream[js.typedarray.Uint8Array]) = this()
    
    def cancel(): js.Promise[Unit] = js.native
    def cancel(reason: Any): js.Promise[Unit] = js.native
    
    def closed: js.Promise[Unit] = js.native
    
    def read[T /* <: js.typedarray.ArrayBufferView */](view: T): js.Promise[Done[T] | Value[T]] = js.native
    
    def releaseLock(): Unit = js.native
  }
  
  /* was `typeof ReadableStreamBYOBReader` */
  type ReadableStreamBYOBReaderConstructor = ReadableStreamBYOBReader
}
