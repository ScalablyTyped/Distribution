package typings.mnemonist

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist/trie", JSImport.Namespace)
@js.native
object trieMod extends js.Object {
  @js.native
  trait Trie[T] extends Iterable[T] {
    // Members
    var size: Double = js.native
    def add(prefix: T): this.type = js.native
    // Methods
    def clear(): Unit = js.native
    def delete(prefix: T): Boolean = js.native
    def find(prefix: T): js.Array[T] = js.native
    def has(prefix: T): Boolean = js.native
    def inspect(): js.Any = js.native
    def keys(): Iterator[T, _, js.UndefOr[scala.Nothing]] = js.native
    def prefixes(): Iterator[T, _, js.UndefOr[scala.Nothing]] = js.native
  }
  
  @js.native
  // Constructor
  class default[T] () extends Trie[T] {
    def this(Token: Instantiable0[T]) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def from[I](iterable: StringDictionary[I]): Trie[I] = js.native
    // Statics
    def from[I](iterable: Iterable[I]): Trie[I] = js.native
  }
  
}

