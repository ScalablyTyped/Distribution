package typings.mediaTyper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaType extends js.Object {
  /**
    * The subtype of the media type (always lower case). Example: `svg`
    */
  var subtype: String
  /**
    * The suffix of the media type (always lower case). Example: `xml`
    */
  var suffix: js.UndefOr[String] = js.undefined
  /**
    * The type of the media type (always lower case). Example: `image`
    */
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

