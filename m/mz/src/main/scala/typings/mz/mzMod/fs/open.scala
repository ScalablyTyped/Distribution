package typings.mz.mzMod.fs

import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("mz", "fs.open")
@js.native
object open extends js.Object {
  def apply(path: String, flags: String): js.Promise[Double] = js.native
  def apply(
    path: String,
    flags: String,
    callback: js.Function2[/* err */ ErrnoException, /* fd */ Double, Unit]
  ): Unit = js.native
  def apply(path: String, flags: String, mode: Double): js.Promise[Double] = js.native
  def apply(
    path: String,
    flags: String,
    mode: Double,
    callback: js.Function2[/* err */ ErrnoException, /* fd */ Double, Unit]
  ): Unit = js.native
  def apply(path: String, flags: Double): js.Promise[Double] = js.native
  def apply(
    path: String,
    flags: Double,
    callback: js.Function2[/* err */ ErrnoException, /* fd */ Double, Unit]
  ): Unit = js.native
  def apply(path: String, flags: Double, mode: Double): js.Promise[Double] = js.native
  def apply(
    path: String,
    flags: Double,
    mode: Double,
    callback: js.Function2[/* err */ ErrnoException, /* fd */ Double, Unit]
  ): Unit = js.native
  def apply(path: Buffer, flags: String): js.Promise[Double] = js.native
  def apply(
    path: Buffer,
    flags: String,
    callback: js.Function2[/* err */ ErrnoException, /* fd */ Double, Unit]
  ): Unit = js.native
  def apply(path: Buffer, flags: String, mode: Double): js.Promise[Double] = js.native
  def apply(
    path: Buffer,
    flags: String,
    mode: Double,
    callback: js.Function2[/* err */ ErrnoException, /* fd */ Double, Unit]
  ): Unit = js.native
  def apply(path: Buffer, flags: Double): js.Promise[Double] = js.native
  def apply(
    path: Buffer,
    flags: Double,
    callback: js.Function2[/* err */ ErrnoException, /* fd */ Double, Unit]
  ): Unit = js.native
  def apply(path: Buffer, flags: Double, mode: Double): js.Promise[Double] = js.native
  def apply(
    path: Buffer,
    flags: Double,
    mode: Double,
    callback: js.Function2[/* err */ ErrnoException, /* fd */ Double, Unit]
  ): Unit = js.native
  /**
    * Asynchronous open(2) - open and possibly create a file. If the file is created, its mode will be `0o666`.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def apply(
    path: PathLike,
    flags: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    flags: String,
    mode: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
  ): Unit = js.native
  /**
    * Asynchronous open(2) - open and possibly create a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not supplied, defaults to `0o666`.
    */
  def apply(
    path: PathLike,
    flags: String,
    mode: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    flags: String,
    mode: Double,
    callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    flags: String,
    mode: Null,
    callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    flags: Double,
    callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    flags: Double,
    mode: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    flags: Double,
    mode: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    flags: Double,
    mode: Double,
    callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    flags: Double,
    mode: Null,
    callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
  ): Unit = js.native
  /**
    * Asynchronous open(2) - open and possibly create a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not supplied, defaults to `0o666`.
    */
  def __promisify__(path: PathLike, flags: String): js.Promise[Double] = js.native
  def __promisify__(path: PathLike, flags: String, mode: String): js.Promise[Double] = js.native
  def __promisify__(path: PathLike, flags: String, mode: Double): js.Promise[Double] = js.native
  def __promisify__(path: PathLike, flags: Double): js.Promise[Double] = js.native
  def __promisify__(path: PathLike, flags: Double, mode: String): js.Promise[Double] = js.native
  def __promisify__(path: PathLike, flags: Double, mode: Double): js.Promise[Double] = js.native
}

