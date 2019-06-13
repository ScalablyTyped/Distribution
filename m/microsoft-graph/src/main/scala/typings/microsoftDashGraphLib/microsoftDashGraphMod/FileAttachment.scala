package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileAttachment extends Attachment {
  /** The base64-encoded contents of the file. */
  var contentBytes: js.UndefOr[scala.Double] = js.undefined
  /** The ID of the attachment in the Exchange store. */
  var contentId: js.UndefOr[java.lang.String] = js.undefined
  /** Do not use this property as it is not supported. */
  var contentLocation: js.UndefOr[java.lang.String] = js.undefined
}

object FileAttachment {
  @scala.inline
  def apply(
    contentBytes: scala.Int | scala.Double = null,
    contentId: java.lang.String = null,
    contentLocation: java.lang.String = null,
    contentType: java.lang.String = null,
    id: java.lang.String = null,
    isInline: js.UndefOr[scala.Boolean] = js.undefined,
    lastModifiedDateTime: java.lang.String = null,
    name: java.lang.String = null,
    size: scala.Int | scala.Double = null
  ): FileAttachment = {
    val __obj = js.Dynamic.literal()
    if (contentBytes != null) __obj.updateDynamic("contentBytes")(contentBytes.asInstanceOf[js.Any])
    if (contentId != null) __obj.updateDynamic("contentId")(contentId)
    if (contentLocation != null) __obj.updateDynamic("contentLocation")(contentLocation)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isInline)) __obj.updateDynamic("isInline")(isInline)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (name != null) __obj.updateDynamic("name")(name)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileAttachment]
  }
}

