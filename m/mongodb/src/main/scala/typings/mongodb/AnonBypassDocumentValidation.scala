package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBypassDocumentValidation extends js.Object {
  var bypassDocumentValidation: js.UndefOr[Boolean] = js.undefined
}

object AnonBypassDocumentValidation {
  @scala.inline
  def apply(bypassDocumentValidation: js.UndefOr[Boolean] = js.undefined): AnonBypassDocumentValidation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bypassDocumentValidation)) __obj.updateDynamic("bypassDocumentValidation")(bypassDocumentValidation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBypassDocumentValidation]
  }
}

