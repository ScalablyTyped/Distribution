package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attachment extends Entity {
  // The MIME type.
  var contentType: js.UndefOr[String] = js.undefined
  // true if the attachment is an inline attachment; otherwise, false.
  var isInline: js.UndefOr[Boolean] = js.undefined
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
  // The attachment's file name.
  var name: js.UndefOr[String] = js.undefined
  // The length of the attachment in bytes.
  var size: js.UndefOr[Double] = js.undefined
}

object Attachment {
  @scala.inline
  def apply(
    contentType: String = null,
    id: String = null,
    isInline: js.UndefOr[Boolean] = js.undefined,
    lastModifiedDateTime: String = null,
    name: String = null,
    size: Int | Double = null
  ): Attachment = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isInline)) __obj.updateDynamic("isInline")(isInline)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (name != null) __obj.updateDynamic("name")(name)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachment]
  }
}

