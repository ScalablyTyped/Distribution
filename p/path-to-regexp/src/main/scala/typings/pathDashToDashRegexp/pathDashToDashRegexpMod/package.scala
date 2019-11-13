package typings.pathDashToDashRegexp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pathDashToDashRegexpMod {
  import typings.std.RegExp

  type MatchFunction[P /* <: js.Object */] = js.Function2[/* path */ String, /* options */ js.UndefOr[MatchFunctionOptions], Match[P]]
  type Path = String | RegExp | (js.Array[String | RegExp])
  type PathFunction[P /* <: js.Object */] = js.Function2[/* data */ js.UndefOr[P], /* options */ js.UndefOr[PathFunctionOptions], String]
  type Token = String | Key
}
