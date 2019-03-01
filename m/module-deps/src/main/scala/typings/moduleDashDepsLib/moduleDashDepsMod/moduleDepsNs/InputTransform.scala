package typings
package moduleDashDepsLib.moduleDashDepsMod.moduleDepsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputTransform extends js.Object {
  var global: js.UndefOr[scala.Boolean] = js.undefined
  var options: js.Any
  var transform: java.lang.String | js.Function0[_]
}

object InputTransform {
  @scala.inline
  def apply(
    options: js.Any,
    transform: java.lang.String | js.Function0[_],
    global: js.UndefOr[scala.Boolean] = js.undefined
  ): InputTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global)
    __obj.asInstanceOf[InputTransform]
  }
}

