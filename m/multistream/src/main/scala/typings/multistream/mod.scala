package typings.multistream

import typings.node.streamMod.Readable
import typings.node.streamMod.ReadableOptions
import typings.node.streamMod.Stream
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("multistream", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Readable {
    def this(streams: Streams) = this()
    def this(streams: Streams, opts: ReadableOptions) = this()
  }
  @JSImport("multistream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def obj(streams: Streams): MultiStream = ^.asInstanceOf[js.Dynamic].applyDynamic("obj")(streams.asInstanceOf[js.Any]).asInstanceOf[MultiStream]
  
  type FactoryStream = js.Function1[/* cb */ FactoryStreamCallback, Unit]
  
  @js.native
  trait FactoryStreamCallback extends StObject {
    
    def apply(): Unit = js.native
    def apply(err: js.Error): Unit = js.native
    def apply(err: Null, stream: ReadableStream[Any]): Unit = js.native
  }
  
  type LazyStream = js.Function0[Stream]
  
  type MultiStream = Readable
  
  type Streams = (js.Array[LazyStream | Readable]) | FactoryStream
}
