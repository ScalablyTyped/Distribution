package typings.pegjs.pegjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parser extends js.Object {
  var SyntaxError: js.Any = js.native
  def parse(input: String): js.Any = js.native
  def parse(input: String, options: ParserOptions): js.Any = js.native
}

