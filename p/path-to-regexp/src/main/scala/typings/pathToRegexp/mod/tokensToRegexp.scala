package typings.pathToRegexp.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("path-to-regexp", "tokensToRegexp")
@js.native
object tokensToRegexp extends js.Object {
  def apply(tokens: js.Array[Token]): RegExp = js.native
  def apply(tokens: js.Array[Token], keys: js.UndefOr[scala.Nothing], options: TokensToRegexpOptions): RegExp = js.native
  def apply(tokens: js.Array[Token], keys: js.Array[Key]): RegExp = js.native
  def apply(tokens: js.Array[Token], keys: js.Array[Key], options: TokensToRegexpOptions): RegExp = js.native
}

