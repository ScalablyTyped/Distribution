package typings.parsimmon.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parsimmon", "regexp")
@js.native
object regexp extends js.Object {
  /**
    * Returns a parser that looks for a match to the regexp and yields the given match group
    * (defaulting to the entire match). The regexp will always match starting at the current
    * parse location. The regexp may only use the following flags: imu. Any other flag will
    * result in an error being thrown.
    */
  def apply(myregex: RegExp): Parser[String] = js.native
  def apply(myregex: RegExp, group: Double): Parser[String] = js.native
}

