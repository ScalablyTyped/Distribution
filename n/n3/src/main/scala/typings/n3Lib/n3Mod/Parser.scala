package typings
package n3Lib.n3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("n3", "Parser")
@js.native
class Parser[Q /* <: BaseQuad */] () extends N3Parser[Q] {
  def this(options: ParserOptions) = this()
}

