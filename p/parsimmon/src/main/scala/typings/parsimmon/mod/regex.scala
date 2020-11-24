package typings.parsimmon.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("parsimmon", "regex")
@js.native
object regex extends js.Object {
  
  /**
    * This was the original name for Parsimmon.regexp, but now it is just an alias.
    */
  def apply(myregex: RegExp): Parser[String] = js.native
  def apply(myregex: RegExp, group: Double): Parser[String] = js.native
}
