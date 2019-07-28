package typings.pathDashToDashRegexp.pathDashToDashRegexpMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("path-to-regexp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(path: Path): RegExp = js.native
  def apply(path: Path, keys: js.Array[Key]): RegExp = js.native
  def apply(path: Path, keys: js.Array[Key], options: RegExpOptions with ParseOptions): RegExp = js.native
  def compile[P /* <: js.Object */](path: String): PathFunction[P] = js.native
  def compile[P /* <: js.Object */](path: String, options: ParseOptions): PathFunction[P] = js.native
  def parse(path: String): js.Array[Token] = js.native
  def parse(path: String, options: ParseOptions): js.Array[Token] = js.native
  def tokensToFunction[P /* <: js.Object */](tokens: js.Array[Token]): PathFunction[P] = js.native
  def tokensToRegExp(tokens: js.Array[Token]): RegExp = js.native
  def tokensToRegExp(tokens: js.Array[Token], keys: js.Array[Key]): RegExp = js.native
  def tokensToRegExp(tokens: js.Array[Token], keys: js.Array[Key], options: RegExpOptions): RegExp = js.native
}

