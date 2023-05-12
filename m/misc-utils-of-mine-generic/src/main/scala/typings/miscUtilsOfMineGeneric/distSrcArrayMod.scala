package typings.miscUtilsOfMineGeneric

import org.scalablytyped.runtime.StringDictionary
import typings.miscUtilsOfMineGeneric.anon.Key
import typings.miscUtilsOfMineGeneric.distSrcArrayPrototypeFindMod.FindPredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcArrayMod {
  
  @JSImport("misc-utils-of-mine-generic/dist/src/array", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  inline def buildEnumMap(anEnum: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("buildEnumMap")(anEnum.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def dedup[T](a: js.Array[T], predicate: js.Function2[/* a */ T, /* b */ T, Boolean]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("dedup")(a.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def enumKeys(anEnum: Any): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumKeys")(anEnum.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def enumNoValueKeys(anEnum: Any): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumNoValueKeys")(anEnum.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def enumValueFromString[T](key: String, anEnum: Any): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumValueFromString")(key.asInstanceOf[js.Any], anEnum.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def fill[T](a: js.Array[T], length: Double, fillWith: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(a.asInstanceOf[js.Any], length.asInstanceOf[js.Any], fillWith.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def fill[T](a: js.Array[T], length: Double, fillWith: T, before: Boolean): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(a.asInstanceOf[js.Any], length.asInstanceOf[js.Any], fillWith.asInstanceOf[js.Any], before.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def flat[T](arr: js.Array[js.Array[T]]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("flat")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def flatDeep(arr: js.Array[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatDeep")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def flatInstallArrayPrototype(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flatInstallArrayPrototype")().asInstanceOf[Unit]
  
  inline def flatReadOnly[T](arr: js.Array[js.Array[T]]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatReadOnly")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def getEnumKey(anEnum: Any, value: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getEnumKey")(anEnum.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getEnumKeyAndValue(e: Any): js.Array[Key] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnumKeyAndValue")(e.asInstanceOf[js.Any]).asInstanceOf[js.Array[Key]]
  
  inline def installArrayPrototypeFind(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("installArrayPrototypeFind")().asInstanceOf[Unit]
  inline def installArrayPrototypeFind(force: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("installArrayPrototypeFind")(force.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def notFalsy[T](n: T): /* is misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/type.NotFalsy<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("notFalsy")(n.asInstanceOf[js.Any]).asInstanceOf[/* is misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/type.NotFalsy<T> */ Boolean]
  
  inline def notSame[T](t: T, i: Double, a: js.Array[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("notSame")(t.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def notSameNotFalsy[T](t: T, i: Double, a: js.Array[T]): /* is misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/type.NotFalsy<T> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("notSameNotFalsy")(t.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[/* is misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/type.NotFalsy<T> */ Boolean]
  
  inline def notUndefined[T](n: T): /* is misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/type.NotUndefined<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("notUndefined")(n.asInstanceOf[js.Any]).asInstanceOf[/* is misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/type.NotUndefined<T> */ Boolean]
  
  inline def randomItems[T](a: js.Array[T], amount: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomItems")(a.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def seq(): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("seq")().asInstanceOf[js.Array[Double]]
  inline def seq(start: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("seq")(start.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def seq(start: Double, step: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("seq")(start.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def seq(start: Double, step: Double, max: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("seq")(start.asInstanceOf[js.Any], step.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def seq(start: Double, step: Unit, max: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("seq")(start.asInstanceOf[js.Any], step.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def seq(start: Unit, step: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("seq")(start.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def seq(start: Unit, step: Double, max: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("seq")(start.asInstanceOf[js.Any], step.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def seq(start: Unit, step: Unit, max: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("seq")(start.asInstanceOf[js.Any], step.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def shuffle[T](a: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def toObject[T](array: js.Array[T], groupByKey: String): StringDictionary[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(array.asInstanceOf[js.Any], groupByKey.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[T]]
  
  inline def unionEquals[T](a: js.Array[T], b: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("unionEquals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def unionEquals[T](a: js.Array[T], b: js.Array[T], predicate: js.Function2[/* a */ T, /* b */ T, Boolean]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("unionEquals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def unionEquals[T](
    a: js.Array[T],
    b: js.Array[T],
    predicate: js.Function2[/* a */ T, /* b */ T, Boolean],
    output: js.Array[T]
  ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("unionEquals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def unionEquals[T](a: js.Array[T], b: js.Array[T], predicate: Unit, output: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("unionEquals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
