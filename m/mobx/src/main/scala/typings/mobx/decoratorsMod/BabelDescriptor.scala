package typings.mobx.decoratorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.PropertyDescriptor & {initializer ? (): any} */
trait BabelDescriptor extends js.Object {
  var configurable: js.UndefOr[Boolean] = js.undefined
  var enumerable: js.UndefOr[Boolean] = js.undefined
  var get: js.UndefOr[js.Function0[_]] = js.undefined
  var initializer: js.UndefOr[js.Function0[_]] = js.undefined
  var set: js.UndefOr[js.Function1[/* v */ js.Any, Unit]] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
  var writable: js.UndefOr[Boolean] = js.undefined
}

object BabelDescriptor {
  @scala.inline
  def apply(
    configurable: js.UndefOr[Boolean] = js.undefined,
    enumerable: js.UndefOr[Boolean] = js.undefined,
    get: () => _ = null,
    initializer: () => _ = null,
    set: /* v */ js.Any => Unit = null,
    value: js.Any = null,
    writable: js.UndefOr[Boolean] = js.undefined
  ): BabelDescriptor = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(configurable)) __obj.updateDynamic("configurable")(configurable.asInstanceOf[js.Any])
    if (!js.isUndefined(enumerable)) __obj.updateDynamic("enumerable")(enumerable.asInstanceOf[js.Any])
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction0(get))
    if (initializer != null) __obj.updateDynamic("initializer")(js.Any.fromFunction0(initializer))
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction1(set))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[BabelDescriptor]
  }
}

