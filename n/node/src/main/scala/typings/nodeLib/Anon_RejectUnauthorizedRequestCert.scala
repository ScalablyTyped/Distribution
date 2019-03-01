package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RejectUnauthorizedRequestCert extends js.Object {
  var rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
  var requestCert: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_RejectUnauthorizedRequestCert {
  @scala.inline
  def apply(
    rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined,
    requestCert: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_RejectUnauthorizedRequestCert = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (!js.isUndefined(requestCert)) __obj.updateDynamic("requestCert")(requestCert)
    __obj.asInstanceOf[Anon_RejectUnauthorizedRequestCert]
  }
}

