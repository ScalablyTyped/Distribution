package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notebook extends OnenoteEntityHierarchyModel {
  // Indicates whether this is the user's default notebook. Read-only.
  var isDefault: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether the notebook is shared. If true, the contents of the notebook can be seen by people other than the
    * owner. Read-only.
    */
  var isShared: js.UndefOr[Boolean] = js.undefined
  /**
    * Links for opening the notebook. The oneNoteClientURL link opens the notebook in the OneNote native client if it's
    * installed. The oneNoteWebURL link opens the notebook in OneNote on the web.
    */
  var links: js.UndefOr[NotebookLinks] = js.undefined
  // The section groups in the notebook. Read-only. Nullable.
  var sectionGroups: js.UndefOr[js.Array[SectionGroup]] = js.undefined
  // The URL for the sectionGroups navigation property, which returns all the section groups in the notebook. Read-only.
  var sectionGroupsUrl: js.UndefOr[String] = js.undefined
  // The sections in the notebook. Read-only. Nullable.
  var sections: js.UndefOr[js.Array[OnenoteSection]] = js.undefined
  // The URL for the sections navigation property, which returns all the sections in the notebook. Read-only.
  var sectionsUrl: js.UndefOr[String] = js.undefined
  /**
    * Possible values are: Owner, Contributor, Reader, None. Owner represents owner-level access to the notebook. Contributor
    * represents read/write access to the notebook. Reader represents read-only access to the notebook. Read-only.
    */
  var userRole: js.UndefOr[OnenoteUserRole] = js.undefined
}

object Notebook {
  @scala.inline
  def apply(
    createdBy: IdentitySet = null,
    createdDateTime: String = null,
    displayName: String = null,
    id: String = null,
    isDefault: js.UndefOr[Boolean] = js.undefined,
    isShared: js.UndefOr[Boolean] = js.undefined,
    lastModifiedBy: IdentitySet = null,
    lastModifiedDateTime: String = null,
    links: NotebookLinks = null,
    sectionGroups: js.Array[SectionGroup] = null,
    sectionGroupsUrl: String = null,
    sections: js.Array[OnenoteSection] = null,
    sectionsUrl: String = null,
    self: String = null,
    userRole: OnenoteUserRole = null
  ): Notebook = {
    val __obj = js.Dynamic.literal()
    if (createdBy != null) __obj.updateDynamic("createdBy")(createdBy.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isDefault)) __obj.updateDynamic("isDefault")(isDefault.asInstanceOf[js.Any])
    if (!js.isUndefined(isShared)) __obj.updateDynamic("isShared")(isShared.asInstanceOf[js.Any])
    if (lastModifiedBy != null) __obj.updateDynamic("lastModifiedBy")(lastModifiedBy.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (sectionGroups != null) __obj.updateDynamic("sectionGroups")(sectionGroups.asInstanceOf[js.Any])
    if (sectionGroupsUrl != null) __obj.updateDynamic("sectionGroupsUrl")(sectionGroupsUrl.asInstanceOf[js.Any])
    if (sections != null) __obj.updateDynamic("sections")(sections.asInstanceOf[js.Any])
    if (sectionsUrl != null) __obj.updateDynamic("sectionsUrl")(sectionsUrl.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (userRole != null) __obj.updateDynamic("userRole")(userRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notebook]
  }
}

