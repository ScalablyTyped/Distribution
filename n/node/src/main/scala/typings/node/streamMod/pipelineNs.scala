package typings.node.streamMod

import typings.node.NodeJSNs.ReadWriteStream
import typings.node.NodeJSNs.ReadableStream
import typings.node.NodeJSNs.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream", "pipeline")
@js.native
object pipelineNs extends js.Object {
  def __promisify__(
    stream1: ReadableStream,
    stream2: ReadWriteStream,
    stream3: ReadWriteStream,
    stream4: ReadWriteStream,
    stream5: WritableStream
  ): js.Promise[Unit] = js.native
  def __promisify__(
    stream1: ReadableStream,
    stream2: ReadWriteStream,
    stream3: ReadWriteStream,
    stream4: WritableStream
  ): js.Promise[Unit] = js.native
  def __promisify__(stream1: ReadableStream, stream2: ReadWriteStream, stream3: WritableStream): js.Promise[Unit] = js.native
  def __promisify__(stream1: ReadableStream, stream2: ReadWriteStream, streams: (ReadWriteStream | WritableStream)*): js.Promise[Unit] = js.native
  def __promisify__(stream1: ReadableStream, stream2: WritableStream): js.Promise[Unit] = js.native
  def __promisify__(stream1: ReadableStream, stream2: WritableStream, streams: (ReadWriteStream | WritableStream)*): js.Promise[Unit] = js.native
  def __promisify__(streams: js.Array[ReadableStream | WritableStream | ReadWriteStream]): js.Promise[Unit] = js.native
}

