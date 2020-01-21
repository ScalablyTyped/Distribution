package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnenotePage extends OnenoteEntitySchemaObjectModel {
  // The page's HTML content.
  var content: js.UndefOr[js.Any] = js.undefined
  // The URL for the page's HTML content. Read-only.
  var contentUrl: js.UndefOr[String] = js.undefined
  // The unique identifier of the application that created the page. Read-only.
  var createdByAppId: js.UndefOr[String] = js.undefined
  /**
    * The date and time when the page was last modified. The timestamp represents date and time information using ISO 8601
    * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'. Read-only.
    */
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
  // The indentation level of the page. Read-only.
  var level: js.UndefOr[Double] = js.undefined
  /**
    * Links for opening the page. The oneNoteClientURL link opens the page in the OneNote native client if it 's installed.
    * The oneNoteWebUrl link opens the page in OneNote on the web. Read-only.
    */
  var links: js.UndefOr[PageLinks] = js.undefined
  // The order of the page within its parent section. Read-only.
  var order: js.UndefOr[Double] = js.undefined
  // The notebook that contains the page. Read-only.
  var parentNotebook: js.UndefOr[Notebook] = js.undefined
  // The section that contains the page. Read-only.
  var parentSection: js.UndefOr[OnenoteSection] = js.undefined
  // The title of the page.
  var title: js.UndefOr[String] = js.undefined
  var userTags: js.UndefOr[js.Array[String]] = js.undefined
}

object OnenotePage {
  @scala.inline
  def apply(
    content: js.Any = null,
    contentUrl: String = null,
    createdByAppId: String = null,
    createdDateTime: String = null,
    id: String = null,
    lastModifiedDateTime: String = null,
    level: Int | Double = null,
    links: PageLinks = null,
    order: Int | Double = null,
    parentNotebook: Notebook = null,
    parentSection: OnenoteSection = null,
    self: String = null,
    title: String = null,
    userTags: js.Array[String] = null
  ): OnenotePage = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentUrl != null) __obj.updateDynamic("contentUrl")(contentUrl.asInstanceOf[js.Any])
    if (createdByAppId != null) __obj.updateDynamic("createdByAppId")(createdByAppId.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (parentNotebook != null) __obj.updateDynamic("parentNotebook")(parentNotebook.asInstanceOf[js.Any])
    if (parentSection != null) __obj.updateDynamic("parentSection")(parentSection.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (userTags != null) __obj.updateDynamic("userTags")(userTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnenotePage]
  }
}

