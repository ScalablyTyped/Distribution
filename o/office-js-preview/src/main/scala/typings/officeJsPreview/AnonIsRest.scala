package typings.officeJsPreview

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsRest extends js.Object {
  var isRest: js.UndefOr[Boolean] = js.undefined
}

object AnonIsRest {
  @scala.inline
  def apply(isRest: js.UndefOr[Boolean] = js.undefined): AnonIsRest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isRest)) __obj.updateDynamic("isRest")(isRest.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsRest]
  }
}

