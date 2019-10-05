package typings.node.fsMod

import typings.node.Anon_BufferEncodingPersistent
import typings.node.Anon_EncodingPersistent
import typings.node.Anon_EncodingPersistentRecursive
import typings.node.Buffer
import typings.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "watch")
@js.native
object watch extends js.Object {
  def apply(filename: PathLike): FSWatcher = js.native
  def apply(
    filename: PathLike,
    listener: js.Function2[/* event */ java.lang.String, /* filename */ java.lang.String, _]
  ): FSWatcher = js.native
  def apply(
    filename: PathLike,
    options: js.UndefOr[scala.Nothing],
    listener: js.Function2[/* event */ java.lang.String, /* filename */ java.lang.String, Unit]
  ): FSWatcher = js.native
  def apply(filename: PathLike, options: java.lang.String): FSWatcher = js.native
  def apply(
    filename: PathLike,
    options: java.lang.String,
    listener: js.Function2[/* event */ java.lang.String, /* filename */ java.lang.String | Buffer, Unit]
  ): FSWatcher = js.native
  def apply(
    filename: PathLike,
    options: Null,
    listener: js.Function2[/* event */ java.lang.String, Buffer | (/* filename */ java.lang.String), Unit]
  ): FSWatcher = js.native
  /**
    * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
    * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
    * If `encoding` is not supplied, the default of `'utf8'` is used.
    * If `persistent` is not supplied, the default of `true` is used.
    * If `recursive` is not supplied, the default of `false` is used.
    */
  def apply(filename: PathLike, options: Anon_BufferEncodingPersistent): FSWatcher = js.native
  def apply(
    filename: PathLike,
    options: Anon_BufferEncodingPersistent,
    listener: js.Function2[/* event */ java.lang.String, /* filename */ Buffer, Unit]
  ): FSWatcher = js.native
  /**
    * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
    * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
    * If `encoding` is not supplied, the default of `'utf8'` is used.
    * If `persistent` is not supplied, the default of `true` is used.
    * If `recursive` is not supplied, the default of `false` is used.
    */
  def apply(filename: PathLike, options: Anon_EncodingPersistent): FSWatcher = js.native
  /**
    * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
    * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
    * If `encoding` is not supplied, the default of `'utf8'` is used.
    * If `persistent` is not supplied, the default of `true` is used.
    * If `recursive` is not supplied, the default of `false` is used.
    */
  def apply(filename: PathLike, options: Anon_EncodingPersistentRecursive): FSWatcher = js.native
  def apply(
    filename: PathLike,
    options: Anon_EncodingPersistentRecursive,
    listener: js.Function2[/* event */ java.lang.String, /* filename */ java.lang.String | Buffer, Unit]
  ): FSWatcher = js.native
  def apply(
    filename: PathLike,
    options: Anon_EncodingPersistent,
    listener: js.Function2[/* event */ java.lang.String, /* filename */ java.lang.String, Unit]
  ): FSWatcher = js.native
  def apply(filename: PathLike, options: BufferEncoding): FSWatcher = js.native
  def apply(
    filename: PathLike,
    options: BufferEncoding,
    listener: js.Function2[/* event */ java.lang.String, /* filename */ java.lang.String, Unit]
  ): FSWatcher = js.native
}

