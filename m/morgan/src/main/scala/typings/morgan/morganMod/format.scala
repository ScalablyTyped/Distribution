package typings.morgan.morganMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("morgan", "format")
@js.native
object format extends js.Object {
  /**
    * Define a named custom format by specifying a format string in token
    * notation.
    */
  def apply(name: String, fmt: String): Morgan = js.native
  /**
    * Define a named custom format by specifying a format function.
    */
  def apply(name: String, fmt: FormatFn): Morgan = js.native
}

