package typings.objectDashKeysDashMapping

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Camelcase extends js.Object {
  var camelcase: js.UndefOr[Boolean] = js.undefined
}

object Anon_Camelcase {
  @scala.inline
  def apply(camelcase: js.UndefOr[Boolean] = js.undefined): Anon_Camelcase = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(camelcase)) __obj.updateDynamic("camelcase")(camelcase)
    __obj.asInstanceOf[Anon_Camelcase]
  }
}

