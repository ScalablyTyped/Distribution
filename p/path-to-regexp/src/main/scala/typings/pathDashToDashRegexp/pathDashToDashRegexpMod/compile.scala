package typings.pathDashToDashRegexp.pathDashToDashRegexpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("path-to-regexp", "compile")
@js.native
object compile extends js.Object {
  def apply[P /* <: js.Object */](path: String): PathFunction[P] = js.native
  def apply[P /* <: js.Object */](path: String, options: ParseOptions with TokensToFunctionOptions): PathFunction[P] = js.native
}

