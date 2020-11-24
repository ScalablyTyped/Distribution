package typings.parsimmon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("parsimmon", "string")
@js.native
object string extends js.Object {
  
  /**
    * is a parser that expects to find "my-string", and will yield the same.
    */
  def apply(string: String): Parser[String] = js.native
}
