package typings.mnemonist

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist/queue", JSImport.Namespace)
@js.native
object queueMod extends js.Object {
  @js.native
  trait Queue[T] extends Iterable[T] {
    // Members
    var size: Double = js.native
    // Methods
    def clear(): Unit = js.native
    def dequeue(): js.UndefOr[T] = js.native
    def enqueue(item: T): Double = js.native
    def entries(): Iterator[js.Tuple2[Double, T], _, js.UndefOr[scala.Nothing]] = js.native
    def forEach(callback: js.Function3[/* item */ T, /* index */ Double, /* queue */ this.type, Unit]): Unit = js.native
    def forEach(
      callback: js.Function3[/* item */ T, /* index */ Double, /* queue */ this.type, Unit],
      scope: js.Any
    ): Unit = js.native
    def inspect(): js.Any = js.native
    def peek(): js.UndefOr[T] = js.native
    def toArray(): js.Array[T] = js.native
    def toJSON(): js.Array[T] = js.native
    def values(): Iterator[T, _, js.UndefOr[scala.Nothing]] = js.native
  }
  
  @js.native
  class default[T] () extends Queue[T]
  
  /* static members */
  @js.native
  object default extends js.Object {
    def from[I](iterable: StringDictionary[I]): Queue[I] = js.native
    // Statics
    def from[I](iterable: Iterable[I]): Queue[I] = js.native
    def of[I](items: I*): Queue[I] = js.native
  }
  
}

