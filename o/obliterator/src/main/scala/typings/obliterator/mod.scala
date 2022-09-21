package typings.obliterator

import org.scalablytyped.runtime.Instantiable1
import typings.obliterator.everyMod.PredicateFunction
import typings.obliterator.foreachMod.ForEachTrait
import typings.obliterator.foreachMod.PlainObject
import typings.obliterator.iteratorMod.NextFunction
import typings.obliterator.iteratorMod.ObliteratorIterator
import typings.obliterator.iteratorMod.default
import typings.obliterator.mapMod.MapFunction
import typings.obliterator.typesMod.IntoInterator
import typings.obliterator.typesMod.Sequence
import typings.std.IterableIterator
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("obliterator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("obliterator", "Iterator")
  @js.native
  open class Iterator[V] protected () extends default[V] {
    // Constructor
    def this(next: NextFunction[V]) = this()
  }
  /* static members */
  object Iterator {
    
    @JSImport("obliterator", "Iterator")
    @js.native
    val ^ : js.Any = js.native
    
    inline def empty[T](): ObliteratorIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[ObliteratorIterator[T]]
    
    inline def fromSequence[T](sequence: Sequence[T]): ObliteratorIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSequence")(sequence.asInstanceOf[js.Any]).asInstanceOf[ObliteratorIterator[T]]
    
    inline def is(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    // Static methods
    inline def of[T](args: T*): ObliteratorIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ObliteratorIterator[T]]
  }
  
  inline def chain[T](iterables: IntoInterator[T]*): IterableIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(iterables.asInstanceOf[Seq[js.Any]]*).asInstanceOf[IterableIterator[T]]
  
  inline def combinations[T](array: js.Array[T], r: Double): IterableIterator[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combinations")(array.asInstanceOf[js.Any], r.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[js.Array[T]]]
  
  inline def consume[T](iterator: js.Iterator[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("consume")(iterator.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def consume[T](iterator: js.Iterator[T], steps: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("consume")(iterator.asInstanceOf[js.Any], steps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def every[T](target: IntoInterator[T], predicate: PredicateFunction[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(target.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def filter[T](target: IntoInterator[T], predicate: typings.obliterator.filterMod.PredicateFunction[T]): IterableIterator[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(target.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[T]]
  
  inline def find[T](target: IntoInterator[T], predicate: typings.obliterator.findMod.PredicateFunction[T]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(target.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def forEach[T](iterable: js.Iterable[T], callback: js.Function2[/* item */ T, /* index */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(iterable.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def forEach[T](iterable: js.Iterator[T], callback: js.Function2[/* item */ T, /* index */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(iterable.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def forEach[T](iterable: Sequence[T], callback: js.Function2[/* item */ T, /* index */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(iterable.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def forEach[T](`object`: PlainObject[T], callback: js.Function2[/* value */ T, /* key */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(`object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def forEach[K, V](iterable: ForEachTrait[K, V], callback: js.Function2[/* value */ V, /* key */ K, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(iterable.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def forEachWithNullKeys[T](iterable: js.Iterable[T], callback: js.Function2[/* item */ T, /* key */ Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachWithNullKeys")(iterable.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def forEachWithNullKeys[T](iterable: js.Iterator[T], callback: js.Function2[/* item */ T, /* key */ Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachWithNullKeys")(iterable.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def forEachWithNullKeys[T](iterable: Sequence[T], callback: js.Function2[/* item */ T, /* key */ Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachWithNullKeys")(iterable.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def forEachWithNullKeys[V](iterable: Set[V], callback: js.Function2[/* value */ V, /* key */ Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachWithNullKeys")(iterable.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def forEachWithNullKeys[T](
    `object`: typings.obliterator.foreachWithNullKeysMod.PlainObject[T],
    callback: js.Function2[/* value */ T, /* key */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachWithNullKeys")(`object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def forEachWithNullKeys[K, V](
    iterable: typings.obliterator.foreachWithNullKeysMod.ForEachTrait[K, V],
    callback: js.Function2[/* value */ V, /* key */ K, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachWithNullKeys")(iterable.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def includes[T](target: IntoInterator[T], value: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(target.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def iter[T](target: Any): js.Iterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("iter")(target.asInstanceOf[js.Any]).asInstanceOf[js.Iterator[T]]
  
  inline def map[S, T](target: IntoInterator[S], predicate: MapFunction[S, T]): IterableIterator[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(target.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[T]]
  
  inline def `match`(pattern: js.RegExp, string: String): IterableIterator[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(pattern.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[String]]
  
  inline def permutations[T](array: js.Array[T], r: Double): IterableIterator[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("permutations")(array.asInstanceOf[js.Any], r.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[js.Array[T]]]
  
  inline def powerSet[T](array: js.Array[T]): IterableIterator[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("powerSet")(array.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[js.Array[T]]]
  
  inline def range(end: Double): IterableIterator[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("range")(end.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[Double]]
  inline def range(start: Double, end: Double): IterableIterator[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[Double]]
  inline def range(start: Double, end: Double, step: Double): IterableIterator[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[Double]]
  
  inline def some[T](target: IntoInterator[T], predicate: typings.obliterator.someMod.PredicateFunction[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(target.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def split(pattern: js.RegExp, string: String): IterableIterator[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(pattern.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[String]]
  
  inline def take[T](iterator: IntoInterator[T], n: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("take")(iterator.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def takeInto[T](
    ArrayClass: Instantiable1[/* arrayLength */ Double, js.Array[js.Object]],
    iterator: IntoInterator[T],
    n: Double
  ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("takeInto")(ArrayClass.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
