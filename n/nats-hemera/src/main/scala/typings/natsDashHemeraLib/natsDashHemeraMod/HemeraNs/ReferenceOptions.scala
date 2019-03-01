package typings
package natsDashHemeraLib.natsDashHemeraMod.HemeraNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceOptions extends js.Object {
  var contextPrefix: js.UndefOr[java.lang.String] = js.undefined
  var default: js.UndefOr[js.Any] = js.undefined
  var functions: js.UndefOr[scala.Boolean] = js.undefined
  var separator: js.UndefOr[java.lang.String] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

object ReferenceOptions {
  @scala.inline
  def apply(
    contextPrefix: java.lang.String = null,
    default: js.Any = null,
    functions: js.UndefOr[scala.Boolean] = js.undefined,
    separator: java.lang.String = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined
  ): ReferenceOptions = {
    val __obj = js.Dynamic.literal()
    if (contextPrefix != null) __obj.updateDynamic("contextPrefix")(contextPrefix)
    if (default != null) __obj.updateDynamic("default")(default)
    if (!js.isUndefined(functions)) __obj.updateDynamic("functions")(functions)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[ReferenceOptions]
  }
}

