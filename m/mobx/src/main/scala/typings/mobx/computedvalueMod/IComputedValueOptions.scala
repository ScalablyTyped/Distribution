package typings.mobx.computedvalueMod

import typings.mobx.comparerMod.IEqualsComparer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IComputedValueOptions[T] extends js.Object {
  var context: js.UndefOr[js.Any] = js.native
  @JSName("equals")
  var equals_FIComputedValueOptions: js.UndefOr[IEqualsComparer[T]] = js.native
  var get: js.UndefOr[js.Function0[T]] = js.native
  var keepAlive: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var requiresReaction: js.UndefOr[Boolean] = js.native
  var set: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.native
}

object IComputedValueOptions {
  @scala.inline
  def apply[T](): IComputedValueOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IComputedValueOptions[T]]
  }
  @scala.inline
  implicit class IComputedValueOptionsOps[Self <: IComputedValueOptions[_], T] (val x: Self with IComputedValueOptions[T]) extends AnyVal {
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
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setEquals(value: (T, T) => Boolean): Self = this.set("equals", js.Any.fromFunction2(value))
    @scala.inline
    def deleteEquals: Self = this.set("equals", js.undefined)
    @scala.inline
    def setGet(value: () => T): Self = this.set("get", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGet: Self = this.set("get", js.undefined)
    @scala.inline
    def setKeepAlive(value: Boolean): Self = this.set("keepAlive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepAlive: Self = this.set("keepAlive", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRequiresReaction(value: Boolean): Self = this.set("requiresReaction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequiresReaction: Self = this.set("requiresReaction", js.undefined)
    @scala.inline
    def setSet(value: /* value */ T => Unit): Self = this.set("set", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSet: Self = this.set("set", js.undefined)
  }
  
}

