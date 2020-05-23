package typings.meteor.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.meteor.Match.Matcher
import typings.meteor.Match.Pattern
import typings.meteor.Match.PatternMatch
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

@JSGlobal("Match")
@js.native
object Match extends js.Object {
  var Any: Matcher[js.Any] = js.native
  var Integer: Matcher[Double] = js.native
  def Maybe(): Matcher[js.UndefOr[PatternMatch[js.UndefOr[scala.Nothing]] | Null]] = js.native
  def Maybe(pattern: String): Matcher[js.UndefOr[PatternMatch[String] | Null]] = js.native
  def Maybe(pattern: Boolean): Matcher[js.UndefOr[PatternMatch[Boolean] | Null]] = js.native
  def Maybe(pattern: Double): Matcher[js.UndefOr[PatternMatch[Double] | Null]] = js.native
  def Maybe[T /* <: (StringConstructor with Instantiable0[typings.std.global.String]) | (NumberConstructor with Instantiable0[Number]) | (BooleanConstructor with Instantiable0[typings.std.global.Boolean]) | (ObjectConstructor with Instantiable0[Object]) | (FunctionConstructor with (Instantiable1[/* args (repeated) */ String, Function])) | (Instantiable1[/* args (repeated) */ js.Any, js.Any]) | js.Array[Pattern] | StringDictionary[Pattern] | Matcher[_] */](pattern: T): Matcher[js.UndefOr[PatternMatch[T] | Null]] = js.native
  def ObjectIncluding[T /* <: StringDictionary[Pattern] */](dico: T): Matcher[PatternMatch[T]] = js.native
  def OneOf[T /* <: js.Array[Pattern] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param patterns because its type T is not an array type */ patterns: T
  ): Matcher[
    PatternMatch[
      /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
    ]
  ] = js.native
  def Optional(): Matcher[js.UndefOr[PatternMatch[js.UndefOr[scala.Nothing]]]] = js.native
  def Optional(pattern: String): Matcher[js.UndefOr[PatternMatch[String]]] = js.native
  def Optional(pattern: Boolean): Matcher[js.UndefOr[PatternMatch[Boolean]]] = js.native
  def Optional(pattern: Double): Matcher[js.UndefOr[PatternMatch[Double]]] = js.native
  def Optional[T /* <: (StringConstructor with Instantiable0[typings.std.global.String]) | (NumberConstructor with Instantiable0[Number]) | (BooleanConstructor with Instantiable0[typings.std.global.Boolean]) | (ObjectConstructor with Instantiable0[Object]) | (FunctionConstructor with (Instantiable1[/* args (repeated) */ String, Function])) | (Instantiable1[/* args (repeated) */ js.Any, js.Any]) | js.Array[Pattern] | StringDictionary[Pattern] | Matcher[_] */](pattern: T): Matcher[js.UndefOr[PatternMatch[T]]] = js.native
  def Where(condition: js.Function1[/* val */ js.Any, Boolean]): Matcher[_] = js.native
  def test(value: js.Any): /* is meteor.Match.PatternMatch<undefined> */ Boolean = js.native
  def test(value: js.Any, pattern: String): /* is meteor.Match.PatternMatch<string> */ Boolean = js.native
  def test(value: js.Any, pattern: Boolean): /* is meteor.Match.PatternMatch<boolean> */ Boolean = js.native
  def test(value: js.Any, pattern: Double): /* is meteor.Match.PatternMatch<number> */ Boolean = js.native
  def test[T /* <: (StringConstructor with Instantiable0[typings.std.global.String]) | (NumberConstructor with Instantiable0[Number]) | (BooleanConstructor with Instantiable0[typings.std.global.Boolean]) | (ObjectConstructor with Instantiable0[Object]) | (FunctionConstructor with (Instantiable1[/* args (repeated) */ String, Function])) | (Instantiable1[/* args (repeated) */ js.Any, js.Any]) | js.Array[Pattern] | StringDictionary[Pattern] | Matcher[_] */](value: js.Any, pattern: T): /* is meteor.Match.PatternMatch<T> */ Boolean = js.native
}

