package typings.passport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var `type`: js.UndefOr[String] = js.undefined
  var value: String
}

object AnonType {
  @scala.inline
  def apply(value: String, `type`: String = null): AnonType = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

