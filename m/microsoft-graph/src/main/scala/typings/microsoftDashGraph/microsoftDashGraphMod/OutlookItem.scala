package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutlookItem extends Entity {
  // The categories associated with the item
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Identifies the version of the item. Every time the item is changed, changeKey changes as well. This allows Exchange to
    * apply changes to the correct version of the object. Read-only.
    */
  var changeKey: js.UndefOr[String] = js.undefined
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var createdDateTime: js.UndefOr[String] = js.undefined
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
}

object OutlookItem {
  @scala.inline
  def apply(
    categories: js.Array[String] = null,
    changeKey: String = null,
    createdDateTime: String = null,
    id: String = null,
    lastModifiedDateTime: String = null
  ): OutlookItem = {
    val __obj = js.Dynamic.literal()
    if (categories != null) __obj.updateDynamic("categories")(categories)
    if (changeKey != null) __obj.updateDynamic("changeKey")(changeKey)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    __obj.asInstanceOf[OutlookItem]
  }
}

