package typings.mobx.libApiObservableMod

import typings.mobx.libApiObservabledecoratorMod.IObservableDecorator
import typings.mobx.libUtilsComparerMod.IEqualsComparer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateObservableOptions extends js.Object {
  var deep: js.UndefOr[Boolean] = js.undefined
  var defaultDecorator: js.UndefOr[IObservableDecorator] = js.undefined
  @JSName("equals")
  var equals_FCreateObservableOptions: js.UndefOr[IEqualsComparer[_]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var proxy: js.UndefOr[Boolean] = js.undefined
}

object CreateObservableOptions {
  @scala.inline
  def apply(
    deep: js.UndefOr[Boolean] = js.undefined,
    defaultDecorator: IObservableDecorator = null,
    equals: (_, _) => Boolean = null,
    name: String = null,
    proxy: js.UndefOr[Boolean] = js.undefined
  ): CreateObservableOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep)
    if (defaultDecorator != null) __obj.updateDynamic("defaultDecorator")(defaultDecorator)
    if (equals != null) __obj.updateDynamic("equals")(js.Any.fromFunction2(equals))
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(proxy)) __obj.updateDynamic("proxy")(proxy)
    __obj.asInstanceOf[CreateObservableOptions]
  }
}

