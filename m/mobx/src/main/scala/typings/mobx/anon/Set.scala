package typings.mobx.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Set extends js.Object {
  var configurable: Boolean = js.native
  var enumerable: Boolean = js.native
  def get(): js.UndefOr[scala.Nothing] = js.native
  def set(v: js.Any): Unit = js.native
}

object Set {
  @scala.inline
  def apply(
    configurable: Boolean,
    enumerable: Boolean,
    get: () => js.UndefOr[scala.Nothing],
    set: js.Any => Unit
  ): Set = {
    val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any], enumerable = enumerable.asInstanceOf[js.Any], get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[Set]
  }
  @scala.inline
  implicit class SetOps[Self <: Set] (val x: Self) extends AnyVal {
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
    def setConfigurable(value: Boolean): Self = this.set("configurable", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnumerable(value: Boolean): Self = this.set("enumerable", value.asInstanceOf[js.Any])
    @scala.inline
    def setGet(value: () => js.UndefOr[scala.Nothing]): Self = this.set("get", js.Any.fromFunction0(value))
    @scala.inline
    def setSet(value: js.Any => Unit): Self = this.set("set", js.Any.fromFunction1(value))
  }
  
}

