package typings.mnemonist.staticDisjointSetMod

import typings.mnemonist.typesMod.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticDisjointSet extends js.Object {
  // Members
  var dimension: Double = js.native
  var size: Double = js.native
  def compile(): js.Array[js.Array[Double]] = js.native
  def connected(x: Double, y: Double): Boolean = js.native
  // Methods
  def find(x: Double): Double = js.native
  def inspect(): js.Any = js.native
  def mapping(): ArrayLike = js.native
  def union(x: Double, y: Double): this.type = js.native
}

object StaticDisjointSet {
  @scala.inline
  def apply(
    compile: () => js.Array[js.Array[Double]],
    connected: (Double, Double) => Boolean,
    dimension: Double,
    find: Double => Double,
    inspect: () => js.Any,
    mapping: () => ArrayLike,
    size: Double,
    union: (Double, Double) => StaticDisjointSet
  ): StaticDisjointSet = {
    val __obj = js.Dynamic.literal(compile = js.Any.fromFunction0(compile), connected = js.Any.fromFunction2(connected), dimension = dimension.asInstanceOf[js.Any], find = js.Any.fromFunction1(find), inspect = js.Any.fromFunction0(inspect), mapping = js.Any.fromFunction0(mapping), size = size.asInstanceOf[js.Any], union = js.Any.fromFunction2(union))
    __obj.asInstanceOf[StaticDisjointSet]
  }
  @scala.inline
  implicit class StaticDisjointSetOps[Self <: StaticDisjointSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCompile(value: () => js.Array[js.Array[Double]]): Self = this.set("compile", js.Any.fromFunction0(value))
    @scala.inline
    def setConnected(value: (Double, Double) => Boolean): Self = this.set("connected", js.Any.fromFunction2(value))
    @scala.inline
    def setDimension(value: Double): Self = this.set("dimension", value.asInstanceOf[js.Any])
    @scala.inline
    def setFind(value: Double => Double): Self = this.set("find", js.Any.fromFunction1(value))
    @scala.inline
    def setInspect(value: () => js.Any): Self = this.set("inspect", js.Any.fromFunction0(value))
    @scala.inline
    def setMapping(value: () => ArrayLike): Self = this.set("mapping", js.Any.fromFunction0(value))
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnion(value: (Double, Double) => StaticDisjointSet): Self = this.set("union", js.Any.fromFunction2(value))
  }
  
}

