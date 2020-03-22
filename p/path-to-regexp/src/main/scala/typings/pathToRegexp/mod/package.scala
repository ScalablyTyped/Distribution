package typings.pathToRegexp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type MatchFunction[P /* <: js.Object */] = js.Function1[/* path */ java.lang.String, typings.pathToRegexp.mod.Match_[P]]
  type Path = java.lang.String | typings.std.RegExp | (js.Array[java.lang.String | typings.std.RegExp])
  type PathFunction[P /* <: js.Object */] = js.Function1[/* data */ js.UndefOr[P], java.lang.String]
  type Token = java.lang.String | typings.pathToRegexp.mod.Key
}
