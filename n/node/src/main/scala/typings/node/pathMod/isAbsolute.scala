package typings.node.pathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("path", "isAbsolute")
@js.native
object isAbsolute extends js.Object {
  /**
    * Determines whether {path} is an absolute path. An absolute path will always resolve to the same location, regardless of the working directory.
    *
    * @param path path to test.
    */
  def apply(path: java.lang.String): Boolean = js.native
}

