package typings
package mongooseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Message extends js.Object {
  var message: java.lang.String
  var path: js.UndefOr[java.lang.String] = js.undefined
  var reason: js.UndefOr[js.Any] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object Anon_Message {
  @scala.inline
  def apply(
    message: java.lang.String,
    path: java.lang.String = null,
    reason: js.Any = null,
    `type`: java.lang.String = null,
    value: js.Any = null
  ): Anon_Message = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    if (path != null) __obj.updateDynamic("path")(path)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Message]
  }
}

