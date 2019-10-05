package typings.multistream

import typings.multistream.multistreamMod.FactoryStream
import typings.multistream.multistreamMod.FactoryStreamCallback
import typings.multistream.multistreamMod.LazyStream
import typings.multistream.multistreamMod.Streams
import typings.node.NodeJS.ReadableStream
import typings.node.streamMod.Stream
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("multistream", JSImport.Namespace)
@js.native
object multistreamMod extends js.Object {
  @js.native
  trait FactoryStreamCallback extends js.Object {
    def apply(): js.Any = js.native
    def apply(err: Null, stream: ReadableStream): js.Any = js.native
    def apply(err: Error): js.Any = js.native
  }
  
  def apply(streams: Streams): ReadableStream = js.native
  def obj(streams: Streams): ReadableStream = js.native
  type FactoryStream = js.Function1[/* cb */ FactoryStreamCallback, Unit]
  type LazyStream = js.Function0[Stream]
  type Streams = (js.Array[LazyStream | ReadableStream]) | FactoryStream
}

