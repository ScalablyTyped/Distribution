package typings
package nodeLib.streamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def finished(
    stream: nodeLib.NodeJSNs.ReadWriteStream,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): js.Function0[scala.Unit] = js.native
  def finished(
    stream: nodeLib.NodeJSNs.ReadableStream,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): js.Function0[scala.Unit] = js.native
  def finished(
    stream: nodeLib.NodeJSNs.WritableStream,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): js.Function0[scala.Unit] = js.native
  def pipeline(
    stream1: nodeLib.NodeJSNs.ReadableStream,
    stream2: nodeLib.NodeJSNs.ReadWriteStream,
    streams: (nodeLib.NodeJSNs.ReadWriteStream | nodeLib.NodeJSNs.WritableStream | (js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]))*
  ): nodeLib.NodeJSNs.WritableStream = js.native
  def pipeline(
    stream1: nodeLib.NodeJSNs.ReadableStream,
    stream2: nodeLib.NodeJSNs.WritableStream,
    streams: (nodeLib.NodeJSNs.ReadWriteStream | nodeLib.NodeJSNs.WritableStream | (js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]))*
  ): nodeLib.NodeJSNs.WritableStream = js.native
  def pipeline(
    streams: js.Array[
      nodeLib.NodeJSNs.ReadableStream | nodeLib.NodeJSNs.WritableStream | nodeLib.NodeJSNs.ReadWriteStream
    ]
  ): nodeLib.NodeJSNs.WritableStream = js.native
  def pipeline(
    streams: js.Array[
      nodeLib.NodeJSNs.ReadableStream | nodeLib.NodeJSNs.WritableStream | nodeLib.NodeJSNs.ReadWriteStream
    ],
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): nodeLib.NodeJSNs.WritableStream = js.native
  def pipeline[T /* <: nodeLib.NodeJSNs.WritableStream */](stream1: nodeLib.NodeJSNs.ReadableStream, stream2: T): T = js.native
  def pipeline[T /* <: nodeLib.NodeJSNs.WritableStream */](
    stream1: nodeLib.NodeJSNs.ReadableStream,
    stream2: T,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): T = js.native
  def pipeline[T /* <: nodeLib.NodeJSNs.WritableStream */](stream1: nodeLib.NodeJSNs.ReadableStream, stream2: nodeLib.NodeJSNs.ReadWriteStream, stream3: T): T = js.native
  def pipeline[T /* <: nodeLib.NodeJSNs.WritableStream */](
    stream1: nodeLib.NodeJSNs.ReadableStream,
    stream2: nodeLib.NodeJSNs.ReadWriteStream,
    stream3: T,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): T = js.native
  def pipeline[T /* <: nodeLib.NodeJSNs.WritableStream */](
    stream1: nodeLib.NodeJSNs.ReadableStream,
    stream2: nodeLib.NodeJSNs.ReadWriteStream,
    stream3: nodeLib.NodeJSNs.ReadWriteStream,
    stream4: T
  ): T = js.native
  def pipeline[T /* <: nodeLib.NodeJSNs.WritableStream */](
    stream1: nodeLib.NodeJSNs.ReadableStream,
    stream2: nodeLib.NodeJSNs.ReadWriteStream,
    stream3: nodeLib.NodeJSNs.ReadWriteStream,
    stream4: T,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): T = js.native
  def pipeline[T /* <: nodeLib.NodeJSNs.WritableStream */](
    stream1: nodeLib.NodeJSNs.ReadableStream,
    stream2: nodeLib.NodeJSNs.ReadWriteStream,
    stream3: nodeLib.NodeJSNs.ReadWriteStream,
    stream4: nodeLib.NodeJSNs.ReadWriteStream,
    stream5: T
  ): T = js.native
  def pipeline[T /* <: nodeLib.NodeJSNs.WritableStream */](
    stream1: nodeLib.NodeJSNs.ReadableStream,
    stream2: nodeLib.NodeJSNs.ReadWriteStream,
    stream3: nodeLib.NodeJSNs.ReadWriteStream,
    stream4: nodeLib.NodeJSNs.ReadWriteStream,
    stream5: T,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): T = js.native
}

