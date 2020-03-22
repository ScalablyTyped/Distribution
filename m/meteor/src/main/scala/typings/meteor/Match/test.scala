package typings.meteor.Match

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.std.BooleanConstructor
import typings.std.FunctionConstructor
import typings.std.NumberConstructor
import typings.std.ObjectConstructor
import typings.std.StringConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Match.test")
@js.native
object test extends js.Object {
  def apply(value: js.Any): /* is meteor.Match.PatternMatch<undefined> */ Boolean = js.native
  def apply(value: js.Any, pattern: String): /* is meteor.Match.PatternMatch<string> */ Boolean = js.native
  def apply(value: js.Any, pattern: Boolean): /* is meteor.Match.PatternMatch<boolean> */ Boolean = js.native
  def apply(value: js.Any, pattern: Double): /* is meteor.Match.PatternMatch<number> */ Boolean = js.native
  def apply(value: js.Any, pattern: BooleanConstructor): /* is meteor.Match.PatternMatch<std.BooleanConstructor> */ Boolean = js.native
  def apply(value: js.Any, pattern: FunctionConstructor): /* is meteor.Match.PatternMatch<std.FunctionConstructor> */ Boolean = js.native
  def apply(value: js.Any, pattern: NumberConstructor): /* is meteor.Match.PatternMatch<std.NumberConstructor> */ Boolean = js.native
  def apply(value: js.Any, pattern: ObjectConstructor): /* is meteor.Match.PatternMatch<std.ObjectConstructor> */ Boolean = js.native
  def apply(value: js.Any, pattern: StringConstructor): /* is meteor.Match.PatternMatch<std.StringConstructor> */ Boolean = js.native
  def apply[T /* <: (Instantiable1[/* args (repeated) */ js.Any, js.Any]) | js.Array[Pattern] | StringDictionary[Pattern] | Matcher[_] */](value: js.Any, pattern: T): /* is meteor.Match.PatternMatch<T> */ Boolean = js.native
}

