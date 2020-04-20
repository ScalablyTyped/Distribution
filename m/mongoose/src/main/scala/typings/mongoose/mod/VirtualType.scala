package typings.mongoose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * section virtualtype.js
  * http://mongoosejs.com/docs/api.html#virtualtype-js
  */
trait VirtualType extends js.Object {
  /** Applies getters to value using optional scope. */
  def applyGetters(value: js.Any, scope: js.Any): js.Any
  /** Applies setters to value using optional scope. */
  def applySetters(value: js.Any, scope: js.Any): js.Any
  /** Defines a getter. */
  def get(fn: js.Function): this.type
  /** Defines a setter. */
  def set(fn: js.Function): this.type
}

object VirtualType {
  @scala.inline
  def apply(
    applyGetters: (js.Any, js.Any) => js.Any,
    applySetters: (js.Any, js.Any) => js.Any,
    get: js.Function => VirtualType,
    set: js.Function => VirtualType
  ): VirtualType = {
    val __obj = js.Dynamic.literal(applyGetters = js.Any.fromFunction2(applyGetters), applySetters = js.Any.fromFunction2(applySetters), get = js.Any.fromFunction1(get), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[VirtualType]
  }
}

