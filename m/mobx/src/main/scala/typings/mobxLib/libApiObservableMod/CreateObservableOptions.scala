package typings
package mobxLib.libApiObservableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateObservableOptions extends js.Object {
  var deep: js.UndefOr[scala.Boolean] = js.undefined
  var defaultDecorator: js.UndefOr[mobxLib.libApiObservabledecoratorMod.IObservableDecorator] = js.undefined
  @JSName("equals")
  var equals_FCreateObservableOptions: js.UndefOr[mobxLib.libUtilsComparerMod.IEqualsComparer[_]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var proxy: js.UndefOr[scala.Boolean] = js.undefined
}

object CreateObservableOptions {
  @scala.inline
  def apply(
    deep: js.UndefOr[scala.Boolean] = js.undefined,
    defaultDecorator: mobxLib.libApiObservabledecoratorMod.IObservableDecorator = null,
    equals: mobxLib.libUtilsComparerMod.IEqualsComparer[_] = null,
    name: java.lang.String = null,
    proxy: js.UndefOr[scala.Boolean] = js.undefined
  ): CreateObservableOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep)
    if (defaultDecorator != null) __obj.updateDynamic("defaultDecorator")(defaultDecorator)
    if (equals != null) __obj.updateDynamic("equals")(equals)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(proxy)) __obj.updateDynamic("proxy")(proxy)
    __obj.asInstanceOf[CreateObservableOptions]
  }
}

