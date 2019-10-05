package typings.parsimmon.parsimmonMod

import typings.parsimmon.parsimmonStrings.Empty
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parsimmon", "lookahead")
@js.native
object lookahead extends js.Object {
  def apply(arg: String): Parser[Empty] = js.native
  /**
  	 * Parses using arg, but does not consume what it parses. Yields an empty string.
  	 */
  def apply(arg: Parser[_]): Parser[Empty] = js.native
  def apply(arg: RegExp): Parser[Empty] = js.native
}

