package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnenotePage extends OnenoteEntitySchemaObjectModel {
  // The page's HTML content.
  var content: js.UndefOr[js.Any] = js.undefined
  // The URL for the page's HTML content. Read-only.
  var contentUrl: js.UndefOr[java.lang.String] = js.undefined
  // The unique identifier of the application that created the page. Read-only.
  var createdByAppId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The date and time when the page was last modified. The timestamp represents date and time information using ISO 8601
    * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'. Read-only.
    */
  var lastModifiedDateTime: js.UndefOr[java.lang.String] = js.undefined
  // The indentation level of the page. Read-only.
  var level: js.UndefOr[scala.Double] = js.undefined
  /**
    * Links for opening the page. The oneNoteClientURL link opens the page in the OneNote native client if it 's installed.
    * The oneNoteWebUrl link opens the page in OneNote on the web. Read-only.
    */
  var links: js.UndefOr[PageLinks] = js.undefined
  // The order of the page within its parent section. Read-only.
  var order: js.UndefOr[scala.Double] = js.undefined
  // The notebook that contains the page. Read-only.
  var parentNotebook: js.UndefOr[Notebook] = js.undefined
  // The section that contains the page. Read-only.
  var parentSection: js.UndefOr[OnenoteSection] = js.undefined
  // The title of the page.
  var title: js.UndefOr[java.lang.String] = js.undefined
  var userTags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object OnenotePage {
  @scala.inline
  def apply(
    content: js.Any = null,
    contentUrl: java.lang.String = null,
    createdByAppId: java.lang.String = null,
    createdDateTime: java.lang.String = null,
    id: java.lang.String = null,
    lastModifiedDateTime: java.lang.String = null,
    level: scala.Int | scala.Double = null,
    links: PageLinks = null,
    order: scala.Int | scala.Double = null,
    parentNotebook: Notebook = null,
    parentSection: OnenoteSection = null,
    self: java.lang.String = null,
    title: java.lang.String = null,
    userTags: js.Array[java.lang.String] = null
  ): OnenotePage = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (contentUrl != null) __obj.updateDynamic("contentUrl")(contentUrl)
    if (createdByAppId != null) __obj.updateDynamic("createdByAppId")(createdByAppId)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links)
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (parentNotebook != null) __obj.updateDynamic("parentNotebook")(parentNotebook)
    if (parentSection != null) __obj.updateDynamic("parentSection")(parentSection)
    if (self != null) __obj.updateDynamic("self")(self)
    if (title != null) __obj.updateDynamic("title")(title)
    if (userTags != null) __obj.updateDynamic("userTags")(userTags)
    __obj.asInstanceOf[OnenotePage]
  }
}

