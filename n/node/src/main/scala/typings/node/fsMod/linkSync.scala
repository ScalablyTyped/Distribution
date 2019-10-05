package typings.node.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "linkSync")
@js.native
object linkSync extends js.Object {
  /**
    * Synchronous link(2) - Create a new link (also known as a hard link) to an existing file.
    * @param existingPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def apply(existingPath: PathLike, newPath: PathLike): Unit = js.native
}

