package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemAttachment extends Attachment {
  // The attached message or event. Navigation property.
  var item: js.UndefOr[OutlookItem] = js.undefined
}

object ItemAttachment {
  @scala.inline
  def apply(
    contentType: String = null,
    id: String = null,
    isInline: js.UndefOr[Boolean] = js.undefined,
    item: OutlookItem = null,
    lastModifiedDateTime: String = null,
    name: String = null,
    size: Int | Double = null
  ): ItemAttachment = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isInline)) __obj.updateDynamic("isInline")(isInline.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemAttachment]
  }
}

