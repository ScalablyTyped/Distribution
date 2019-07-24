package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnenoteSection extends OnenoteEntityHierarchyModel {
  // Indicates whether this is the user's default section. Read-only.
  var isDefault: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Links for opening the section. The oneNoteClientURL link opens the section in the OneNote native client if it's
    * installed. The oneNoteWebURL link opens the section in OneNote on the web.
    */
  var links: js.UndefOr[SectionLinks] = js.undefined
  // The collection of pages in the section. Read-only. Nullable.
  var pages: js.UndefOr[js.Array[OnenotePage]] = js.undefined
  // The pages endpoint where you can get details for all the pages in the section. Read-only.
  var pagesUrl: js.UndefOr[java.lang.String] = js.undefined
  // The notebook that contains the section. Read-only.
  var parentNotebook: js.UndefOr[Notebook] = js.undefined
  // The section group that contains the section. Read-only.
  var parentSectionGroup: js.UndefOr[SectionGroup] = js.undefined
}

object OnenoteSection {
  @scala.inline
  def apply(
    createdBy: IdentitySet = null,
    createdDateTime: java.lang.String = null,
    displayName: java.lang.String = null,
    id: java.lang.String = null,
    isDefault: js.UndefOr[scala.Boolean] = js.undefined,
    lastModifiedBy: IdentitySet = null,
    lastModifiedDateTime: java.lang.String = null,
    links: SectionLinks = null,
    pages: js.Array[OnenotePage] = null,
    pagesUrl: java.lang.String = null,
    parentNotebook: Notebook = null,
    parentSectionGroup: SectionGroup = null,
    self: java.lang.String = null
  ): OnenoteSection = {
    val __obj = js.Dynamic.literal()
    if (createdBy != null) __obj.updateDynamic("createdBy")(createdBy)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isDefault)) __obj.updateDynamic("isDefault")(isDefault)
    if (lastModifiedBy != null) __obj.updateDynamic("lastModifiedBy")(lastModifiedBy)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (links != null) __obj.updateDynamic("links")(links)
    if (pages != null) __obj.updateDynamic("pages")(pages)
    if (pagesUrl != null) __obj.updateDynamic("pagesUrl")(pagesUrl)
    if (parentNotebook != null) __obj.updateDynamic("parentNotebook")(parentNotebook)
    if (parentSectionGroup != null) __obj.updateDynamic("parentSectionGroup")(parentSectionGroup)
    if (self != null) __obj.updateDynamic("self")(self)
    __obj.asInstanceOf[OnenoteSection]
  }
}

