package typings.meteor.global

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Match {
  
  @JSGlobal("Match")
  @js.native
  val ^ : js.Any = js.native
  
  /** Matches any value. */
  @JSGlobal("Match.Any")
  @js.native
  def Any: Matcher[scala.Any] = js.native
  inline def Any_=(x: Matcher[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Any")(x.asInstanceOf[js.Any])
  
  /** Matches a signed 32-bit integer. Doesn’t match `Infinity`, `-Infinity`, or `NaN`. */
  @JSGlobal("Match.Integer")
  @js.native
  def Integer: Matcher[Double] = js.native
  inline def Integer_=(x: Matcher[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Integer")(x.asInstanceOf[js.Any])
  
  inline def Maybe(pattern: String): Matcher[js.UndefOr[PatternMatch[String] | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Maybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[String] | Null]]]
  inline def Maybe(pattern: Boolean): Matcher[js.UndefOr[PatternMatch[Boolean] | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Maybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[Boolean] | Null]]]
  inline def Maybe(pattern: Double): Matcher[js.UndefOr[PatternMatch[Double] | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Maybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[Double] | Null]]]
  inline def Maybe(pattern: Null): Matcher[js.UndefOr[PatternMatch[Null] | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Maybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[Null] | Null]]]
  inline def Maybe(pattern: Unit): Matcher[js.UndefOr[PatternMatch[Unit] | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Maybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[Unit] | Null]]]
  inline def Maybe(pattern: BooleanConstructor): Matcher[js.UndefOr[PatternMatch[BooleanConstructor] | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Maybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[BooleanConstructor] | Null]]]
  inline def Maybe(pattern: FunctionConstructor): Matcher[js.UndefOr[PatternMatch[FunctionConstructor] | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Maybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[FunctionConstructor] | Null]]]
  inline def Maybe(pattern: NumberConstructor): Matcher[js.UndefOr[PatternMatch[NumberConstructor] | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Maybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[NumberConstructor] | Null]]]
  inline def Maybe(pattern: ObjectConstructor): Matcher[js.UndefOr[PatternMatch[ObjectConstructor] | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Maybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[ObjectConstructor] | Null]]]
  /**
    * Matches either `undefined`, `null`, or pattern. If used in an object, matches only if the key is not set as opposed to the value being set to `undefined` or `null`. This set of conditions
    * was chosen because `undefined` arguments to Meteor Methods are converted to `null` when sent over the wire.
    */
  inline def Maybe(pattern: StringConstructor): Matcher[js.UndefOr[PatternMatch[StringConstructor] | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Maybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[StringConstructor] | Null]]]
  inline def Maybe[T /* <: (Instantiable1[/* args (repeated) */ Any, Any]) | js.Array[Pattern] | StringDictionary[Pattern] | Matcher[Any] */](pattern: T): Matcher[js.UndefOr[PatternMatch[T] | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Maybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[T] | Null]]]
  
  /** Matches an Object with the given keys; the value may also have other keys with arbitrary values. */
  inline def ObjectIncluding[T /* <: StringDictionary[Pattern] */](dico: T): Matcher[PatternMatch[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ObjectIncluding")(dico.asInstanceOf[js.Any]).asInstanceOf[Matcher[PatternMatch[T]]]
  
  /** Matches any value that matches at least one of the provided patterns. */
  inline def OneOf[T /* <: js.Array[Pattern] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param patterns because its type T is not an array type */ patterns: T
  ): Matcher[
    PatternMatch[
      /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("OneOf")(patterns.asInstanceOf[js.Any]).asInstanceOf[Matcher[
    PatternMatch[
      /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
    ]
  ]]
  
  inline def Optional(pattern: String): Matcher[js.UndefOr[PatternMatch[String]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Optional")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[String]]]]
  inline def Optional(pattern: Boolean): Matcher[js.UndefOr[PatternMatch[Boolean]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Optional")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[Boolean]]]]
  inline def Optional(pattern: Double): Matcher[js.UndefOr[PatternMatch[Double]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Optional")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[Double]]]]
  inline def Optional(pattern: Null): Matcher[js.UndefOr[PatternMatch[Null]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Optional")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[Null]]]]
  inline def Optional(pattern: Unit): Matcher[js.UndefOr[PatternMatch[Unit]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Optional")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[Unit]]]]
  inline def Optional(pattern: BooleanConstructor): Matcher[js.UndefOr[PatternMatch[BooleanConstructor]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Optional")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[BooleanConstructor]]]]
  inline def Optional(pattern: FunctionConstructor): Matcher[js.UndefOr[PatternMatch[FunctionConstructor]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Optional")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[FunctionConstructor]]]]
  inline def Optional(pattern: NumberConstructor): Matcher[js.UndefOr[PatternMatch[NumberConstructor]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Optional")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[NumberConstructor]]]]
  inline def Optional(pattern: ObjectConstructor): Matcher[js.UndefOr[PatternMatch[ObjectConstructor]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Optional")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[ObjectConstructor]]]]
  /** Behaves like `Match.Maybe` except it doesn’t accept `null`. If used in an object, the behavior is identical to `Match.Maybe`. */
  inline def Optional(pattern: StringConstructor): Matcher[js.UndefOr[PatternMatch[StringConstructor]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Optional")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[StringConstructor]]]]
  inline def Optional[T /* <: (Instantiable1[/* args (repeated) */ Any, Any]) | js.Array[Pattern] | StringDictionary[Pattern] | Matcher[Any] */](pattern: T): Matcher[js.UndefOr[PatternMatch[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Optional")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[T]]]]
  
  inline def Where(condition: js.Function1[/* val */ Any, Boolean]): Matcher[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("Where")(condition.asInstanceOf[js.Any]).asInstanceOf[Matcher[Any]]
  
  /**
    * Calls the function condition with the value as the argument. If condition returns true, this matches. If condition throws a `Match.Error` or returns false, this fails. If condition throws
    * any other error, that error is thrown from the call to `check` or `Match.test`.
    */
  inline def Where_T[T](condition: js.Function1[/* val */ Any, /* is T */ Boolean]): Matcher[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Where")(condition.asInstanceOf[js.Any]).asInstanceOf[Matcher[T]]
  
  inline def test(value: Any, pattern: String): /* is meteor.Match.PatternMatch<string> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* is meteor.Match.PatternMatch<string> */ Boolean]
  inline def test(value: Any, pattern: Boolean): /* is meteor.Match.PatternMatch<boolean> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* is meteor.Match.PatternMatch<boolean> */ Boolean]
  inline def test(value: Any, pattern: Double): /* is meteor.Match.PatternMatch<number> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* is meteor.Match.PatternMatch<number> */ Boolean]
  inline def test(value: Any, pattern: Null): /* is meteor.Match.PatternMatch<null> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* is meteor.Match.PatternMatch<null> */ Boolean]
  inline def test(value: Any, pattern: Unit): /* is meteor.Match.PatternMatch<undefined> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* is meteor.Match.PatternMatch<undefined> */ Boolean]
  inline def test(value: Any, pattern: BooleanConstructor): /* is meteor.Match.PatternMatch<std.BooleanConstructor> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* is meteor.Match.PatternMatch<std.BooleanConstructor> */ Boolean]
  inline def test(value: Any, pattern: FunctionConstructor): /* is meteor.Match.PatternMatch<std.FunctionConstructor> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* is meteor.Match.PatternMatch<std.FunctionConstructor> */ Boolean]
  inline def test(value: Any, pattern: NumberConstructor): /* is meteor.Match.PatternMatch<std.NumberConstructor> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* is meteor.Match.PatternMatch<std.NumberConstructor> */ Boolean]
  inline def test(value: Any, pattern: ObjectConstructor): /* is meteor.Match.PatternMatch<std.ObjectConstructor> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* is meteor.Match.PatternMatch<std.ObjectConstructor> */ Boolean]
  /**
    * Returns true if the value matches the pattern.
    * @param value The value to check
    * @param pattern The pattern to match `value` against
    */
  inline def test(value: Any, pattern: StringConstructor): /* is meteor.Match.PatternMatch<std.StringConstructor> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* is meteor.Match.PatternMatch<std.StringConstructor> */ Boolean]
  inline def test[T /* <: (Instantiable1[/* args (repeated) */ Any, Any]) | js.Array[Pattern] | StringDictionary[Pattern] | Matcher[Any] */](value: Any, pattern: T): /* is meteor.Match.PatternMatch<T> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* is meteor.Match.PatternMatch<T> */ Boolean]
}
