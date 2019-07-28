package typings.mobx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConfigurableEnumerable extends js.Object {
  var configurable: Boolean
  var enumerable: Boolean
  var value: js.UndefOr[scala.Nothing] = js.undefined
  var writable: Boolean
  def initializer(): js.Function with (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_mobx/lib/internal.IAction */ js.Any)
}

object Anon_ConfigurableEnumerable {
  @scala.inline
  def apply(
    configurable: Boolean,
    enumerable: Boolean,
    initializer: () => js.Function with (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_mobx/lib/internal.IAction */ js.Any),
    writable: Boolean,
    value: js.UndefOr[scala.Nothing] = js.undefined
  ): Anon_ConfigurableEnumerable = {
    val __obj = js.Dynamic.literal(configurable = configurable, enumerable = enumerable, initializer = js.Any.fromFunction0(initializer), writable = writable)
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_ConfigurableEnumerable]
  }
}

