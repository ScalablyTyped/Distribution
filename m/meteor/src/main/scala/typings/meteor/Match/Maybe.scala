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

@JSGlobal("Match.Maybe")
@js.native
object Maybe extends js.Object {
  def apply(): Matcher[js.UndefOr[PatternMatch[js.UndefOr[scala.Nothing]] | Null]] = js.native
  def apply(pattern: String): Matcher[js.UndefOr[PatternMatch[String] | Null]] = js.native
  def apply(pattern: Boolean): Matcher[js.UndefOr[PatternMatch[Boolean] | Null]] = js.native
  def apply(pattern: Double): Matcher[js.UndefOr[PatternMatch[Double] | Null]] = js.native
  def apply(pattern: BooleanConstructor): Matcher[js.UndefOr[PatternMatch[BooleanConstructor] | Null]] = js.native
  def apply(pattern: FunctionConstructor): Matcher[js.UndefOr[PatternMatch[FunctionConstructor] | Null]] = js.native
  def apply(pattern: NumberConstructor): Matcher[js.UndefOr[PatternMatch[NumberConstructor] | Null]] = js.native
  def apply(pattern: ObjectConstructor): Matcher[js.UndefOr[PatternMatch[ObjectConstructor] | Null]] = js.native
  def apply(pattern: StringConstructor): Matcher[js.UndefOr[PatternMatch[StringConstructor] | Null]] = js.native
  def apply[T /* <: (Instantiable1[/* args (repeated) */ js.Any, js.Any]) | js.Array[Pattern] | StringDictionary[Pattern] | Matcher[_] */](pattern: T): Matcher[js.UndefOr[PatternMatch[T] | Null]] = js.native
}

