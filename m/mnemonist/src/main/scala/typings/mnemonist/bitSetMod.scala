package typings.mnemonist

import typings.std.Iterable
import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist/bit-set", JSImport.Namespace)
@js.native
object bitSetMod extends js.Object {
  @js.native
  trait BitSet extends Iterable[Double] {
    // Members
    var length: Double = js.native
    var size: Double = js.native
    // Methods
    def clear(): Unit = js.native
    def entries(): Iterator[js.Tuple2[Double, Double], _, js.UndefOr[scala.Nothing]] = js.native
    def flip(index: Double, value: Boolean): Unit = js.native
    def flip(index: Double, value: Double): Unit = js.native
    def forEach(callback: js.Function3[/* index */ Double, /* value */ Double, /* set */ this.type, Unit]): Unit = js.native
    def forEach(
      callback: js.Function3[/* index */ Double, /* value */ Double, /* set */ this.type, Unit],
      scope: js.Any
    ): Unit = js.native
    def get(index: Double): Double = js.native
    def inspect(): js.Any = js.native
    def rank(r: Double): Double = js.native
    def reset(index: Double, value: Boolean): Unit = js.native
    def reset(index: Double, value: Double): Unit = js.native
    def select(r: Double): Double = js.native
    def set(index: Double): Unit = js.native
    def set(index: Double, value: Boolean): Unit = js.native
    def set(index: Double, value: Double): Unit = js.native
    def test(index: Double): Boolean = js.native
    def toJSON(): js.Array[Double] = js.native
    def values(): Iterator[Double, _, js.UndefOr[scala.Nothing]] = js.native
  }
  
  @js.native
  class default protected () extends BitSet {
    // Constructor
    def this(length: Double) = this()
  }
  
}

