package typings.objectKeysMapping

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCamelcase extends js.Object {
  var camelcase: js.UndefOr[Boolean] = js.undefined
}

object AnonCamelcase {
  @scala.inline
  def apply(camelcase: js.UndefOr[Boolean] = js.undefined): AnonCamelcase = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(camelcase)) __obj.updateDynamic("camelcase")(camelcase.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCamelcase]
  }
}

