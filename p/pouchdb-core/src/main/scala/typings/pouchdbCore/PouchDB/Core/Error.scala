package typings.pouchdbCore.PouchDB.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var error: js.UndefOr[String | Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var reason: js.UndefOr[String] = js.undefined
  var rev: js.UndefOr[RevisionId] = js.undefined
  /**
    * HTTP Status Code during HTTP or HTTP-like operations
    */
  var status: js.UndefOr[Double] = js.undefined
}

object Error {
  @scala.inline
  def apply(
    error: String | Boolean = null,
    id: String = null,
    message: String = null,
    name: String = null,
    reason: String = null,
    rev: RevisionId = null,
    status: js.UndefOr[Double] = js.undefined
  ): Error = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (rev != null) __obj.updateDynamic("rev")(rev.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

