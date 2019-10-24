package typings.preactDashI18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Definition extends js.Object {
  var definition: js.UndefOr[js.Object] = js.undefined
  var scope: js.UndefOr[js.Any] = js.undefined
}

object Anon_Definition {
  @scala.inline
  def apply(definition: js.Object = null, scope: js.Any = null): Anon_Definition = {
    val __obj = js.Dynamic.literal()
    if (definition != null) __obj.updateDynamic("definition")(definition)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[Anon_Definition]
  }
}

