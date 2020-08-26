package typings.mnemonist

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.typesMod.IArrayLikeConstructor
import typings.std.Iterable
import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist/fixed-deque", JSImport.Namespace)
@js.native
object fixedDequeMod extends js.Object {
  @js.native
  trait FixedDeque[T] extends Iterable[T] {
    // Members
    var capacity: Double = js.native
    var size: Double = js.native
    // Methods
    def clear(): Unit = js.native
    def entries(): Iterator[js.Tuple2[Double, T], _, js.UndefOr[scala.Nothing]] = js.native
    def forEach(callback: js.Function3[/* item */ T, /* index */ Double, /* buffer */ this.type, Unit]): Unit = js.native
    def forEach(
      callback: js.Function3[/* item */ T, /* index */ Double, /* buffer */ this.type, Unit],
      scope: js.Any
    ): Unit = js.native
    def get(index: Double): js.UndefOr[T] = js.native
    def inspect(): js.Any = js.native
    def peekFirst(): js.UndefOr[T] = js.native
    def peekLast(): js.UndefOr[T] = js.native
    def pop(): js.UndefOr[T] = js.native
    def push(item: T): Double = js.native
    def shift(): js.UndefOr[T] = js.native
    def toArray(): Iterable[T] = js.native
    def unshift(item: T): Double = js.native
    def values(): Iterator[T, _, js.UndefOr[scala.Nothing]] = js.native
  }
  
  @js.native
  class default[T] protected () extends FixedDeque[T] {
    // Constructor
    def this(ArrayClass: IArrayLikeConstructor, capacity: Double) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def from[I](iterable: StringDictionary[I], ArrayClass: IArrayLikeConstructor): FixedDeque[I] = js.native
    def from[I](iterable: StringDictionary[I], ArrayClass: IArrayLikeConstructor, capacity: Double): FixedDeque[I] = js.native
    // Statics
    def from[I](iterable: Iterable[I], ArrayClass: IArrayLikeConstructor): FixedDeque[I] = js.native
    def from[I](iterable: Iterable[I], ArrayClass: IArrayLikeConstructor, capacity: Double): FixedDeque[I] = js.native
  }
  
}

