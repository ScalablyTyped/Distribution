package typings.moduleDashDeps.moduleDashDepsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputTransform extends js.Object {
  var global: js.UndefOr[Boolean] = js.undefined
  var options: js.Any
  var transform: String | js.Function0[_]
}

object InputTransform {
  @scala.inline
  def apply(options: js.Any, transform: String | js.Function0[_], global: js.UndefOr[Boolean] = js.undefined): InputTransform = {
    val __obj = js.Dynamic.literal(options = options, transform = transform.asInstanceOf[js.Any])
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global)
    __obj.asInstanceOf[InputTransform]
  }
}

