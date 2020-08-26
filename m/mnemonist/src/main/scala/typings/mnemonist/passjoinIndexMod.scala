package typings.mnemonist

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import typings.std.Iterator
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist/passjoin-index", JSImport.Namespace)
@js.native
object passjoinIndexMod extends js.Object {
  @js.native
  trait PassjoinIndex[T] extends Iterable[T] {
    // Members
    var size: Double = js.native
    // Methods
    def add(value: T): this.type = js.native
    def clear(): Unit = js.native
    def forEach(callback: js.Function3[/* value */ T, /* index */ Double, /* self */ this.type, Unit]): Unit = js.native
    def forEach(
      callback: js.Function3[/* value */ T, /* index */ Double, /* self */ this.type, Unit],
      scope: js.Any
    ): Unit = js.native
    def inspect(): js.Any = js.native
    def search(query: T): Set[T] = js.native
    def values(): Iterator[T, _, js.UndefOr[scala.Nothing]] = js.native
  }
  
  @js.native
  class default[T] protected () extends PassjoinIndex[T] {
    // Constructor
    def this(levenshtein: LevenshteinDistanceFunction[T], k: Double) = this()
  }
  
  def comparator[T](a: T, b: T): Double = js.native
  def countKeys(k: Double, s: Double): Double = js.native
  def multiMatchAwareInterval(k: Double, delta: Double, i: Double, s: Double, pi: Double, li: Double): js.Tuple2[Double, Double] = js.native
  def multiMatchAwareSubstrings[T](k: Double, string: T, l: Double, i: Double, pi: Double, li: Double): js.Array[T] = js.native
  def partition(k: Double, l: Double): js.Array[js.Tuple2[Double, Double]] = js.native
  def segmentPos[T](k: Double, i: Double, string: T): Double = js.native
  def segments[T](k: Double, string: T): js.Array[T] = js.native
  /* static members */
  @js.native
  object default extends js.Object {
    def from[I](iterable: StringDictionary[I], levenshtein: LevenshteinDistanceFunction[I], k: Double): PassjoinIndex[I] = js.native
    // Statics
    def from[I](iterable: Iterable[I], levenshtein: LevenshteinDistanceFunction[I], k: Double): PassjoinIndex[I] = js.native
  }
  
  type LevenshteinDistanceFunction[T] = js.Function2[/* a */ T, /* b */ T, Double]
}

