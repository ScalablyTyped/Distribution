package typings.mobx.observableMod

import typings.mobx.comparerMod.IEqualsComparer
import typings.mobx.observabledecoratorMod.IObservableDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateObservableOptions extends js.Object {
  var deep: js.UndefOr[Boolean] = js.native
  var defaultDecorator: js.UndefOr[IObservableDecorator] = js.native
  @JSName("equals")
  var equals_FCreateObservableOptions: js.UndefOr[IEqualsComparer[_]] = js.native
  var name: js.UndefOr[String] = js.native
  var proxy: js.UndefOr[Boolean] = js.native
}

object CreateObservableOptions {
  @scala.inline
  def apply(): CreateObservableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateObservableOptions]
  }
  @scala.inline
  implicit class CreateObservableOptionsOps[Self <: CreateObservableOptions] (val x: Self) extends AnyVal {
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
    def setDeep(value: Boolean): Self = this.set("deep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeep: Self = this.set("deep", js.undefined)
    @scala.inline
    def setDefaultDecorator(value: IObservableDecorator): Self = this.set("defaultDecorator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultDecorator: Self = this.set("defaultDecorator", js.undefined)
    @scala.inline
    def setEquals(value: (_, _) => Boolean): Self = this.set("equals", js.Any.fromFunction2(value))
    @scala.inline
    def deleteEquals: Self = this.set("equals", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setProxy(value: Boolean): Self = this.set("proxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
  }
  
}

