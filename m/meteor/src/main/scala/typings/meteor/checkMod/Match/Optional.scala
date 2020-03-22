package typings.meteor.checkMod.Match

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

@JSImport("meteor/check", "Match.Optional")
@js.native
object Optional extends js.Object {
  def apply(): Matcher[js.UndefOr[PatternMatch[js.UndefOr[scala.Nothing]]]] = js.native
  def apply(pattern: String): Matcher[js.UndefOr[PatternMatch[String]]] = js.native
  def apply(pattern: Boolean): Matcher[js.UndefOr[PatternMatch[Boolean]]] = js.native
  def apply(pattern: Double): Matcher[js.UndefOr[PatternMatch[Double]]] = js.native
  def apply(pattern: BooleanConstructor): Matcher[js.UndefOr[PatternMatch[BooleanConstructor]]] = js.native
  def apply(pattern: FunctionConstructor): Matcher[js.UndefOr[PatternMatch[FunctionConstructor]]] = js.native
  def apply(pattern: NumberConstructor): Matcher[js.UndefOr[PatternMatch[NumberConstructor]]] = js.native
  def apply(pattern: ObjectConstructor): Matcher[js.UndefOr[PatternMatch[ObjectConstructor]]] = js.native
  def apply(pattern: StringConstructor): Matcher[js.UndefOr[PatternMatch[StringConstructor]]] = js.native
  def apply[T /* <: (Instantiable1[/* args (repeated) */ js.Any, js.Any]) | js.Array[Pattern] | StringDictionary[Pattern] | Matcher[_] */](pattern: T): Matcher[js.UndefOr[PatternMatch[T]]] = js.native
}

