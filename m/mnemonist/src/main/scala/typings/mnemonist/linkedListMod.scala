package typings.mnemonist

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist/linked-list", JSImport.Namespace)
@js.native
object linkedListMod extends js.Object {
  @js.native
  trait LinkedList[T] extends Iterable[T] {
    // Members
    var size: Double = js.native
    // Methods
    def clear(): Unit = js.native
    def entries(): Iterator[js.Tuple2[Double, T], _, js.UndefOr[scala.Nothing]] = js.native
    def first(): js.UndefOr[T] = js.native
    def forEach(callback: js.Function3[/* value */ T, /* index */ Double, /* list */ this.type, Unit]): Unit = js.native
    def forEach(
      callback: js.Function3[/* value */ T, /* index */ Double, /* list */ this.type, Unit],
      scope: js.Any
    ): Unit = js.native
    def inspect(): js.Any = js.native
    def last(): js.UndefOr[T] = js.native
    def peek(): js.UndefOr[T] = js.native
    def push(value: T): Double = js.native
    def shift(): js.UndefOr[T] = js.native
    def toArray(): js.Array[T] = js.native
    def toJSON(): js.Array[T] = js.native
    def unshift(value: T): Double = js.native
    def values(): Iterator[T, _, js.UndefOr[scala.Nothing]] = js.native
  }
  
  @js.native
  class default[T] () extends LinkedList[T]
  
  /* static members */
  @js.native
  object default extends js.Object {
    def from[I](iterable: StringDictionary[I]): LinkedList[I] = js.native
    // Statics
    def from[I](iterable: Iterable[I]): LinkedList[I] = js.native
  }
  
}

