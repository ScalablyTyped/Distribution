package typings.preactI18n.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Definition extends js.Object {
  var definition: js.UndefOr[js.Object] = js.undefined
  var mark: js.UndefOr[Boolean] = js.undefined
  var scope: js.UndefOr[js.Any] = js.undefined
}

object Definition {
  @scala.inline
  def apply(definition: js.Object = null, mark: js.UndefOr[Boolean] = js.undefined, scope: js.Any = null): Definition = {
    val __obj = js.Dynamic.literal()
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (!js.isUndefined(mark)) __obj.updateDynamic("mark")(mark.get.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
}

