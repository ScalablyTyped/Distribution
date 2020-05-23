package typings.parsimmon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parsimmon", "of")
@js.native
object of extends js.Object {
  /**
    * This is an alias for Parsimmon.succeed(result).
    */
  def apply[U](result: U): Parser[U] = js.native
}

