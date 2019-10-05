package typings.node.fsMod

import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs", "chmod")
@js.native
object chmod extends js.Object {
  /**
    * Asynchronous chmod(2) - Change permissions of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  def apply(
    path: PathLike,
    mode: java.lang.String,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  def apply(path: PathLike, mode: Double, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  /**
    * Asynchronous chmod(2) - Change permissions of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  def __promisify__(path: PathLike, mode: java.lang.String): js.Promise[Unit] = js.native
  def __promisify__(path: PathLike, mode: Double): js.Promise[Unit] = js.native
}

