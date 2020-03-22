package typings.preactI18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScope extends js.Object {
  var definition: js.UndefOr[js.Object] = js.undefined
  var scope: js.UndefOr[js.Any] = js.undefined
}

object AnonScope {
  @scala.inline
  def apply(definition: js.Object = null, scope: js.Any = null): AnonScope = {
    val __obj = js.Dynamic.literal()
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScope]
  }
}

