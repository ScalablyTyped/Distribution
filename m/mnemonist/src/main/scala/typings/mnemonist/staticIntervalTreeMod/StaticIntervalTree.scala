package typings.mnemonist.staticIntervalTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticIntervalTree[T] extends js.Object {
  // Members
  var height: Double = js.native
  var size: Double = js.native
  def inspect(): js.Any = js.native
  // Methods
  def intervalsContainingPoint(point: Double): js.Array[T] = js.native
  def intervalsOverlappingInterval(interval: T): js.Array[T] = js.native
}

object StaticIntervalTree {
  @scala.inline
  def apply[T](
    height: Double,
    inspect: () => js.Any,
    intervalsContainingPoint: Double => js.Array[T],
    intervalsOverlappingInterval: T => js.Array[T],
    size: Double
  ): StaticIntervalTree[T] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], inspect = js.Any.fromFunction0(inspect), intervalsContainingPoint = js.Any.fromFunction1(intervalsContainingPoint), intervalsOverlappingInterval = js.Any.fromFunction1(intervalsOverlappingInterval), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticIntervalTree[T]]
  }
  @scala.inline
  implicit class StaticIntervalTreeOps[Self <: StaticIntervalTree[_], T] (val x: Self with StaticIntervalTree[T]) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setInspect(value: () => js.Any): Self = this.set("inspect", js.Any.fromFunction0(value))
    @scala.inline
    def setIntervalsContainingPoint(value: Double => js.Array[T]): Self = this.set("intervalsContainingPoint", js.Any.fromFunction1(value))
    @scala.inline
    def setIntervalsOverlappingInterval(value: T => js.Array[T]): Self = this.set("intervalsOverlappingInterval", js.Any.fromFunction1(value))
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}

