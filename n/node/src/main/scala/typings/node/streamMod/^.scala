package typings.node.streamMod

import typings.node.NodeJSNs.ErrnoException
import typings.node.NodeJSNs.ReadWriteStream
import typings.node.NodeJSNs.ReadableStream
import typings.node.NodeJSNs.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream", JSImport.Namespace)
@js.native
class ^ () extends internal

@JSImport("stream", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def finished(stream: ReadWriteStream, callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]): js.Function0[Unit] = js.native
  def finished(stream: ReadableStream, callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]): js.Function0[Unit] = js.native
  def finished(stream: WritableStream, callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]): js.Function0[Unit] = js.native
  def pipeline(
    stream1: ReadableStream,
    stream2: ReadWriteStream,
    streams: (ReadWriteStream | WritableStream | (js.Function1[/* err */ ErrnoException | Null, Unit]))*
  ): WritableStream = js.native
  def pipeline(
    stream1: ReadableStream,
    stream2: WritableStream,
    streams: (ReadWriteStream | WritableStream | (js.Function1[/* err */ ErrnoException | Null, Unit]))*
  ): WritableStream = js.native
  def pipeline(streams: js.Array[ReadableStream | WritableStream | ReadWriteStream]): WritableStream = js.native
  def pipeline(
    streams: js.Array[ReadableStream | WritableStream | ReadWriteStream],
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): WritableStream = js.native
  def pipeline[T /* <: WritableStream */](stream1: ReadableStream, stream2: T): T = js.native
  def pipeline[T /* <: WritableStream */](stream1: ReadableStream, stream2: T, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): T = js.native
  def pipeline[T /* <: WritableStream */](stream1: ReadableStream, stream2: ReadWriteStream, stream3: T): T = js.native
  def pipeline[T /* <: WritableStream */](
    stream1: ReadableStream,
    stream2: ReadWriteStream,
    stream3: T,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): T = js.native
  def pipeline[T /* <: WritableStream */](stream1: ReadableStream, stream2: ReadWriteStream, stream3: ReadWriteStream, stream4: T): T = js.native
  def pipeline[T /* <: WritableStream */](
    stream1: ReadableStream,
    stream2: ReadWriteStream,
    stream3: ReadWriteStream,
    stream4: T,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): T = js.native
  def pipeline[T /* <: WritableStream */](
    stream1: ReadableStream,
    stream2: ReadWriteStream,
    stream3: ReadWriteStream,
    stream4: ReadWriteStream,
    stream5: T
  ): T = js.native
  def pipeline[T /* <: WritableStream */](
    stream1: ReadableStream,
    stream2: ReadWriteStream,
    stream3: ReadWriteStream,
    stream4: ReadWriteStream,
    stream5: T,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): T = js.native
}

