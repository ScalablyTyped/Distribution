package typings.parsimmon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("parsimmon", "notFollowedBy")
@js.native
object notFollowedBy extends js.Object {
  
  /**
    * Parses using parser, but does not consume what it parses. Yields null if the parser
    * does not match the input. Otherwise it fails.
    */
  def apply(parser: Parser[_]): Parser[Null] = js.native
}
