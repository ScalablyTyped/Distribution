package typings.mz.mzMod.fs

import typings.mz.Anon_Encoding
import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.PathLike
import typings.node.fsMod.WriteFileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("mz", "fs.writeFile")
@js.native
object writeFile extends js.Object {
  def apply(file: String, data: String): js.Promise[Unit] = js.native
  def apply(file: String, data: String, options: String): js.Promise[Unit] = js.native
  def apply(file: String, data: String, options: Anon_Encoding): js.Promise[Unit] = js.native
  def apply(file: String, data: Buffer): js.Promise[Unit] = js.native
  def apply(file: String, data: Buffer, options: String): js.Promise[Unit] = js.native
  def apply(file: String, data: Buffer, options: Anon_Encoding): js.Promise[Unit] = js.native
  def apply(
    filename: String | Double | Buffer,
    data: String | Buffer,
    options: js.UndefOr[Anon_Encoding | String | Null],
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  def apply(filename: String, data: String, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(filename: String, data: Buffer, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(filename: Double, data: String, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(filename: Double, data: Buffer, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(filename: Buffer, data: String, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(filename: Buffer, data: Buffer, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(file: Double, data: String): js.Promise[Unit] = js.native
  def apply(file: Double, data: String, options: String): js.Promise[Unit] = js.native
  def apply(file: Double, data: String, options: Anon_Encoding): js.Promise[Unit] = js.native
  def apply(file: Double, data: Buffer): js.Promise[Unit] = js.native
  def apply(file: Double, data: Buffer, options: String): js.Promise[Unit] = js.native
  def apply(file: Double, data: Buffer, options: Anon_Encoding): js.Promise[Unit] = js.native
  def apply(file: Buffer, data: String): js.Promise[Unit] = js.native
  def apply(file: Buffer, data: String, options: String): js.Promise[Unit] = js.native
  def apply(file: Buffer, data: String, options: Anon_Encoding): js.Promise[Unit] = js.native
  def apply(file: Buffer, data: Buffer): js.Promise[Unit] = js.native
  def apply(file: Buffer, data: Buffer, options: String): js.Promise[Unit] = js.native
  def apply(file: Buffer, data: Buffer, options: Anon_Encoding): js.Promise[Unit] = js.native
  def apply(path: Double, data: js.Any, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  def apply(
    path: Double,
    data: js.Any,
    options: WriteFileOptions,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  /**
    * Asynchronously writes data to a file, replacing the file if it already exists.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
    */
  def apply(path: PathLike, data: js.Any, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  /**
    * Asynchronously writes data to a file, replacing the file if it already exists.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
    * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
    * If `encoding` is not supplied, the default of `'utf8'` is used.
    * If `mode` is not supplied, the default of `0o666` is used.
    * If `mode` is a string, it is parsed as an octal integer.
    * If `flag` is not supplied, the default of `'w'` is used.
    */
  def apply(
    path: PathLike,
    data: js.Any,
    options: WriteFileOptions,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  def __promisify__(path: Double, data: js.Any): js.Promise[Unit] = js.native
  def __promisify__(path: Double, data: js.Any, options: WriteFileOptions): js.Promise[Unit] = js.native
  /**
    * Asynchronously writes data to a file, replacing the file if it already exists.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
    * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
    * If `encoding` is not supplied, the default of `'utf8'` is used.
    * If `mode` is not supplied, the default of `0o666` is used.
    * If `mode` is a string, it is parsed as an octal integer.
    * If `flag` is not supplied, the default of `'w'` is used.
    */
  def __promisify__(path: PathLike, data: js.Any): js.Promise[Unit] = js.native
  def __promisify__(path: PathLike, data: js.Any, options: WriteFileOptions): js.Promise[Unit] = js.native
}

