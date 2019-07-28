package typings.node.fsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs", "utimes")
@js.native
object utimesNs extends js.Object {
  /**
    * Asynchronously change file timestamps of the file referenced by the supplied path.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param atime The last access time. If a string is provided, it will be coerced to number.
    * @param mtime The last modified time. If a string is provided, it will be coerced to number.
    */
  def __promisify__(path: PathLike, atime: java.lang.String, mtime: java.lang.String): js.Promise[Unit] = js.native
  def __promisify__(path: PathLike, atime: java.lang.String, mtime: Double): js.Promise[Unit] = js.native
  def __promisify__(path: PathLike, atime: java.lang.String, mtime: Date): js.Promise[Unit] = js.native
  def __promisify__(path: PathLike, atime: Double, mtime: java.lang.String): js.Promise[Unit] = js.native
  def __promisify__(path: PathLike, atime: Double, mtime: Double): js.Promise[Unit] = js.native
  def __promisify__(path: PathLike, atime: Double, mtime: Date): js.Promise[Unit] = js.native
  def __promisify__(path: PathLike, atime: Date, mtime: java.lang.String): js.Promise[Unit] = js.native
  def __promisify__(path: PathLike, atime: Date, mtime: Double): js.Promise[Unit] = js.native
  def __promisify__(path: PathLike, atime: Date, mtime: Date): js.Promise[Unit] = js.native
}

