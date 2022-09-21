package typings.mnemonist

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import typings.std.IterableIterator
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object passjoinIndexMod {
  
  @JSImport("mnemonist/passjoin-index", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mnemonist/passjoin-index", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends StObject
       with PassjoinIndex[T] {
    // Constructor
    def this(levenshtein: LevenshteinDistanceFunction[T], k: Double) = this()
  }
  /* static members */
  object default {
    
    @JSImport("mnemonist/passjoin-index", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    // Statics
    inline def from[I](iterable: js.Iterable[I], levenshtein: LevenshteinDistanceFunction[I], k: Double): PassjoinIndex[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], levenshtein.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[PassjoinIndex[I]]
    inline def from[I](iterable: StringDictionary[I], levenshtein: LevenshteinDistanceFunction[I], k: Double): PassjoinIndex[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], levenshtein.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[PassjoinIndex[I]]
  }
  
  inline def comparator[T](a: T, b: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("comparator")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def countKeys(k: Double, s: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("countKeys")(k.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def multiMatchAwareInterval(k: Double, delta: Double, i: Double, s: Double, pi: Double, li: Double): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("multiMatchAwareInterval")(k.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], i.asInstanceOf[js.Any], s.asInstanceOf[js.Any], pi.asInstanceOf[js.Any], li.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def multiMatchAwareSubstrings[T](k: Double, string: T, l: Double, i: Double, pi: Double, li: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("multiMatchAwareSubstrings")(k.asInstanceOf[js.Any], string.asInstanceOf[js.Any], l.asInstanceOf[js.Any], i.asInstanceOf[js.Any], pi.asInstanceOf[js.Any], li.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def partition(k: Double, l: Double): js.Array[js.Tuple2[Double, Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("partition")(k.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Tuple2[Double, Double]]]
  
  inline def segmentPos[T](k: Double, i: Double, string: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("segmentPos")(k.asInstanceOf[js.Any], i.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def segments[T](k: Double, string: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("segments")(k.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  type LevenshteinDistanceFunction[T] = js.Function2[/* a */ T, /* b */ T, Double]
  
  @js.native
  trait PassjoinIndex[T]
    extends StObject
       with Iterable[T] {
    
    // Methods
    def add(value: T): this.type = js.native
    
    def clear(): Unit = js.native
    
    def forEach(callback: js.Function3[/* value */ T, /* index */ Double, /* self */ this.type, Unit]): Unit = js.native
    def forEach(callback: js.Function3[/* value */ T, /* index */ Double, /* self */ this.type, Unit], scope: Any): Unit = js.native
    
    def inspect(): Any = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_PassjoinIndex: js.Function0[IterableIterator[T]] = js.native
    
    def search(query: T): Set[T] = js.native
    
    // Members
    var size: Double = js.native
    
    def values(): IterableIterator[T] = js.native
  }
}
