package typings.obliterator

import typings.std.IterableIterator
import typings.std.IteratorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("obliterator/iterator", JSImport.Namespace)
@js.native
object iteratorMod extends js.Object {
  @js.native
  trait Iterator[V] extends IterableIterator[V] {
    // Members
    var done: Boolean = js.native
    // Well-known methods
    def next(): IteratorResult[V, _] = js.native
  }
  
  @js.native
  class default[V] protected () extends Iterator[V] {
    // Constructor
    def this(next: NextFunction[V]) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def empty[T](): Iterator[T] = js.native
    def is(value: js.Any): Boolean = js.native
    // Static methods
    def of[T](args: T*): Iterator[T] = js.native
  }
  
  type NextFunction[V] = js.Function0[IteratorResult[V, js.Any]]
}

