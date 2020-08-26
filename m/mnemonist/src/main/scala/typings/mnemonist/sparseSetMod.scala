package typings.mnemonist

import typings.std.Iterable
import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist/sparse-set", JSImport.Namespace)
@js.native
object sparseSetMod extends js.Object {
  @js.native
  trait SparseSet extends Iterable[Double] {
    // Members
    var size: Double = js.native
    def add(value: Double): this.type = js.native
    // Methods
    def clear(): Unit = js.native
    def delete(value: Double): Boolean = js.native
    def forEach(callback: js.Function3[/* value */ Double, /* key */ Double, /* set */ this.type, Unit]): Unit = js.native
    def forEach(
      callback: js.Function3[/* value */ Double, /* key */ Double, /* set */ this.type, Unit],
      scope: js.Any
    ): Unit = js.native
    def has(value: Double): Boolean = js.native
    def inspect(): js.Any = js.native
    def values(): Iterator[Double, _, js.UndefOr[scala.Nothing]] = js.native
  }
  
  @js.native
  class default protected () extends SparseSet {
    // Constructor
    def this(length: Double) = this()
  }
  
}

