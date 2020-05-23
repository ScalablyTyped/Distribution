package typings.preactI18n.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fields extends js.Object {
  var fields: js.UndefOr[js.Object] = js.undefined
  var id: String
  var plural: js.UndefOr[Double] = js.undefined
}

object Fields {
  @scala.inline
  def apply(id: String, fields: js.Object = null, plural: js.UndefOr[Double] = js.undefined): Fields = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(plural)) __obj.updateDynamic("plural")(plural.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fields]
  }
}

