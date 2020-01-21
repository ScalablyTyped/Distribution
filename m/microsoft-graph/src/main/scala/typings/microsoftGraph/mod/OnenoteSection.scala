package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnenoteSection extends OnenoteEntityHierarchyModel {
  // Indicates whether this is the user's default section. Read-only.
  var isDefault: js.UndefOr[Boolean] = js.undefined
  /**
    * Links for opening the section. The oneNoteClientURL link opens the section in the OneNote native client if it's
    * installed. The oneNoteWebURL link opens the section in OneNote on the web.
    */
  var links: js.UndefOr[SectionLinks] = js.undefined
  // The collection of pages in the section. Read-only. Nullable.
  var pages: js.UndefOr[js.Array[OnenotePage]] = js.undefined
  // The pages endpoint where you can get details for all the pages in the section. Read-only.
  var pagesUrl: js.UndefOr[String] = js.undefined
  // The notebook that contains the section. Read-only.
  var parentNotebook: js.UndefOr[Notebook] = js.undefined
  // The section group that contains the section. Read-only.
  var parentSectionGroup: js.UndefOr[SectionGroup] = js.undefined
}

object OnenoteSection {
  @scala.inline
  def apply(
    createdBy: IdentitySet = null,
    createdDateTime: String = null,
    displayName: String = null,
    id: String = null,
    isDefault: js.UndefOr[Boolean] = js.undefined,
    lastModifiedBy: IdentitySet = null,
    lastModifiedDateTime: String = null,
    links: SectionLinks = null,
    pages: js.Array[OnenotePage] = null,
    pagesUrl: String = null,
    parentNotebook: Notebook = null,
    parentSectionGroup: SectionGroup = null,
    self: String = null
  ): OnenoteSection = {
    val __obj = js.Dynamic.literal()
    if (createdBy != null) __obj.updateDynamic("createdBy")(createdBy.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isDefault)) __obj.updateDynamic("isDefault")(isDefault.asInstanceOf[js.Any])
    if (lastModifiedBy != null) __obj.updateDynamic("lastModifiedBy")(lastModifiedBy.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (pages != null) __obj.updateDynamic("pages")(pages.asInstanceOf[js.Any])
    if (pagesUrl != null) __obj.updateDynamic("pagesUrl")(pagesUrl.asInstanceOf[js.Any])
    if (parentNotebook != null) __obj.updateDynamic("parentNotebook")(parentNotebook.asInstanceOf[js.Any])
    if (parentSectionGroup != null) __obj.updateDynamic("parentSectionGroup")(parentSectionGroup.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnenoteSection]
  }
}

