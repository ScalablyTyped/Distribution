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

@JSImport("meteor/check", "Match.test")
@js.native
object test extends js.Object {
  def apply(value: js.Any): /* is meteor.meteor/check.Match.PatternMatch<undefined> */ Boolean = js.native
  def apply(value: js.Any, pattern: String): /* is meteor.meteor/check.Match.PatternMatch<string> */ Boolean = js.native
  def apply(value: js.Any, pattern: Boolean): /* is meteor.meteor/check.Match.PatternMatch<boolean> */ Boolean = js.native
  def apply(value: js.Any, pattern: Double): /* is meteor.meteor/check.Match.PatternMatch<number> */ Boolean = js.native
  def apply[T /* <: (StringConstructor with Instantiable0[typings.std.global.String]) | (NumberConstructor with Instantiable0[Number]) | (BooleanConstructor with Instantiable0[typings.std.global.Boolean]) | (ObjectConstructor with Instantiable0[Object]) | (FunctionConstructor with (Instantiable1[/* args (repeated) */ String, Function])) | (Instantiable1[/* args (repeated) */ js.Any, js.Any]) | js.Array[Pattern] | StringDictionary[Pattern] | Matcher[_] */](value: js.Any, pattern: T): /* is meteor.meteor/check.Match.PatternMatch<T> */ Boolean = js.native
}

