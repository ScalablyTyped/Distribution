package typings.microsoftGraph.mod

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
    contentBytes: js.UndefOr[Double] = js.undefined,
    contentId: String = null,
    contentLocation: String = null,
    contentType: String = null,
    id: String = null,
    isInline: js.UndefOr[Boolean] = js.undefined,
    lastModifiedDateTime: String = null,
    name: String = null,
    size: js.UndefOr[Double] = js.undefined
  ): FileAttachment = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contentBytes)) __obj.updateDynamic("contentBytes")(contentBytes.get.asInstanceOf[js.Any])
    if (contentId != null) __obj.updateDynamic("contentId")(contentId.asInstanceOf[js.Any])
    if (contentLocation != null) __obj.updateDynamic("contentLocation")(contentLocation.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isInline)) __obj.updateDynamic("isInline")(isInline.get.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileAttachment]
  }
}

