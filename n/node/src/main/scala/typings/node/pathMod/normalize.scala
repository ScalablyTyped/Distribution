package typings.node.pathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("path", "normalize")
@js.native
object normalize extends js.Object {
  /**
    * Normalize a string path, reducing '..' and '.' parts.
    * When multiple slashes are found, they're replaced by a single one; when the path contains a trailing slash, it is preserved. On Windows backslashes are used.
    *
    * @param p string path to normalize.
    */
  def apply(p: java.lang.String): java.lang.String = js.native
}

