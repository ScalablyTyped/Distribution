package typings.mnemonist.hashedArrayTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HashedArrayTree[T] extends js.Object {
  // Members
  var blockSize: Double = js.native
  var capacity: Double = js.native
  var length: Double = js.native
  def get(index: Double): js.UndefOr[T] = js.native
  def grow(capacity: Double): this.type = js.native
  def inspect(): js.Any = js.native
  def pop(): js.UndefOr[T] = js.native
  def push(value: T): Double = js.native
  def resize(length: Double): this.type = js.native
  // Methods
  def set(index: Double, value: T): this.type = js.native
}

object HashedArrayTree {
  @scala.inline
  def apply[T](
    blockSize: Double,
    capacity: Double,
    get: Double => js.UndefOr[T],
    grow: Double => HashedArrayTree[T],
    inspect: () => js.Any,
    length: Double,
    pop: () => js.UndefOr[T],
    push: T => Double,
    resize: Double => HashedArrayTree[T],
    set: (Double, T) => HashedArrayTree[T]
  ): HashedArrayTree[T] = {
    val __obj = js.Dynamic.literal(blockSize = blockSize.asInstanceOf[js.Any], capacity = capacity.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), grow = js.Any.fromFunction1(grow), inspect = js.Any.fromFunction0(inspect), length = length.asInstanceOf[js.Any], pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), resize = js.Any.fromFunction1(resize), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[HashedArrayTree[T]]
  }
  @scala.inline
  implicit class HashedArrayTreeOps[Self <: HashedArrayTree[_], T] (val x: Self with HashedArrayTree[T]) extends AnyVal {
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
    def setBlockSize(value: Double): Self = this.set("blockSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setCapacity(value: Double): Self = this.set("capacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setGet(value: Double => js.UndefOr[T]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGrow(value: Double => HashedArrayTree[T]): Self = this.set("grow", js.Any.fromFunction1(value))
    @scala.inline
    def setInspect(value: () => js.Any): Self = this.set("inspect", js.Any.fromFunction0(value))
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setPop(value: () => js.UndefOr[T]): Self = this.set("pop", js.Any.fromFunction0(value))
    @scala.inline
    def setPush(value: T => Double): Self = this.set("push", js.Any.fromFunction1(value))
    @scala.inline
    def setResize(value: Double => HashedArrayTree[T]): Self = this.set("resize", js.Any.fromFunction1(value))
    @scala.inline
    def setSet(value: (Double, T) => HashedArrayTree[T]): Self = this.set("set", js.Any.fromFunction2(value))
  }
  
}

