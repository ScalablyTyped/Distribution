package typings.node.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "accessSync")
@js.native
object accessSync extends js.Object {
  /**
    * Synchronously tests a user's permissions for the file specified by path.
    * @param path A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def apply(path: PathLike): Unit = js.native
  def apply(path: PathLike, mode: Double): Unit = js.native
}

