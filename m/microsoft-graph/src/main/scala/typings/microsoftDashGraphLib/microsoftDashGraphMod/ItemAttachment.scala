package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemAttachment extends Attachment {
  /** The attached message or event. Navigation property. */
  var item: js.UndefOr[OutlookItem] = js.undefined
}

object ItemAttachment {
  @scala.inline
  def apply(
    contentType: java.lang.String = null,
    id: java.lang.String = null,
    isInline: js.UndefOr[scala.Boolean] = js.undefined,
    item: OutlookItem = null,
    lastModifiedDateTime: java.lang.String = null,
    name: java.lang.String = null,
    size: scala.Int | scala.Double = null
  ): ItemAttachment = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isInline)) __obj.updateDynamic("isInline")(isInline)
    if (item != null) __obj.updateDynamic("item")(item)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (name != null) __obj.updateDynamic("name")(name)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemAttachment]
  }
}

