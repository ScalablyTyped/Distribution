package typings.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Invalid extends js.Object {
  /** Whether it's invalid. */
  var invalid: js.UndefOr[Boolean] = js.undefined
}

object Anon_Invalid {
  @scala.inline
  def apply(invalid: js.UndefOr[Boolean] = js.undefined): Anon_Invalid = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(invalid)) __obj.updateDynamic("invalid")(invalid)
    __obj.asInstanceOf[Anon_Invalid]
  }
}

