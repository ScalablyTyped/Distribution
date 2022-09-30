package typings.postcssMergeLonghand

import typings.std.FlatArray
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trblMod {
  
  @JSImport("postcss-merge-longhand/types/lib/trbl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def at(index: Double): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("at")(index.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def concat(items: (js.Array[String] | String)*): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Array[String]]
  
  inline def copyWithin(target: Double, start: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyWithin")(target.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def copyWithin(target: Double, start: Double, end: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyWithin")(target.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def entries(): IterableIterator[js.Tuple2[Double, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")().asInstanceOf[IterableIterator[js.Tuple2[Double, String]]]
  
  inline def every(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def every(
    predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Any],
    thisArg: Any
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def every_S[S /* <: String */](
    predicate: js.Function3[
      /* value */ String, 
      /* index */ Double, 
      /* array */ js.Array[String], 
      /* is S */ Boolean
    ]
  ): /* is std.Array<S> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<S> */ Boolean]
  inline def every_S[S /* <: String */](
    predicate: js.Function3[
      /* value */ String, 
      /* index */ Double, 
      /* array */ js.Array[String], 
      /* is S */ Boolean
    ],
    thisArg: Any
  ): /* is std.Array<S> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[/* is std.Array<S> */ Boolean]
  
  inline def fill(value: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def fill(value: String, start: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def fill(value: String, start: Double, end: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def fill(value: String, start: Unit, end: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def filter(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Any]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def filter(
    predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Any],
    thisArg: Any
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def filter_S_1[S_1 /* <: String */](
    predicate: js.Function3[
      /* value */ String, 
      /* index */ Double, 
      /* array */ js.Array[String], 
      /* is S_1 */ Boolean
    ]
  ): js.Array[S_1] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Array[S_1]]
  inline def filter_S_1[S_1 /* <: String */](
    predicate: js.Function3[
      /* value */ String, 
      /* index */ Double, 
      /* array */ js.Array[String], 
      /* is S_1 */ Boolean
    ],
    thisArg: Any
  ): js.Array[S_1] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[S_1]]
  
  inline def find(predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], Any]): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def find(
    predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], Any],
    thisArg: Any
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def find[S_2 /* <: String */](
    predicate: js.ThisFunction3[
      /* this */ Unit, 
      /* value */ String, 
      /* index */ Double, 
      /* obj */ js.Array[String], 
      /* is S_2 */ Boolean
    ]
  ): js.UndefOr[S_2] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[S_2]]
  inline def find[S_2 /* <: String */](
    predicate: js.ThisFunction3[
      /* this */ Unit, 
      /* value */ String, 
      /* index */ Double, 
      /* obj */ js.Array[String], 
      /* is S_2 */ Boolean
    ],
    thisArg: Any
  ): js.UndefOr[S_2] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[S_2]]
  
  inline def findIndex(predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def findIndex(
    predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], Any],
    thisArg: Any
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flat")().asInstanceOf[js.Array[FlatArray[A, D]]]
  inline def flat[A, D /* <: Double */](depth: D): js.Array[FlatArray[A, D]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flat")(depth.asInstanceOf[js.Any]).asInstanceOf[js.Array[FlatArray[A, D]]]
  
  inline def flatMap[U_3, This](
    callback: js.ThisFunction3[
      /* this */ This, 
      /* value */ String, 
      /* index */ Double, 
      /* array */ js.Array[String], 
      U_3 | js.Array[U_3]
    ]
  ): js.Array[U_3] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Array[U_3]]
  inline def flatMap[U_3, This](
    callback: js.ThisFunction3[
      /* this */ This, 
      /* value */ String, 
      /* index */ Double, 
      /* array */ js.Array[String], 
      U_3 | js.Array[U_3]
    ],
    thisArg: This
  ): js.Array[U_3] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(callback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[U_3]]
  
  inline def forEach(
    callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def forEach(
    callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit],
    thisArg: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def includes(searchElement: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("includes")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def includes(searchElement: String, fromIndex: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def indexOf(searchElement: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def indexOf(searchElement: String, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def join(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")().asInstanceOf[String]
  inline def join(separator: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(separator.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def keys(): IterableIterator[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")().asInstanceOf[IterableIterator[Double]]
  
  inline def lastIndexOf(searchElement: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def lastIndexOf(searchElement: String, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("postcss-merge-longhand/types/lib/trbl", "length")
  @js.native
  def length: Double = js.native
  inline def length_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("length")(x.asInstanceOf[js.Any])
  
  inline def map[U](callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U]): js.Array[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[js.Array[U]]
  inline def map[U](
    callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U],
    thisArg: Any
  ): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
  
  inline def pop(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")().asInstanceOf[js.UndefOr[String]]
  
  inline def push(items: String*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Double]
  
  inline def reduce(
    callbackfn: js.Function4[
      /* previousValue */ String, 
      /* currentValue */ String, 
      /* currentIndex */ Double, 
      /* array */ js.Array[String], 
      String
    ]
  ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def reduce(
    callbackfn: js.Function4[
      /* previousValue */ String, 
      /* currentValue */ String, 
      /* currentIndex */ Double, 
      /* array */ js.Array[String], 
      String
    ],
    initialValue: String
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def reduce[U_1](
    callbackfn: js.Function4[
      /* previousValue */ U_1, 
      /* currentValue */ String, 
      /* currentIndex */ Double, 
      /* array */ js.Array[String], 
      U_1
    ],
    initialValue: U_1
  ): U_1 = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[U_1]
  
  inline def reduceRight(
    callbackfn: js.Function4[
      /* previousValue */ String, 
      /* currentValue */ String, 
      /* currentIndex */ Double, 
      /* array */ js.Array[String], 
      String
    ]
  ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def reduceRight(
    callbackfn: js.Function4[
      /* previousValue */ String, 
      /* currentValue */ String, 
      /* currentIndex */ Double, 
      /* array */ js.Array[String], 
      String
    ],
    initialValue: String
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def reduceRight[U_2](
    callbackfn: js.Function4[
      /* previousValue */ U_2, 
      /* currentValue */ String, 
      /* currentIndex */ Double, 
      /* array */ js.Array[String], 
      U_2
    ],
    initialValue: U_2
  ): U_2 = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[U_2]
  
  inline def reverse(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")().asInstanceOf[js.Array[String]]
  
  inline def shift(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")().asInstanceOf[js.UndefOr[String]]
  
  inline def slice(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")().asInstanceOf[js.Array[String]]
  inline def slice(start: Double): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def slice(start: Double, end: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def slice(start: Unit, end: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def some(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(predicate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def some(
    predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Any],
    thisArg: Any
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def sort(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")().asInstanceOf[js.Array[String]]
  inline def sort(compareFn: js.Function2[/* a */ String, /* b */ String, Double]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(compareFn.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def splice(start: Double): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def splice(start: Double, deleteCount: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def splice(start: Double, deleteCount: Double, items: String*): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")((scala.List(start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any])).`++`(items.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Array[String]]
  
  inline def toLocaleString_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLocaleString")().asInstanceOf[String]
  
  inline def toString_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[String]
  
  inline def unshift(items: String*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unshift")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Double]
  
  inline def values(): IterableIterator[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")().asInstanceOf[IterableIterator[String]]
}
