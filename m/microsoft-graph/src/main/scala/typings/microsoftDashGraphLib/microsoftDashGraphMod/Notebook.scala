package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notebook extends OnenoteEntityHierarchyModel {
  /** Indicates whether this is the user's default notebook. Read-only. */
  var isDefault: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether the notebook is shared. If true, the contents of the notebook can be seen by people other than the owner. Read-only. */
  var isShared: js.UndefOr[scala.Boolean] = js.undefined
  /** Links for opening the notebook. The oneNoteClientURL link opens the notebook in the OneNote native client if it's installed. The oneNoteWebURL link opens the notebook in OneNote Online. */
  var links: js.UndefOr[NotebookLinks] = js.undefined
  /** The section groups in the notebook. Read-only. Nullable. */
  var sectionGroups: js.UndefOr[js.Array[SectionGroup]] = js.undefined
  /** The URL for the sectionGroups navigation property, which returns all the section groups in the notebook. Read-only. */
  var sectionGroupsUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The sections in the notebook. Read-only. Nullable. */
  var sections: js.UndefOr[js.Array[OnenoteSection]] = js.undefined
  /** The URL for the sections navigation property, which returns all the sections in the notebook. Read-only. */
  var sectionsUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Possible values are: Owner, Contributor, Reader, None. Owner represents owner-level access to the notebook.
    * Contributor represents read/write access to the notebook. Reader represents read-only access to the notebook. Read-only.
    */
  var userRole: js.UndefOr[OnenoteUserRole] = js.undefined
}

object Notebook {
  @scala.inline
  def apply(
    createdBy: IdentitySet = null,
    createdDateTime: java.lang.String = null,
    displayName: java.lang.String = null,
    id: java.lang.String = null,
    isDefault: js.UndefOr[scala.Boolean] = js.undefined,
    isShared: js.UndefOr[scala.Boolean] = js.undefined,
    lastModifiedBy: IdentitySet = null,
    lastModifiedDateTime: java.lang.String = null,
    links: NotebookLinks = null,
    sectionGroups: js.Array[SectionGroup] = null,
    sectionGroupsUrl: java.lang.String = null,
    sections: js.Array[OnenoteSection] = null,
    sectionsUrl: java.lang.String = null,
    self: java.lang.String = null,
    userRole: OnenoteUserRole = null
  ): Notebook = {
    val __obj = js.Dynamic.literal()
    if (createdBy != null) __obj.updateDynamic("createdBy")(createdBy)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isDefault)) __obj.updateDynamic("isDefault")(isDefault)
    if (!js.isUndefined(isShared)) __obj.updateDynamic("isShared")(isShared)
    if (lastModifiedBy != null) __obj.updateDynamic("lastModifiedBy")(lastModifiedBy)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (links != null) __obj.updateDynamic("links")(links)
    if (sectionGroups != null) __obj.updateDynamic("sectionGroups")(sectionGroups)
    if (sectionGroupsUrl != null) __obj.updateDynamic("sectionGroupsUrl")(sectionGroupsUrl)
    if (sections != null) __obj.updateDynamic("sections")(sections)
    if (sectionsUrl != null) __obj.updateDynamic("sectionsUrl")(sectionsUrl)
    if (self != null) __obj.updateDynamic("self")(self)
    if (userRole != null) __obj.updateDynamic("userRole")(userRole)
    __obj.asInstanceOf[Notebook]
  }
}

