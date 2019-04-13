package typings
package pathDashToDashRegexpLib.pathDashToDashRegexpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("path-to-regexp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(path: Path): stdLib.RegExp = js.native
  def apply(path: Path, keys: js.Array[Key]): stdLib.RegExp = js.native
  def apply(path: Path, keys: js.Array[Key], options: RegExpOptions with ParseOptions): stdLib.RegExp = js.native
  def compile[P /* <: js.Object */](path: java.lang.String): PathFunction[P] = js.native
  def compile[P /* <: js.Object */](path: java.lang.String, options: ParseOptions): PathFunction[P] = js.native
  def parse(path: java.lang.String): js.Array[Token] = js.native
  def parse(path: java.lang.String, options: ParseOptions): js.Array[Token] = js.native
  def tokensToFunction[P /* <: js.Object */](tokens: js.Array[Token]): PathFunction[P] = js.native
  def tokensToRegExp(tokens: js.Array[Token]): stdLib.RegExp = js.native
  def tokensToRegExp(tokens: js.Array[Token], keys: js.Array[Key]): stdLib.RegExp = js.native
  def tokensToRegExp(tokens: js.Array[Token], keys: js.Array[Key], options: RegExpOptions): stdLib.RegExp = js.native
}

