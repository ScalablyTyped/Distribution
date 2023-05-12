package typings.miscUtilsOfMineGeneric

import org.scalablytyped.runtime.StringDictionary
import typings.miscUtilsOfMineGeneric.anon.Cwd
import typings.miscUtilsOfMineGeneric.anon.Domain
import typings.miscUtilsOfMineGeneric.anon.IgnoreArrayElements
import typings.miscUtilsOfMineGeneric.anon.Key
import typings.miscUtilsOfMineGeneric.anon.KeyValue
import typings.miscUtilsOfMineGeneric.anon.Leading
import typings.miscUtilsOfMineGeneric.anon.Minutes
import typings.miscUtilsOfMineGeneric.anon.Params
import typings.miscUtilsOfMineGeneric.anon.ParseBoolean
import typings.miscUtilsOfMineGeneric.anon.ParseParams
import typings.miscUtilsOfMineGeneric.anon.Pos
import typings.miscUtilsOfMineGeneric.anon.Value
import typings.miscUtilsOfMineGeneric.distSrcArrayPrototypeFindMod.FindPredicate
import typings.miscUtilsOfMineGeneric.distSrcCompareTextMod.CompareTextOptions
import typings.miscUtilsOfMineGeneric.distSrcCompareTextMod.CompareTextsOptions
import typings.miscUtilsOfMineGeneric.distSrcEventMod.Listener
import typings.miscUtilsOfMineGeneric.distSrcGeometryMod.IPoint
import typings.miscUtilsOfMineGeneric.distSrcGeometryMod.IRect
import typings.miscUtilsOfMineGeneric.distSrcJsonMod.JSONValue
import typings.miscUtilsOfMineGeneric.distSrcNumberNormalizationMod.Normalizer
import typings.miscUtilsOfMineGeneric.distSrcSqlMod.MapSqlParams
import typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderSide
import typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderStyle
import typings.miscUtilsOfMineGeneric.distSrcStringEncryptLettersMod.EncryptLettersConfig
import typings.miscUtilsOfMineGeneric.distSrcStringHtmlMod.HtmlElementConfig
import typings.miscUtilsOfMineGeneric.distSrcTimeAnimMod.AnimateOptions
import typings.miscUtilsOfMineGeneric.distSrcTimeAnimMod.Timing
import typings.miscUtilsOfMineGeneric.distSrcTimeAnimMod.TimingObject
import typings.miscUtilsOfMineGeneric.distSrcTimeNextTimeMod.NextTimeConfig
import typings.miscUtilsOfMineGeneric.distSrcTimeWaitForMod.WaitForPredicateOptions
import typings.miscUtilsOfMineGeneric.distSrcTreeMod.Node
import typings.miscUtilsOfMineGeneric.distSrcTreeMod.NodePredicate
import typings.miscUtilsOfMineGeneric.distSrcTreeMod.NodeSimplePredicate
import typings.miscUtilsOfMineGeneric.distSrcTreeMod.Visitor
import typings.miscUtilsOfMineGeneric.distSrcTreeMod.VisitorOptions
import typings.miscUtilsOfMineGeneric.distSrcTypeMod.EmptyObject
import typings.miscUtilsOfMineGeneric.distSrcTypeMod.ObjectStringKeyUnion
import typings.miscUtilsOfMineGeneric.miscUtilsOfMineGenericStrings.MMSlashDDSlashYYYY
import typings.miscUtilsOfMineGeneric.miscUtilsOfMineGenericStrings._empty
import typings.miscUtilsOfMineGeneric.miscUtilsOfMineGenericStrings.`YYYY-MM-DDTHHColonMMZ`
import typings.miscUtilsOfMineGeneric.miscUtilsOfMineGenericStrings.`YYYY-MM-DD`
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("misc-utils-of-mine-generic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("misc-utils-of-mine-generic", "BorderSide")
  @js.native
  object BorderSide extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderSide & String] = js.native
    
    /* "bottom" */ val bottom: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderSide.bottom & String = js.native
    
    /* "bottomLeft" */ val bottomLeft: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderSide.bottomLeft & String = js.native
    
    /* "bottomRight" */ val bottomRight: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderSide.bottomRight & String = js.native
    
    /* "left" */ val left: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderSide.left & String = js.native
    
    /* "right" */ val right: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderSide.right & String = js.native
    
    /* "top" */ val top: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderSide.top & String = js.native
    
    /* "topLeft" */ val topLeft: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderSide.topLeft & String = js.native
    
    /* "topRight" */ val topRight: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderSide.topRight & String = js.native
  }
  
  @JSImport("misc-utils-of-mine-generic", "BorderStyle")
  @js.native
  object BorderStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderStyle & String] = js.native
    
    /* "classic" */ val classic: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderStyle.classic & String = js.native
    
    /* "double" */ val double: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderStyle.double & String = js.native
    
    /* "doubleLight" */ val doubleLight: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderStyle.doubleLight & String = js.native
    
    /* "heavier" */ val heavier: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderStyle.heavier & String = js.native
    
    /* "heavy" */ val heavy: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderStyle.heavy & String = js.native
    
    /* "heavyDoubleDash" */ val heavyDoubleDash: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderStyle.heavyDoubleDash & String = js.native
    
    /* "heavyQuadrupleDash" */ val heavyQuadrupleDash: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderStyle.heavyQuadrupleDash & String = js.native
    
    /* "heavyTripleDash" */ val heavyTripleDash: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderStyle.heavyTripleDash & String = js.native
    
    /* "light" */ val light: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderStyle.light & String = js.native
    
    /* "lightDouble" */ val lightDouble: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderStyle.lightDouble & String = js.native
    
    /* "lightDoubleDash" */ val lightDoubleDash: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderStyle.lightDoubleDash & String = js.native
    
    /* "lightQuadrupleDash" */ val lightQuadrupleDash: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderStyle.lightQuadrupleDash & String = js.native
    
    /* "lightTripleDash" */ val lightTripleDash: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderStyle.lightTripleDash & String = js.native
    
    /* "round" */ val round: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderStyle.round & String = js.native
    
    /* "roundDoubleDash" */ val roundDoubleDash: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderStyle.roundDoubleDash & String = js.native
    
    /* "roundQuadrupleDash" */ val roundQuadrupleDash: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderStyle.roundQuadrupleDash & String = js.native
    
    /* "roundTripleDash" */ val roundTripleDash: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderStyle.roundTripleDash & String = js.native
    
    /* "singleRareCorners" */ val singleRareCorners: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderStyle.singleRareCorners & String = js.native
    
    /* "triangleCorners" */ val triangleCorners: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderStyle.triangleCorners & String = js.native
  }
  
  @JSImport("misc-utils-of-mine-generic", "Deferred")
  @js.native
  open class Deferred[R, J] ()
    extends typings.miscUtilsOfMineGeneric.distSrcPromiseMod.Deferred[R, J] {
    def this(callback: js.ThisFunction2[
            /* this */ typings.miscUtilsOfMineGeneric.distSrcPromiseMod.Deferred[R, J], 
            /* resolve */ js.Function1[/* r */ R, Unit], 
            /* reject */ js.UndefOr[js.Function1[/* r */ J, Unit]], 
            Unit
          ]) = this()
  }
  
  @JSImport("misc-utils-of-mine-generic", "Emitter")
  @js.native
  open class Emitter[E, L /* <: Listener[E] */] ()
    extends typings.miscUtilsOfMineGeneric.distSrcEventMod.Emitter[E, L]
  
  @JSImport("misc-utils-of-mine-generic", "Point")
  @js.native
  open class Point protected ()
    extends typings.miscUtilsOfMineGeneric.distSrcGeometryMod.Point {
    def this(x: Double, y: Double) = this()
  }
  
  @JSImport("misc-utils-of-mine-generic", "Rect")
  @js.native
  open class Rect protected ()
    extends typings.miscUtilsOfMineGeneric.distSrcGeometryMod.Rect {
    def this(left: Double, top: Double, right: Double, bottom: Double) = this()
  }
  
  inline def addUniqueParam(url: String, param: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addUniqueParam")(url.asInstanceOf[js.Any], param.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def animate(param0: AnimateOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("animate")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def anyUndefined(a: Any*): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("anyUndefined")(a.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Boolean]
  
  inline def array[T](n: Double): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(n.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def array[T](n: Double, sample: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("array")(n.asInstanceOf[js.Any], sample.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def arrayDifference[A](a: js.Array[A], b: js.Array[A]): js.Array[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayDifference")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[A]]
  inline def arrayDifference[A](a: js.Array[A], b: js.Array[A], predicate: js.Function2[/* a */ A, /* b */ A, Boolean]): js.Array[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayDifference")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Array[A]]
  inline def arrayDifference[A](
    a: js.Array[A],
    b: js.Array[A],
    predicate: js.Function2[/* a */ A, /* b */ A, Boolean],
    output: js.Array[A]
  ): js.Array[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayDifference")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.Array[A]]
  inline def arrayDifference[A](a: js.Array[A], b: js.Array[A], predicate: Unit, output: js.Array[A]): js.Array[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayDifference")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.Array[A]]
  
  inline def arrayInterception[A](a: js.Array[A], b: js.Array[A]): js.Array[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayInterception")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[A]]
  inline def arrayInterception[A](a: js.Array[A], b: js.Array[A], predicate: js.Function2[/* a */ A, /* b */ A, Boolean]): js.Array[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayInterception")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Array[A]]
  inline def arrayInterception[A](
    a: js.Array[A],
    b: js.Array[A],
    predicate: js.Function2[/* a */ A, /* b */ A, Boolean],
    output: js.Array[A]
  ): js.Array[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayInterception")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.Array[A]]
  inline def arrayInterception[A](a: js.Array[A], b: js.Array[A], predicate: Unit, output: js.Array[A]): js.Array[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayInterception")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.Array[A]]
  
  inline def arrayPrototypeFind[T, E](
    a: js.Array[T],
    predicate: FindPredicate[
      T, 
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof thisArg */ Any
    ]
  ): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayPrototypeFind")(a.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def arrayPrototypeFind[T, E](
    a: js.Array[T],
    predicate: FindPredicate[
      T, 
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof thisArg */ Any
    ],
    thisArg: E
  ): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayPrototypeFind")(a.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def arrayRangePartition[T](input: js.Array[T], length: Double): js.Array[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayRangePartition")(input.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[T]]]
  inline def arrayRangePartition[T](input: js.Array[T], length: Double, fillRestWith: T): js.Array[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayRangePartition")(input.asInstanceOf[js.Any], length.asInstanceOf[js.Any], fillRestWith.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[T]]]
  
  inline def arrayToObject[T](a: js.Array[String], fn: js.Function1[/* a */ String, js.UndefOr[T]]): StringDictionary[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayToObject")(a.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.UndefOr[T]]]
  
  inline def arrayUnion[T](a: js.Array[T], b: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayUnion")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def arrayUnion[T](a: js.Array[T], b: js.Array[T], predicate: js.Function2[/* a */ T, /* b */ T, Boolean]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayUnion")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def arrayUnion[T](
    a: js.Array[T],
    b: js.Array[T],
    predicate: js.Function2[/* a */ T, /* b */ T, Boolean],
    output: js.Array[T]
  ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayUnion")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def arrayUnion[T](a: js.Array[T], b: js.Array[T], predicate: Unit, output: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayUnion")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def asArray[T](value: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("asArray")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def asArray[T](value: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("asArray")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def asyncForEach(array: js.Array[Any], callback: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("asyncForEach")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def asyncMap[T, R](
    array: js.Array[T],
    callback: js.Function3[/* t */ T, /* i */ Double, /* a */ js.Array[T], js.Promise[R]]
  ): js.Promise[js.Array[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("asyncMap")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[R]]]
  
  inline def average(arr: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("average")(arr.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def basename(f: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("basename")(f.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def basename(f: String, removeExtension: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("basename")(f.asInstanceOf[js.Any], removeExtension.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def between(n: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(n.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def bin2dec(number: js.Array[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("bin2dec")(number.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("misc-utils-of-mine-generic", "binaryDigitNormalizer")
  @js.native
  val binaryDigitNormalizer: Normalizer = js.native
  
  @JSImport("misc-utils-of-mine-generic", "binaryStraightNormalizer")
  @js.native
  val binaryStraightNormalizer: Normalizer = js.native
  
  inline def blockFor(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("blockFor")().asInstanceOf[Unit]
  inline def blockFor(ms: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("blockFor")(ms.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("misc-utils-of-mine-generic", "borderStyles")
  @js.native
  val borderStyles: js.Array[String] = js.native
  
  inline def buildEnumMap(anEnum: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("buildEnumMap")(anEnum.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def bytesToKiloBytes(fileSizeInBytes: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesToKiloBytes")(fileSizeInBytes.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def capitalize(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalize")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def changeText(text: String, toInsert: js.Array[Pos]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("changeText")(text.asInstanceOf[js.Any], toInsert.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def checkThrow[T](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("checkThrow")().asInstanceOf[T]
  inline def checkThrow[T](r: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("checkThrow")(r.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def checkThrow[T](r: T, msg: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("checkThrow")(r.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def checkThrow[T](r: Unit, msg: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("checkThrow")(r.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def checkTruthy[T](): /* is misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/type.NotFalsy<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkTruthy")().asInstanceOf[/* is misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/type.NotFalsy<T> */ Boolean]
  inline def checkTruthy[T](r: T): /* is misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/type.NotFalsy<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkTruthy")(r.asInstanceOf[js.Any]).asInstanceOf[/* is misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/type.NotFalsy<T> */ Boolean]
  inline def checkTruthy[T](r: T, msg: String): /* is misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/type.NotFalsy<T> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkTruthy")(r.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[/* is misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/type.NotFalsy<T> */ Boolean]
  inline def checkTruthy[T](r: Unit, msg: String): /* is misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/type.NotFalsy<T> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkTruthy")(r.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[/* is misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/type.NotFalsy<T> */ Boolean]
  
  @JSImport("misc-utils-of-mine-generic", "clamp")
  @js.native
  val clamp: js.Function3[/* n */ Double, /* min */ Double, /* max */ Double, Double] = js.native
  
  inline def cloneJSON[T](a: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneJSON")(a.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def clone_(input: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(input.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def compareText(actual: String, expected: String, options: CompareTextOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareText")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def compareTexts(actual: String, expected: String, options: CompareTextsOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareTexts")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def compareTexts(actual: String, expected: js.Array[String], options: CompareTextsOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareTexts")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def compareTexts(actual: js.Array[String], expected: String, options: CompareTextsOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareTexts")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def compareTexts(actual: js.Array[String], expected: js.Array[String], options: CompareTextsOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareTexts")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def counter(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("counter")().asInstanceOf[Double]
  
  inline def dec2bin(number: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("dec2bin")(number.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def dec2bin(number: Double, arrayLength: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("dec2bin")(number.asInstanceOf[js.Any], arrayLength.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @JSImport("misc-utils-of-mine-generic", "decimalDigitNormalizer")
  @js.native
  val decimalDigitNormalizer: Normalizer = js.native
  
  inline def decryptLetters(config: EncryptLettersConfig): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decryptLetters")(config.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def dedup[T](a: js.Array[T], predicate: js.Function2[/* a */ T, /* b */ T, Boolean]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("dedup")(a.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def detectNewline(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("detectNewline")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def detectNewline(s: String, `def`: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("detectNewline")(s.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def dirname(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dirname")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  object easing {
    
    @JSImport("misc-utils-of-mine-generic", "easing")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * “bow shooting”. First we “pull the bowstring”, and then “shoot”.
      * @param x “elasticity coefficient”. The distance of “bowstring pulling” is defined by it. Default value 1.5.
      */
    inline def back(): js.Function1[/* timeFraction */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("back")().asInstanceOf[js.Function1[/* timeFraction */ Double, Double]]
    inline def back(x: Double): js.Function1[/* timeFraction */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("back")(x.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* timeFraction */ Double, Double]]
    
    inline def bounceEaseInOut(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("bounceEaseInOut")().asInstanceOf[Timing]
    
    /**
      * Imagine we are dropping a ball. It falls down, then bounces back a few times and stops. The bounce function does the same, but in the reverse order: “bouncing” starts immediately.
      * */
    inline def bounceEasyOut(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("bounceEasyOut")().asInstanceOf[Timing]
    
    inline def easeInBounce(): TimingObject = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInBounce")().asInstanceOf[TimingObject]
    
    inline def easeInCubic(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInCubic")().asInstanceOf[Timing]
    
    inline def easeInElastic(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInElastic")().asInstanceOf[Timing]
    
    inline def easeInExpo(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInExpo")().asInstanceOf[Timing]
    
    inline def easeInOutBack(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOutBack")().asInstanceOf[Timing]
    
    inline def easeInOutBounce(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOutBounce")().asInstanceOf[Timing]
    
    inline def easeInOutCubic(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOutCubic")().asInstanceOf[Timing]
    
    inline def easeInOutElastic(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOutElastic")().asInstanceOf[Timing]
    
    inline def easeInOutExpo(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOutExpo")().asInstanceOf[Timing]
    
    inline def easeInOutQuad(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOutQuad")().asInstanceOf[Timing]
    
    @JSImport("misc-utils-of-mine-generic", "easing.easeInOutQuart")
    @js.native
    val easeInOutQuart: Timing = js.native
    
    inline def easeInOutQuint(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOutQuint")().asInstanceOf[Timing]
    
    inline def easeInQuad(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInQuad")().asInstanceOf[Timing]
    
    @JSImport("misc-utils-of-mine-generic", "easing.easeInQuart")
    @js.native
    val easeInQuart: Timing = js.native
    
    @JSImport("misc-utils-of-mine-generic", "easing.easeInQuint")
    @js.native
    val easeInQuint: Timing = js.native
    
    inline def easeInSine(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInSine")().asInstanceOf[Timing]
    
    inline def easeOutBack(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOutBack")().asInstanceOf[Timing]
    
    inline def easeOutBounce(): TimingObject = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOutBounce")().asInstanceOf[TimingObject]
    
    inline def easeOutCubic(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOutCubic")().asInstanceOf[Timing]
    
    inline def easeOutElastic(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOutElastic")().asInstanceOf[Timing]
    
    inline def easeOutQuad(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOutQuad")().asInstanceOf[Timing]
    
    inline def easeOutQuint(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOutQuint")().asInstanceOf[Timing]
    
    /**
      * @param x “initial range”
      */
    inline def elastic(): js.Function1[/* timeFraction */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("elastic")().asInstanceOf[js.Function1[/* timeFraction */ Double, Double]]
    inline def elastic(x: Double): js.Function1[/* timeFraction */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("elastic")(x.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* timeFraction */ Double, Double]]
    
    /**
      * parabolic curve
      */
    inline def quad(timeFraction: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("quad")(timeFraction.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  inline def encryptLetters(config: EncryptLettersConfig): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encryptLetters")(config.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def enumKeys(anEnum: Any): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumKeys")(anEnum.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def enumNoValueKeys(anEnum: Any): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumNoValueKeys")(anEnum.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def enumValueFromString[T](key: String, anEnum: Any): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumValueFromString")(key.asInstanceOf[js.Any], anEnum.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def escapeHtmlAttribute(code: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeHtmlAttribute")(code.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def escapeSQLValue(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeSQLValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def evaluate[T](s: String, defaultValue: Unit): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluate")(s.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def fill[T](a: js.Array[T], length: Double, fillWith: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(a.asInstanceOf[js.Any], length.asInstanceOf[js.Any], fillWith.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def fill[T](a: js.Array[T], length: Double, fillWith: T, before: Boolean): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(a.asInstanceOf[js.Any], length.asInstanceOf[js.Any], fillWith.asInstanceOf[js.Any], before.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def filterAncestors[T /* <: Node */](n: T, p: NodeSimplePredicate[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterAncestors")(n.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def filterAncestors[T /* <: Node */](n: T, p: NodeSimplePredicate[T], o: VisitorOptions): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterAncestors")(n.asInstanceOf[js.Any], p.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def filterChildren[T /* <: Node */](n: Node, p: NodePredicate[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterChildren")(n.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def filterDescendants[T /* <: Node */](n: T, p: NodePredicate[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterDescendants")(n.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def filterDescendants[T /* <: Node */](n: T, p: NodePredicate[T], o: VisitorOptions): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterDescendants")(n.asInstanceOf[js.Any], p.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def findAncestor[T /* <: Node */](n: T, p: NodePredicate[T]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAncestor")(n.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def findAncestor[T /* <: Node */](n: T, p: NodePredicate[T], o: js.Object): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAncestor")(n.asInstanceOf[js.Any], p.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def findChildren[T /* <: Node */](n: T, p: NodePredicate[T]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("findChildren")(n.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def findDescendant[T /* <: Node */](n: T, p: NodePredicate[T]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("findDescendant")(n.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def findDescendant[T /* <: Node */](n: T, p: NodePredicate[T], o: VisitorOptions): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("findDescendant")(n.asInstanceOf[js.Any], p.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def findJson(
    o: JSONValue,
    p: js.Function2[/* o */ JSONValue, /* nameOrIndex */ js.UndefOr[String | Double], Boolean]
  ): js.UndefOr[Value] = (^.asInstanceOf[js.Dynamic].applyDynamic("findJson")(o.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Value]]
  inline def findJson(
    o: JSONValue,
    p: js.Function2[/* o */ JSONValue, /* nameOrIndex */ js.UndefOr[String | Double], Boolean],
    _name: String
  ): js.UndefOr[Value] = (^.asInstanceOf[js.Dynamic].applyDynamic("findJson")(o.asInstanceOf[js.Any], p.asInstanceOf[js.Any], _name.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Value]]
  inline def findJson(
    o: JSONValue,
    p: js.Function2[/* o */ JSONValue, /* nameOrIndex */ js.UndefOr[String | Double], Boolean],
    _name: Double
  ): js.UndefOr[Value] = (^.asInstanceOf[js.Dynamic].applyDynamic("findJson")(o.asInstanceOf[js.Any], p.asInstanceOf[js.Any], _name.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Value]]
  
  inline def findRootElement[T /* <: Node */](n: T): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("findRootElement")(n.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
  inline def flat[T](arr: js.Array[js.Array[T]]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("flat")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def flatDeep(arr: js.Array[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatDeep")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def flatInstallArrayPrototype(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flatInstallArrayPrototype")().asInstanceOf[Unit]
  
  inline def flatReadOnly[T](arr: js.Array[js.Array[T]]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatReadOnly")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  @JSImport("misc-utils-of-mine-generic", "float")
  @js.native
  val float: js.Function2[/* a */ Double, /* b */ Double, Double] = js.native
  
  @JSImport("misc-utils-of-mine-generic", "floats")
  @js.native
  val floats: js.Function3[/* l */ Double, /* min */ Double, /* max */ Double, js.Array[Double]] = js.native
  
  inline def formatDate(date: js.Date, format: `YYYY-MM-DD` | MMSlashDDSlashYYYY): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatDateTimeForSql(date: js.Date): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDateTimeForSql")(date.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def formatDateTime_YYYYMMDDTHHMMZ(date: js.Date, format: `YYYY-MM-DDTHHColonMMZ`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDateTime")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getAncestors[T /* <: Node */](): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAncestors")().asInstanceOf[js.Array[T]]
  inline def getAncestors[T /* <: Node */](node: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAncestors")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def getBoxChar(s: BorderStyle, si: BorderSide): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoxChar")(s.asInstanceOf[js.Any], si.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getChildIndex(node: Node): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getChildIndex")(node.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getChildIndex(node: Node, children: js.Array[Node]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildIndex")(node.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getDistanceToAncestor[T /* <: Node */](): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDistanceToAncestor")().asInstanceOf[Double]
  inline def getDistanceToAncestor[T /* <: Node */](node: T): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDistanceToAncestor")(node.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getDistanceToAncestor[T /* <: Node */](node: T, ancestor: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDistanceToAncestor")(node.asInstanceOf[js.Any], ancestor.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getDistanceToAncestor[T /* <: Node */](node: Unit, ancestor: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDistanceToAncestor")(node.asInstanceOf[js.Any], ancestor.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getEnumKey(anEnum: Any, value: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getEnumKey")(anEnum.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getEnumKeyAndValue(e: Any): js.Array[Key] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnumKeyAndValue")(e.asInstanceOf[js.Any]).asInstanceOf[js.Array[Key]]
  
  inline def getExtensionsForMimeType(mimeType: String): js.UndefOr[_empty | js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtensionsForMimeType")(mimeType.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[_empty | js.Array[String]]]
  
  inline def getFileExtension(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileExtension")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getFileNameFromUrl(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileNameFromUrl")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getGlobal(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobal")().asInstanceOf[Any]
  
  inline def getMimeTypeForExtension(`extension`: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMimeTypeForExtension")(`extension`.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def getNextSibling(node: Node): js.UndefOr[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextSibling")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Node]]
  
  inline def getObjectProperty[T](`object`: Any, path: String): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getObjectProperty")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def getObjectProperty[T](`object`: Any, path: String, defaultValue: T): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getObjectProperty")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def getObjectProperty[T](`object`: Any, path: js.Array[String | Double]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getObjectProperty")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def getObjectProperty[T](`object`: Any, path: js.Array[String | Double], defaultValue: T): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getObjectProperty")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def getObjectPropertyPaths(`object`: Any): js.Array[js.Array[String | Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getObjectPropertyPaths")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[String | Double]]]
  inline def getObjectPropertyPaths(`object`: Any, options: IgnoreArrayElements): js.Array[js.Array[String | Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getObjectPropertyPaths")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[String | Double]]]
  
  inline def getParametersFromUrl(url: String): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getParametersFromUrl")(url.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[String]]
  inline def getParametersFromUrl(url: String, options: ParseBoolean): StringDictionary[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getParametersFromUrl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[String]]
  
  inline def getPosition(string: String, subString: String, n: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getPosition")(string.asInstanceOf[js.Any], subString.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getPreviousMatchingPos(text: String, pos: Double, predicate: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousMatchingPos")(text.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getPreviousMatchingPos(text: String, pos: Double, predicate: js.Function1[/* char */ String, Boolean]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousMatchingPos")(text.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getPreviousSibling(node: Node): js.UndefOr[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousSibling")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Node]]
  
  inline def getRelativePath(source: String, target: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelativePath")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getSiblings(node: Node): js.Array[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSiblings")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Node]]
  inline def getSiblings(node: Node, getChildrenMode: Boolean): js.Array[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSiblings")(node.asInstanceOf[js.Any], getChildrenMode.asInstanceOf[js.Any])).asInstanceOf[js.Array[Node]]
  
  inline def getType(`type`: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getType")(`type`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hashCode_(s: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hashCode")(s.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def htmlElement(config: HtmlElementConfig): String = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlElement")(config.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def inBrowser(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("inBrowser")().asInstanceOf[Boolean]
  
  @JSImport("misc-utils-of-mine-generic", "inDOM")
  @js.native
  val inDOM: js.Function0[Boolean] = js.native
  
  @JSImport("misc-utils-of-mine-generic", "inNode")
  @js.native
  val inNode: js.Function0[Boolean] = js.native
  
  inline def indent(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("indent")().asInstanceOf[String]
  inline def indent(i: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("indent")(i.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def indent(i: Double, tabSize: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("indent")(i.asInstanceOf[js.Any], tabSize.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def indent(i: Unit, tabSize: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("indent")(i.asInstanceOf[js.Any], tabSize.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def installArrayPrototypeFind(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("installArrayPrototypeFind")().asInstanceOf[Unit]
  inline def installArrayPrototypeFind(force: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("installArrayPrototypeFind")(force.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("misc-utils-of-mine-generic", "int")
  @js.native
  val int: js.Function2[/* a */ Double, /* b */ Double, Double] = js.native
  
  inline def intBetween(n: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("intBetween")(n.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("misc-utils-of-mine-generic", "ints")
  @js.native
  val ints: js.Function3[/* l */ Double, /* min */ Double, /* max */ Double, js.Array[Double]] = js.native
  
  inline def isAbsoluteUrl(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAbsoluteUrl")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isArray(arg: Any): /* is std.Array<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<any> */ Boolean]
  
  inline def isBoolean(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("misc-utils-of-mine-generic", "isBrowser")
  @js.native
  val isBrowser: js.Function0[Boolean] = js.native
  
  inline def isClassConstructorFunction(a: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isClassConstructorFunction")(a.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("misc-utils-of-mine-generic", "isDOM")
  @js.native
  val isDOM: js.Function0[Boolean] = js.native
  
  inline def isGenerator(obj: Any): /* is std.Generator<unknown, any, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGenerator")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.Generator<unknown, any, unknown> */ Boolean]
  
  inline def isGeneratorFunction(fn: Any): /* is std.GeneratorFunction */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGeneratorFunction")(fn.asInstanceOf[js.Any]).asInstanceOf[/* is std.GeneratorFunction */ Boolean]
  
  inline def isJSDOM(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDOM")().asInstanceOf[Boolean]
  
  inline def isJSONObject(o: Any): /* is misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/json.JSONObject */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSONObject")(o.asInstanceOf[js.Any]).asInstanceOf[/* is misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/json.JSONObject */ Boolean]
  
  inline def isNode(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNode")().asInstanceOf[Boolean]
  
  inline def isObject(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPrime(num: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrime")(num.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isString(a: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(a.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isWebWorker(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWebWorker")().asInstanceOf[Boolean]
  
  inline def mapChildren[N /* <: Node */, T](n: N, v: js.Function1[/* c */ N, T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapChildren")(n.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def mapDescendants[T /* <: Node */, V](n: T, p: js.Function1[/* p */ T, V]): js.Array[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapDescendants")(n.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Array[V]]
  inline def mapDescendants[T /* <: Node */, V](n: T, p: js.Function1[/* p */ T, V], o: VisitorOptions): js.Array[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapDescendants")(n.asInstanceOf[js.Any], p.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[js.Array[V]]
  
  inline def mapToArraySQLConvert(sql: String, params: MapSqlParams): Params = (^.asInstanceOf[js.Dynamic].applyDynamic("mapToArraySQLConvert")(sql.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Params]
  
  inline def median(arr: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("median")(arr.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def merge(clone_ : Boolean, recursive: Boolean, argv: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")((scala.List(clone_.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).`++`(argv.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  
  inline def mergeRecursive(base: Any, extend: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeRecursive")(base.asInstanceOf[js.Any], extend.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def nextTime(config: NextTimeConfig): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("nextTime")(config.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def notFalsy[T](n: T): /* is misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/type.NotFalsy<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("notFalsy")(n.asInstanceOf[js.Any]).asInstanceOf[/* is misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/type.NotFalsy<T> */ Boolean]
  
  inline def notSame[T](t: T, i: Double, a: js.Array[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("notSame")(t.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def notSameNotFalsy[T](t: T, i: Double, a: js.Array[T]): /* is misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/type.NotFalsy<T> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("notSameNotFalsy")(t.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[/* is misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/type.NotFalsy<T> */ Boolean]
  
  inline def notUndefined[T](n: T): /* is misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/type.NotUndefined<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("notUndefined")(n.asInstanceOf[js.Any]).asInstanceOf[/* is misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/type.NotUndefined<T> */ Boolean]
  
  inline def objectFilter[O /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ k in keyof O ]: O[keyof O]} */ js.Any */](
    o: O,
    p: js.Function2[
      /* keyof O */ /* k */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: O[keyof O] */ /* v */ js.Any, 
      Boolean
    ]
  ): Partial[O] = (^.asInstanceOf[js.Dynamic].applyDynamic("objectFilter")(o.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Partial[O]]
  
  inline def objectKeys[Field /* <: EmptyObject */](o: Field): js.Array[ObjectStringKeyUnion[Field]] = ^.asInstanceOf[js.Dynamic].applyDynamic("objectKeys")(o.asInstanceOf[js.Any]).asInstanceOf[js.Array[ObjectStringKeyUnion[Field]]]
  
  inline def objectMap[O /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ k in keyof O ]: O[keyof O]} */ js.Any */, T](
    o: O,
    p: js.Function2[
      /* keyof O */ /* k */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: O[keyof O] */ /* v */ js.Any, 
      T
    ]
  ): /* import warning: importer.ImportType#apply Failed type conversion: {[ k in keyof O ]: T} */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("objectMap")(o.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: {[ k in keyof O ]: T} */ js.Any]
  
  inline def objectMapValues[O /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ k in keyof O ]: O[keyof O]} */ js.Any */, T](
    o: O,
    p: js.Function2[
      /* keyof O */ /* k */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: O[keyof O] */ /* v */ js.Any, 
      T
    ]
  ): /* import warning: importer.ImportType#apply Failed type conversion: {[ k in keyof O ]: T} */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("objectMapValues")(o.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: {[ k in keyof O ]: T} */ js.Any]
  
  inline def objectOrderKeysAlphabetically[T](o: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("objectOrderKeysAlphabetically")(o.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def objectToArray[O /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ k in keyof O ]: O[keyof O]} */ js.Any */](o: O): js.Array[KeyValue[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("objectToArray")(o.asInstanceOf[js.Any]).asInstanceOf[js.Array[KeyValue[O]]]
  
  inline def parseGitIgnore(content: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseGitIgnore")(content.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def parseGitIgnore(content: String, options: Cwd): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseGitIgnore")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def parseJSON[K](s: String): js.UndefOr[K] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseJSON")(s.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[K]]
  inline def parseJSON[K](s: String, defaultValue: K): js.UndefOr[K] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseJSON")(s.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[K]]
  
  inline def parseUrl(url: String): Domain | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUrl")(url.asInstanceOf[js.Any]).asInstanceOf[Domain | Null]
  inline def parseUrl(url: String, options: ParseParams): Domain | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseUrl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Domain | Null]
  
  inline def pathJoin(parts: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pathJoin")(parts.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  inline def pointInside(p: IPoint, viewport: IRect): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pointInside")(p.asInstanceOf[js.Any], viewport.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def printMs(ms: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("printMs")(ms.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def printMs(ms: Double, config: Minutes): String = (^.asInstanceOf[js.Dynamic].applyDynamic("printMs")(ms.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def printSQLMapQuery(sql: String, mapParams: MapSqlParams): String = (^.asInstanceOf[js.Dynamic].applyDynamic("printSQLMapQuery")(sql.asInstanceOf[js.Any], mapParams.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def printSQLQuery(sql: String, params: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("printSQLQuery")(sql.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def quote(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("quote")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def quote(s: String, quote: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("quote")(s.asInstanceOf[js.Any], quote.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def randomCssColor(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomCssColor")().asInstanceOf[String]
  
  inline def randomFloatBetween(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFloatBetween")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def randomFloatsBetween(l: Double, min: Double, max: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFloatsBetween")(l.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def randomIntBetween(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("randomIntBetween")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def randomIntsBetween(l: Double, min: Double, max: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomIntsBetween")(l.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def randomItem[T](a: js.Array[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("randomItem")(a.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def randomItems[T](a: js.Array[T], amount: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomItems")(a.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def recursive(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("recursive")().asInstanceOf[Any]
  inline def recursive(clone: Boolean): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("recursive")(clone.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def removeEmptyLines(c: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeEmptyLines")(c.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def removeEmptyLines(c: String, newLine: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEmptyLines")(c.asInstanceOf[js.Any], newLine.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def removeWhites(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeWhites")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def removeWhites(s: String, replaceWith: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("removeWhites")(s.asInstanceOf[js.Any], replaceWith.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def repeat(n: Double, s: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(n.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def rgb2Hex(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb2Hex")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def seq(): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("seq")().asInstanceOf[js.Array[Double]]
  inline def seq(start: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("seq")(start.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def seq(start: Double, step: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("seq")(start.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def seq(start: Double, step: Double, max: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("seq")(start.asInstanceOf[js.Any], step.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def seq(start: Double, step: Unit, max: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("seq")(start.asInstanceOf[js.Any], step.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def seq(start: Unit, step: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("seq")(start.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def seq(start: Unit, step: Double, max: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("seq")(start.asInstanceOf[js.Any], step.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def seq(start: Unit, step: Unit, max: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("seq")(start.asInstanceOf[js.Any], step.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def serial[T](p: js.Array[js.Function0[js.Promise[T]]]): js.Promise[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("serial")(p.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[T]]]
  
  inline def setObjectProperty(`object`: Any, path: String, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setObjectProperty")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def setObjectProperty(`object`: Any, path: js.Array[String | Double], value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setObjectProperty")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def shorter(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("shorter")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def shorter(text: String, much: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("shorter")(text.asInstanceOf[js.Any], much.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def shuffle[T](a: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def slash(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("slash")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def sleep(ms: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("sleep")(ms.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def stringToObject(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToObject")().asInstanceOf[Any]
  inline def stringToObject(s: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToObject")(s.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def stringToObject(s: String, propSep: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToObject")(s.asInstanceOf[js.Any], propSep.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def stringToObject(s: String, propSep: String, nameValueSep: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToObject")(s.asInstanceOf[js.Any], propSep.asInstanceOf[js.Any], nameValueSep.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def stringToObject(s: String, propSep: Unit, nameValueSep: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToObject")(s.asInstanceOf[js.Any], propSep.asInstanceOf[js.Any], nameValueSep.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def stringToObject(s: Unit, propSep: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToObject")(s.asInstanceOf[js.Any], propSep.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def stringToObject(s: Unit, propSep: String, nameValueSep: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToObject")(s.asInstanceOf[js.Any], propSep.asInstanceOf[js.Any], nameValueSep.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def stringToObject(s: Unit, propSep: Unit, nameValueSep: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToObject")(s.asInstanceOf[js.Any], propSep.asInstanceOf[js.Any], nameValueSep.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def stringifyJSON[K](s: K): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyJSON")(s.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def stringifyJSON[K](s: K, defaultValue: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyJSON")(s.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def strip(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("strip")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def styleObjectToCss(o: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("styleObjectToCss")(o.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def styleObjectToCss(o: js.Object, propertiesSeparator: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("styleObjectToCss")(o.asInstanceOf[js.Any], propertiesSeparator.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def stylePropertyNameToCssSyntax(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stylePropertyNameToCssSyntax")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def template(str: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("template")(str.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def template(str: String, data: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("template")(str.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def throttle[F /* <: js.Function1[/* repeated */ Any, Any] */](func: F, wait: Double): js.ThisFunction0[/* this */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[js.ThisFunction0[/* this */ Any, Any]]
  inline def throttle[F /* <: js.Function1[/* repeated */ Any, Any] */](func: F, wait: Double, options: Leading): js.ThisFunction0[/* this */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.ThisFunction0[/* this */ Any, Any]]
  
  inline def timeHash(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("timeHash")().asInstanceOf[String]
  inline def timeHash(digits: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("timeHash")(digits.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toObject[T](array: js.Array[T], groupByKey: String): StringDictionary[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(array.asInstanceOf[js.Any], groupByKey.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[T]]
  
  inline def trimRightLines(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trimRightLines")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def trimRightLines(s: String, newLine: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("trimRightLines")(s.asInstanceOf[js.Any], newLine.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def tryTo[R, D](f: js.Function1[/* repeated */ Any, R]): js.UndefOr[R | D] = ^.asInstanceOf[js.Dynamic].applyDynamic("tryTo")(f.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[R | D]]
  inline def tryTo[R, D](f: js.Function1[/* repeated */ Any, R], `def`: D): js.UndefOr[R | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("tryTo")(f.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[R | D]]
  
  inline def typeOf(input: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("typeOf")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def unEscapeHtmlAttribute(code: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unEscapeHtmlAttribute")(code.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def unionEquals[T](a: js.Array[T], b: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("unionEquals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def unionEquals[T](a: js.Array[T], b: js.Array[T], predicate: js.Function2[/* a */ T, /* b */ T, Boolean]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("unionEquals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def unionEquals[T](
    a: js.Array[T],
    b: js.Array[T],
    predicate: js.Function2[/* a */ T, /* b */ T, Boolean],
    output: js.Array[T]
  ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("unionEquals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def unionEquals[T](a: js.Array[T], b: js.Array[T], predicate: Unit, output: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("unionEquals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def unique(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unique")().asInstanceOf[String]
  inline def unique(prefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unique")(prefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def unquote(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unquote")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def visitAncestors[T /* <: Node */](n: T, v: Visitor[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("visitAncestors")(n.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def visitAncestors[T /* <: Node */](n: T, v: Visitor[T], o: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("visitAncestors")(n.asInstanceOf[js.Any], v.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def visitChildren[T /* <: Node */](n: T, v: js.Function1[/* c */ T, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("visitChildren")(n.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def visitDescendants[T /* <: Node */](n: T, v: Visitor[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("visitDescendants")(n.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def visitDescendants[T /* <: Node */](n: T, v: Visitor[T], o: Unit, inRecursion: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("visitDescendants")(n.asInstanceOf[js.Any], v.asInstanceOf[js.Any], o.asInstanceOf[js.Any], inRecursion.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def visitDescendants[T /* <: Node */](n: T, v: Visitor[T], o: VisitorOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("visitDescendants")(n.asInstanceOf[js.Any], v.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def visitDescendants[T /* <: Node */](n: T, v: Visitor[T], o: VisitorOptions, inRecursion: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("visitDescendants")(n.asInstanceOf[js.Any], v.asInstanceOf[js.Any], o.asInstanceOf[js.Any], inRecursion.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def visitJson(
    o: JSONValue,
    v: js.Function2[/* o */ JSONValue, /* nameOrIndex */ js.UndefOr[String | Double], Boolean]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("visitJson")(o.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def visitJson(
    o: JSONValue,
    v: js.Function2[/* o */ JSONValue, /* nameOrIndex */ js.UndefOr[String | Double], Boolean],
    _name: String
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("visitJson")(o.asInstanceOf[js.Any], v.asInstanceOf[js.Any], _name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def visitJson(
    o: JSONValue,
    v: js.Function2[/* o */ JSONValue, /* nameOrIndex */ js.UndefOr[String | Double], Boolean],
    _name: Double
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("visitJson")(o.asInstanceOf[js.Any], v.asInstanceOf[js.Any], _name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def waitForPredicate[T](p: js.Function1[/* repeated */ Any, js.UndefOr[T]]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForPredicate")(p.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def waitForPredicate[T](p: js.Function1[/* repeated */ Any, js.UndefOr[T]], options: String): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForPredicate")(p.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def waitForPredicate[T](p: js.Function1[/* repeated */ Any, js.UndefOr[T]], options: WaitForPredicateOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForPredicate")(p.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  @JSImport("misc-utils-of-mine-generic", "wait")
  @js.native
  val wait_ : js.Function1[/* ms */ Double, js.Promise[Unit]] = js.native
  
  inline def withFinalSlash(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("withFinalSlash")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def withTime[T](label: String, fn: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("withTime")(label.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def withoutExtension(f: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("withoutExtension")(f.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def wordWrap(s: String, w: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("wordWrap")(s.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def wordWrap(s: String, w: Double, newLine: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("wordWrap")(s.asInstanceOf[js.Any], w.asInstanceOf[js.Any], newLine.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def wrapInHtml(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapInHtml")(s.asInstanceOf[js.Any]).asInstanceOf[String]
}
