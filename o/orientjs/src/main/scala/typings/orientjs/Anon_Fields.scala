package typings.orientjs

import typings.orientjs.orientjsMod.CustomField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fields extends js.Object {
  var fields: js.UndefOr[js.Array[CustomField]] = js.undefined
}

object Anon_Fields {
  @scala.inline
  def apply(fields: js.Array[CustomField] = null): Anon_Fields = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    __obj.asInstanceOf[Anon_Fields]
  }
}

