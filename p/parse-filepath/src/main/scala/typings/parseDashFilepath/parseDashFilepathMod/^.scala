package typings.parseDashFilepath.parseDashFilepathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse-filepath", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Pollyfill for node.js `path.parse()`, parses a filepath into an object.
    *
    * @param filepath
    */
  def apply(filepath: String): ParsedPath = js.native
}

