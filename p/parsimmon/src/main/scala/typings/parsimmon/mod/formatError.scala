package typings.parsimmon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parsimmon", "formatError")
@js.native
object formatError extends js.Object {
  /**
    * Takes the string passed to parser.parse(string) and the error returned from
    * parser.parse(string) and turns it into a human readable error message string.
    * Note that there are certainly better ways to format errors, so feel free to write your own.
    */
  def apply[T](string: String, error: Result[T]): String = js.native
}

