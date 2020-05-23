package typings.meteor.checkMod.Match

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.std.BooleanConstructor
import typings.std.FunctionConstructor
import typings.std.NumberConstructor
import typings.std.ObjectConstructor
import typings.std.StringConstructor
import typings.std.global.Function
import typings.std.global.Number
import typings.std.global.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/check", "Match.Optional")
@js.native
object Optional extends js.Object {
  def apply(): Matcher[js.UndefOr[PatternMatch[js.UndefOr[scala.Nothing]]]] = js.native
  def apply(pattern: String): Matcher[js.UndefOr[PatternMatch[String]]] = js.native
  def apply(pattern: Boolean): Matcher[js.UndefOr[PatternMatch[Boolean]]] = js.native
  def apply(pattern: Double): Matcher[js.UndefOr[PatternMatch[Double]]] = js.native
  def apply[T /* <: (StringConstructor with Instantiable0[typings.std.global.String]) | (NumberConstructor with Instantiable0[Number]) | (BooleanConstructor with Instantiable0[typings.std.global.Boolean]) | (ObjectConstructor with Instantiable0[Object]) | (FunctionConstructor with (Instantiable1[/* args (repeated) */ String, Function])) | (Instantiable1[/* args (repeated) */ js.Any, js.Any]) | js.Array[Pattern] | StringDictionary[Pattern] | Matcher[_] */](pattern: T): Matcher[js.UndefOr[PatternMatch[T]]] = js.native
}

