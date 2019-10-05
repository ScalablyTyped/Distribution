package typings.node.pathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("path", "join")
@js.native
object join extends js.Object {
  /**
    * Join all arguments together and normalize the resulting path.
    * Arguments must be strings. In v0.8, non-string arguments were silently ignored. In v0.10 and up, an exception is thrown.
    *
    * @param paths paths to join.
    */
  def apply(paths: java.lang.String*): java.lang.String = js.native
}

