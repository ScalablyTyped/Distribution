package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileAttachment extends Attachment {
  // The base64-encoded contents of the file.
  var contentBytes: js.UndefOr[Double] = js.undefined
  // The ID of the attachment in the Exchange store.
  var contentId: js.UndefOr[String] = js.undefined
  // Do not use this property as it is not supported.
  var contentLocation: js.UndefOr[String] = js.undefined
}

object FileAttachment {
  @scala.inline
  def apply(
    contentBytes: Int | Double = null,
    contentId: String = null,
    contentLocation: String = null,
    contentType: String = null,
    id: String = null,
    isInline: js.UndefOr[Boolean] = js.undefined,
    lastModifiedDateTime: String = null,
    name: String = null,
    size: Int | Double = null
  ): FileAttachment = {
    val __obj = js.Dynamic.literal()
    if (contentBytes != null) __obj.updateDynamic("contentBytes")(contentBytes.asInstanceOf[js.Any])
    if (contentId != null) __obj.updateDynamic("contentId")(contentId.asInstanceOf[js.Any])
    if (contentLocation != null) __obj.updateDynamic("contentLocation")(contentLocation.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isInline)) __obj.updateDynamic("isInline")(isInline.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileAttachment]
  }
}

