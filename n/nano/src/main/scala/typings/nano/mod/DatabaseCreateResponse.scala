package typings.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// -------------------------------------
// Database scope request and response
// -------------------------------------
// http://docs.couchdb.org/en/latest/api/database/common.html#put--db
trait DatabaseCreateResponse extends js.Object {
  // Error type. Available if response code is 4xx
  var error: js.UndefOr[String] = js.undefined
  // Operation status. Available in case of success
  var ok: js.UndefOr[Boolean] = js.undefined
  // Error description. Available if response code is 4xx
  var reason: js.UndefOr[String] = js.undefined
}

object DatabaseCreateResponse {
  @scala.inline
  def apply(error: String = null, ok: js.UndefOr[Boolean] = js.undefined, reason: String = null): DatabaseCreateResponse = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(ok)) __obj.updateDynamic("ok")(ok.get.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseCreateResponse]
  }
}

