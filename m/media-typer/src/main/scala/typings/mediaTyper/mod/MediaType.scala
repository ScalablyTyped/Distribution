package typings.mediaTyper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaType extends js.Object {
  var subtype: String
  var suffix: js.UndefOr[String] = js.undefined
  var `type`: String
}

object MediaType {
  @scala.inline
  def apply(subtype: String, `type`: String, suffix: String = null): MediaType = {
    val __obj = js.Dynamic.literal(subtype = subtype.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaType]
  }
}

