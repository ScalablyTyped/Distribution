package typings.node.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs", "mkdir")
@js.native
object mkdirNs extends js.Object {
  /**
    * Asynchronous mkdir(2) - create a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
    * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
    */
  def __promisify__(path: PathLike): js.Promise[Unit] = js.native
  def __promisify__(path: PathLike, options: java.lang.String): js.Promise[Unit] = js.native
  def __promisify__(path: PathLike, options: Double): js.Promise[Unit] = js.native
  def __promisify__(path: PathLike, options: MakeDirectoryOptions): js.Promise[Unit] = js.native
}

