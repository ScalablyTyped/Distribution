package typings.pathDashToDashRegexp

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pathDashToDashRegexpMod {
  type Path = String | RegExp | (js.Array[String | RegExp])
  type PathFunction[P /* <: js.Object */] = js.Function2[/* data */ js.UndefOr[P], /* options */ js.UndefOr[PathFunctionOptions], String]
  type Token = String | Key
}
