package typings.pathToRegexp.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("path-to-regexp", "tokensToRegExp")
@js.native
object tokensToRegExp extends js.Object {
  def apply(tokens: js.Array[Token]): RegExp = js.native
  def apply(tokens: js.Array[Token], keys: js.Array[Key]): RegExp = js.native
  def apply(tokens: js.Array[Token], keys: js.Array[Key], options: RegExpOptions): RegExp = js.native
}

