package typings.openpgp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Email extends js.Object {
  var email: String
  var rawBytes: js.UndefOr[Boolean] = js.undefined
}

object Email {
  @scala.inline
  def apply(email: String, rawBytes: js.UndefOr[Boolean] = js.undefined): Email = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    if (!js.isUndefined(rawBytes)) __obj.updateDynamic("rawBytes")(rawBytes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Email]
  }
}

