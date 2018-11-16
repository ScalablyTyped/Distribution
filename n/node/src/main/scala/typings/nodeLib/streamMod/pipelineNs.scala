package typings
package nodeLib.streamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream", "pipeline")
@js.native
object pipelineNs extends js.Object {
  def `__promisify__`(
    stream1: nodeLib.NodeJSNs.ReadableStream,
    stream2: nodeLib.NodeJSNs.ReadWriteStream,
    stream3: nodeLib.NodeJSNs.ReadWriteStream,
    stream4: nodeLib.NodeJSNs.ReadWriteStream,
    stream5: nodeLib.NodeJSNs.WritableStream
  ): stdLib.Promise[scala.Unit] = js.native
  def `__promisify__`(
    stream1: nodeLib.NodeJSNs.ReadableStream,
    stream2: nodeLib.NodeJSNs.ReadWriteStream,
    stream3: nodeLib.NodeJSNs.ReadWriteStream,
    stream4: nodeLib.NodeJSNs.WritableStream
  ): stdLib.Promise[scala.Unit] = js.native
  def `__promisify__`(
    stream1: nodeLib.NodeJSNs.ReadableStream,
    stream2: nodeLib.NodeJSNs.ReadWriteStream,
    stream3: nodeLib.NodeJSNs.WritableStream
  ): stdLib.Promise[scala.Unit] = js.native
  def `__promisify__`(
    stream1: nodeLib.NodeJSNs.ReadableStream,
    stream2: nodeLib.NodeJSNs.ReadWriteStream,
    streams: (nodeLib.NodeJSNs.ReadWriteStream | nodeLib.NodeJSNs.WritableStream)*
  ): stdLib.Promise[scala.Unit] = js.native
  def `__promisify__`(stream1: nodeLib.NodeJSNs.ReadableStream, stream2: nodeLib.NodeJSNs.WritableStream): stdLib.Promise[scala.Unit] = js.native
  def `__promisify__`(
    stream1: nodeLib.NodeJSNs.ReadableStream,
    stream2: nodeLib.NodeJSNs.WritableStream,
    streams: (nodeLib.NodeJSNs.ReadWriteStream | nodeLib.NodeJSNs.WritableStream)*
  ): stdLib.Promise[scala.Unit] = js.native
  def `__promisify__`(
    streams: js.Array[
      nodeLib.NodeJSNs.ReadableStream | nodeLib.NodeJSNs.WritableStream | nodeLib.NodeJSNs.ReadWriteStream
    ]
  ): stdLib.Promise[scala.Unit] = js.native
}

