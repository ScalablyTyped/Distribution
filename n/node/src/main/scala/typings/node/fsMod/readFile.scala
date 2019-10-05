package typings.node.fsMod

import typings.node.Anon_EncodingFlag
import typings.node.Anon_EncodingFlagNull
import typings.node.Anon_EncodingFlagString
import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs", "readFile")
@js.native
object readFile extends js.Object {
  def apply(path: Double, callback: js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer, Unit]): Unit = js.native
  def apply(
    path: Double,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[ErrnoException | Null, (/* data */ Buffer) | java.lang.String, Unit]
  ): Unit = js.native
  def apply(
    path: Double,
    options: java.lang.String,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* data */ java.lang.String), Unit]
  ): Unit = js.native
  def apply(
    path: Double,
    options: Null,
    callback: js.Function2[ErrnoException | Null, (/* data */ Buffer) | java.lang.String, Unit]
  ): Unit = js.native
  def apply(
    path: Double,
    options: Anon_EncodingFlagNull,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ java.lang.String | Buffer, Unit]
  ): Unit = js.native
  def apply(
    path: Double,
    options: Anon_EncodingFlagString,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ java.lang.String, Unit]
  ): Unit = js.native
  def apply(
    path: Double,
    options: Anon_EncodingFlag,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer, Unit]
  ): Unit = js.native
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    */
  def apply(path: PathLike, callback: js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer, Unit]): Unit = js.native
  def apply(
    path: PathLike,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[ErrnoException | Null, (/* data */ Buffer) | java.lang.String, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: java.lang.String,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* data */ java.lang.String), Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: Null,
    callback: js.Function2[ErrnoException | Null, (/* data */ Buffer) | java.lang.String, Unit]
  ): Unit = js.native
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  def apply(
    path: PathLike,
    options: Anon_EncodingFlagNull,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ java.lang.String | Buffer, Unit]
  ): Unit = js.native
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  def apply(
    path: PathLike,
    options: Anon_EncodingFlagString,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ java.lang.String, Unit]
  ): Unit = js.native
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param options An object that may contain an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  def apply(
    path: PathLike,
    options: Anon_EncodingFlag,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer, Unit]
  ): Unit = js.native
  def __promisify__(path: Double): js.Promise[Buffer] = js.native
  def __promisify__(path: Double, options: java.lang.String): js.Promise[java.lang.String] = js.native
  def __promisify__(path: Double, options: Anon_EncodingFlag): js.Promise[Buffer] = js.native
  def __promisify__(path: Double, options: Anon_EncodingFlagNull): js.Promise[java.lang.String | Buffer] = js.native
  def __promisify__(path: Double, options: Anon_EncodingFlagString): js.Promise[java.lang.String] = js.native
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param options An object that may contain an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  def __promisify__(path: PathLike): js.Promise[Buffer] = js.native
  def __promisify__(path: PathLike, options: java.lang.String): js.Promise[java.lang.String] = js.native
  def __promisify__(path: PathLike, options: Anon_EncodingFlag): js.Promise[Buffer] = js.native
  def __promisify__(path: PathLike, options: Anon_EncodingFlagNull): js.Promise[java.lang.String | Buffer] = js.native
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  def __promisify__(path: PathLike, options: Anon_EncodingFlagString): js.Promise[java.lang.String] = js.native
}

