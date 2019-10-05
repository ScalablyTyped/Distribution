package typings.node.pathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("path", "basename")
@js.native
object basename extends js.Object {
  /**
    * Return the last portion of a path. Similar to the Unix basename command.
    * Often used to extract the file name from a fully qualified path.
    *
    * @param p the path to evaluate.
    * @param ext optionally, an extension to remove from the result.
    */
  def apply(p: java.lang.String): java.lang.String = js.native
  def apply(p: java.lang.String, ext: java.lang.String): java.lang.String = js.native
}

