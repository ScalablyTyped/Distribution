package typings
package pouchdbDashCoreLib.PouchDBNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var error: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var reason: js.UndefOr[java.lang.String] = js.undefined
  var rev: js.UndefOr[RevisionId] = js.undefined
  /**
    * HTTP Status Code during HTTP or HTTP-like operations
    */
  var status: js.UndefOr[scala.Double] = js.undefined
}

object Error {
  @scala.inline
  def apply(
    error: java.lang.String | scala.Boolean = null,
    id: java.lang.String = null,
    message: java.lang.String = null,
    name: java.lang.String = null,
    reason: java.lang.String = null,
    rev: RevisionId = null,
    status: scala.Int | scala.Double = null
  ): Error = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (message != null) __obj.updateDynamic("message")(message)
    if (name != null) __obj.updateDynamic("name")(name)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (rev != null) __obj.updateDynamic("rev")(rev)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

