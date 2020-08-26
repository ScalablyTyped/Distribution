package typings.mnemonist

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist/stack", JSImport.Namespace)
@js.native
object stackMod extends js.Object {
  @js.native
  trait Stack[T] extends Iterable[T] {
    // Members
    var size: Double = js.native
    // Methods
    def clear(): Unit = js.native
    def entries(): Iterator[js.Tuple2[Double, T], _, js.UndefOr[scala.Nothing]] = js.native
    def forEach(callback: js.Function3[/* item */ T, /* index */ Double, /* stack */ this.type, Unit]): Unit = js.native
    def forEach(
      callback: js.Function3[/* item */ T, /* index */ Double, /* stack */ this.type, Unit],
      scope: js.Any
    ): Unit = js.native
    def inspect(): js.Any = js.native
    def peek(): js.UndefOr[T] = js.native
    def pop(): js.UndefOr[T] = js.native
    def push(item: T): Double = js.native
    def toArray(): js.Array[T] = js.native
    def toJSON(): js.Array[T] = js.native
    def values(): Iterator[T, _, js.UndefOr[scala.Nothing]] = js.native
  }
  
  @js.native
  class default[T] () extends Stack[T]
  
  /* static members */
  @js.native
  object default extends js.Object {
    def from[I](iterable: StringDictionary[I]): Stack[I] = js.native
    // Statics
    def from[I](iterable: Iterable[I]): Stack[I] = js.native
    def of[I](items: I*): Stack[I] = js.native
  }
  
}

