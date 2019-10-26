package typings.preactDashI18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fields extends js.Object {
  var fields: js.UndefOr[js.Object] = js.undefined
  var id: String
  var plural: js.UndefOr[Double] = js.undefined
}

object Anon_Fields {
  @scala.inline
  def apply(id: String, fields: js.Object = null, plural: Int | Double = null): Anon_Fields = {
    val __obj = js.Dynamic.literal(id = id)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (plural != null) __obj.updateDynamic("plural")(plural.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Fields]
  }
}

