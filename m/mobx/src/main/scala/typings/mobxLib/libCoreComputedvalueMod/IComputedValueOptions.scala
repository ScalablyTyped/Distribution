package typings
package mobxLib.libCoreComputedvalueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IComputedValueOptions[T] extends js.Object {
  var context: js.UndefOr[js.Any] = js.undefined
  @JSName("equals")
  var equals_FIComputedValueOptions: js.UndefOr[mobxLib.libUtilsComparerMod.IEqualsComparer[T]] = js.undefined
  var get: js.UndefOr[js.Function0[T]] = js.undefined
  var keepAlive: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var requiresReaction: js.UndefOr[scala.Boolean] = js.undefined
  var set: js.UndefOr[js.Function1[/* value */ T, scala.Unit]] = js.undefined
}

object IComputedValueOptions {
  @scala.inline
  def apply[T](
    context: js.Any = null,
    equals: mobxLib.libUtilsComparerMod.IEqualsComparer[T] = null,
    get: js.Function0[T] = null,
    keepAlive: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    requiresReaction: js.UndefOr[scala.Boolean] = js.undefined,
    set: js.Function1[/* value */ T, scala.Unit] = null
  ): IComputedValueOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (equals != null) __obj.updateDynamic("equals")(equals)
    if (get != null) __obj.updateDynamic("get")(get)
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(requiresReaction)) __obj.updateDynamic("requiresReaction")(requiresReaction)
    if (set != null) __obj.updateDynamic("set")(set)
    __obj.asInstanceOf[IComputedValueOptions[T]]
  }
}

