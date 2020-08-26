package typings.mnemonist.vectorMod

import typings.std.Iterable
import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vector extends Iterable[Double] {
  // Members
  var capacity: Double = js.native
  var length: Double = js.native
  var size: Double = js.native
  // Methods
  def clear(): Unit = js.native
  def entries(): Iterator[js.Tuple2[Double, Double], _, js.UndefOr[scala.Nothing]] = js.native
  def forEach(callback: js.Function3[/* index */ Double, /* value */ Double, /* set */ this.type, Unit]): Unit = js.native
  def forEach(
    callback: js.Function3[/* index */ Double, /* value */ Double, /* set */ this.type, Unit],
    scope: js.Any
  ): Unit = js.native
  def get(index: Double): Double = js.native
  def grow(): this.type = js.native
  def grow(capacity: Double): this.type = js.native
  def inspect(): js.Any = js.native
  def pop(): js.UndefOr[Double] = js.native
  def push(value: Double): Double = js.native
  def reallocate(capacity: Double): this.type = js.native
  def resize(length: Double): this.type = js.native
  def set(index: Double, value: Double): this.type = js.native
  def toJSON(): js.Any = js.native
  def values(): Iterator[Double, _, js.UndefOr[scala.Nothing]] = js.native
}

