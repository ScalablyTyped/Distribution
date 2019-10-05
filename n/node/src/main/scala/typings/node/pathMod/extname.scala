package typings.node.pathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("path", "extname")
@js.native
object extname extends js.Object {
  /**
    * Return the extension of the path, from the last '.' to end of string in the last portion of the path.
    * If there is no '.' in the last portion of the path or the first character of it is '.', then it returns an empty string
    *
    * @param p the path to evaluate.
    */
  def apply(p: java.lang.String): java.lang.String = js.native
}

