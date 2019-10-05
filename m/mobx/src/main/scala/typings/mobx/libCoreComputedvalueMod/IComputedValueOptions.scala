package typings.mobx.libCoreComputedvalueMod

import typings.mobx.libUtilsComparerMod.IEqualsComparer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IComputedValueOptions[T] extends js.Object {
  var context: js.UndefOr[js.Any] = js.undefined
  @JSName("equals")
  var equals_FIComputedValueOptions: js.UndefOr[IEqualsComparer[T]] = js.undefined
  var get: js.UndefOr[js.Function0[T]] = js.undefined
  var keepAlive: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var requiresReaction: js.UndefOr[Boolean] = js.undefined
  var set: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
}

object IComputedValueOptions {
  @scala.inline
  def apply[T](
    context: js.Any = null,
    equals: (T, T) => Boolean = null,
    get: () => T = null,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    requiresReaction: js.UndefOr[Boolean] = js.undefined,
    set: /* value */ T => Unit = null
  ): IComputedValueOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (equals != null) __obj.updateDynamic("equals")(js.Any.fromFunction2(equals))
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction0(get))
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(requiresReaction)) __obj.updateDynamic("requiresReaction")(requiresReaction)
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction1(set))
    __obj.asInstanceOf[IComputedValueOptions[T]]
  }
}

