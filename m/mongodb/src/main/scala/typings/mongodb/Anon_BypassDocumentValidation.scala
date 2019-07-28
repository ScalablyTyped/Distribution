package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BypassDocumentValidation extends js.Object {
  var bypassDocumentValidation: js.UndefOr[Boolean] = js.undefined
}

object Anon_BypassDocumentValidation {
  @scala.inline
  def apply(bypassDocumentValidation: js.UndefOr[Boolean] = js.undefined): Anon_BypassDocumentValidation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bypassDocumentValidation)) __obj.updateDynamic("bypassDocumentValidation")(bypassDocumentValidation)
    __obj.asInstanceOf[Anon_BypassDocumentValidation]
  }
}

