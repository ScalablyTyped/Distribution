package typings.parsimmon.parsimmonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parsimmon", "lazy")
@js.native
object `lazy` extends js.Object {
  def apply[U](description: String, f: js.Function0[Parser[U]]): Parser[U] = js.native
  /**
  	 * accepts a function that returns a parser, which is evaluated the first time the parser is used.
  	 * This is useful for referencing parsers that haven't yet been defined.
  	 */
  def apply[U](f: js.Function0[Parser[U]]): Parser[U] = js.native
}

