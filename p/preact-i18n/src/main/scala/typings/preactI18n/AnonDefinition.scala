package typings.preactI18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefinition extends js.Object {
  var definition: js.UndefOr[js.Object] = js.undefined
  var mark: js.UndefOr[Boolean] = js.undefined
  var scope: js.UndefOr[js.Any] = js.undefined
}

object AnonDefinition {
  @scala.inline
  def apply(definition: js.Object = null, mark: js.UndefOr[Boolean] = js.undefined, scope: js.Any = null): AnonDefinition = {
    val __obj = js.Dynamic.literal()
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (!js.isUndefined(mark)) __obj.updateDynamic("mark")(mark.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefinition]
  }
}

