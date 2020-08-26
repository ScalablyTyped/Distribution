package typings.oracleOraclejet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericSetter[SP] extends js.Object {
  def set[K /* <: /* keyof SP */ String */](
    propertyName: K,
    propertyValue: /* import warning: importer.ImportType#apply Failed type conversion: SP[K] */ js.Any
  ): Unit = js.native
  def unset(propertyName: /* keyof SP */ String): Unit = js.native
}

object GenericSetter {
  @scala.inline
  def apply[SP](
    set: (js.Any, /* import warning: importer.ImportType#apply Failed type conversion: SP[K] */ js.Any) => Unit,
    unset: /* keyof SP */ String => Unit
  ): GenericSetter[SP] = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction2(set), unset = js.Any.fromFunction1(unset))
    __obj.asInstanceOf[GenericSetter[SP]]
  }
  @scala.inline
  implicit class GenericSetterOps[Self <: GenericSetter[_], SP] (val x: Self with GenericSetter[SP]) extends AnyVal {
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
    def setSet(
      value: (js.Any, /* import warning: importer.ImportType#apply Failed type conversion: SP[K] */ js.Any) => Unit
    ): Self = this.set("set", js.Any.fromFunction2(value))
    @scala.inline
    def setUnset(value: /* keyof SP */ String => Unit): Self = this.set("unset", js.Any.fromFunction1(value))
  }
  
}

