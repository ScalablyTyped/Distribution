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
}

