package typings.preactI18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFields extends js.Object {
  var fields: js.UndefOr[js.Object] = js.undefined
  var id: String
  var plural: js.UndefOr[Double] = js.undefined
}

object AnonFields {
  @scala.inline
  def apply(id: String, fields: js.Object = null, plural: Int | Double = null): AnonFields = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (plural != null) __obj.updateDynamic("plural")(plural.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFields]
  }
}

