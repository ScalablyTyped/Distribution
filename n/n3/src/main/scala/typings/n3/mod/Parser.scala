package typings.n3.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("n3", "Parser")
@js.native
class Parser[Q /* <: BaseQuad */] () extends N3Parser[Q] {
  def this(options: ParserOptions) = this()
}

@JSImport("n3", "Parser")
@js.native
object Parser extends TopLevel[ParserConstructor]

