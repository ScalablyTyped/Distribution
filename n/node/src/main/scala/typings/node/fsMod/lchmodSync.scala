package typings.node.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "lchmodSync")
@js.native
object lchmodSync extends js.Object {
  /**
    * Synchronous lchmod(2) - Change permissions of a file. Does not dereference symbolic links.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  def apply(path: PathLike, mode: String): Unit = js.native
  def apply(path: PathLike, mode: Double): Unit = js.native
}

