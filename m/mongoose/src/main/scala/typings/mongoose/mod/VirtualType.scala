package typings.mongoose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * section virtualtype.js
  * http://mongoosejs.com/docs/api.html#virtualtype-js
  */
@js.native
trait VirtualType extends js.Object {
  /** Applies getters to value using optional scope. */
  def applyGetters(value: js.Any, scope: js.Any): js.Any = js.native
  /** Applies setters to value using optional scope. */
  def applySetters(value: js.Any, scope: js.Any): js.Any = js.native
  /** Defines a getter. */
  def get(fn: js.Function): this.type = js.native
  /** Defines a setter. */
  def set(fn: js.Function): this.type = js.native
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
  @scala.inline
  implicit class VirtualTypeOps[Self <: VirtualType] (val x: Self) extends AnyVal {
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
    def setApplyGetters(value: (js.Any, js.Any) => js.Any): Self = this.set("applyGetters", js.Any.fromFunction2(value))
    @scala.inline
    def setApplySetters(value: (js.Any, js.Any) => js.Any): Self = this.set("applySetters", js.Any.fromFunction2(value))
    @scala.inline
    def setGet(value: js.Function => VirtualType): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setSet(value: js.Function => VirtualType): Self = this.set("set", js.Any.fromFunction1(value))
  }
  
}

