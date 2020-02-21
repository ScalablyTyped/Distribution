package typings.node.streamMod

import typings.node.NodeJS.ErrnoException
import typings.node.NodeJS.ReadWriteStream
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream", "finished")
@js.native
object finished extends js.Object {
  def apply(stream: ReadWriteStream, callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]): js.Function0[Unit] = js.native
  def apply(
    stream: ReadWriteStream,
    options: FinishedOptions,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]
  ): js.Function0[Unit] = js.native
  def apply(stream: ReadableStream, callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]): js.Function0[Unit] = js.native
  def apply(
    stream: ReadableStream,
    options: FinishedOptions,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]
  ): js.Function0[Unit] = js.native
  def apply(stream: WritableStream, callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]): js.Function0[Unit] = js.native
  def apply(
    stream: WritableStream,
    options: FinishedOptions,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]
  ): js.Function0[Unit] = js.native
  @JSName("__promisify__")
  def promisify(stream: ReadWriteStream): js.Promise[Unit] = js.native
  @JSName("__promisify__")
  def promisify(stream: ReadWriteStream, options: FinishedOptions): js.Promise[Unit] = js.native
  @JSName("__promisify__")
  def promisify(stream: ReadableStream): js.Promise[Unit] = js.native
  @JSName("__promisify__")
  def promisify(stream: ReadableStream, options: FinishedOptions): js.Promise[Unit] = js.native
  @JSName("__promisify__")
  def promisify(stream: WritableStream): js.Promise[Unit] = js.native
  @JSName("__promisify__")
  def promisify(stream: WritableStream, options: FinishedOptions): js.Promise[Unit] = js.native
}

