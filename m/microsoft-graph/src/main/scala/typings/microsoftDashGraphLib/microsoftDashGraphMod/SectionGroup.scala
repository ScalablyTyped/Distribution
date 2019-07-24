package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SectionGroup extends OnenoteEntityHierarchyModel {
  // The notebook that contains the section group. Read-only.
  var parentNotebook: js.UndefOr[Notebook] = js.undefined
  // The section group that contains the section group. Read-only.
  var parentSectionGroup: js.UndefOr[SectionGroup] = js.undefined
  // The section groups in the section. Read-only. Nullable.
  var sectionGroups: js.UndefOr[js.Array[SectionGroup]] = js.undefined
  /**
    * The URL for the sectionGroups navigation property, which returns all the section groups in the section group.
    * Read-only.
    */
  var sectionGroupsUrl: js.UndefOr[java.lang.String] = js.undefined
  // The sections in the section group. Read-only. Nullable.
  var sections: js.UndefOr[js.Array[OnenoteSection]] = js.undefined
  // The URL for the sections navigation property, which returns all the sections in the section group. Read-only.
  var sectionsUrl: js.UndefOr[java.lang.String] = js.undefined
}

object SectionGroup {
  @scala.inline
  def apply(
    createdBy: IdentitySet = null,
    createdDateTime: java.lang.String = null,
    displayName: java.lang.String = null,
    id: java.lang.String = null,
    lastModifiedBy: IdentitySet = null,
    lastModifiedDateTime: java.lang.String = null,
    parentNotebook: Notebook = null,
    parentSectionGroup: SectionGroup = null,
    sectionGroups: js.Array[SectionGroup] = null,
    sectionGroupsUrl: java.lang.String = null,
    sections: js.Array[OnenoteSection] = null,
    sectionsUrl: java.lang.String = null,
    self: java.lang.String = null
  ): SectionGroup = {
    val __obj = js.Dynamic.literal()
    if (createdBy != null) __obj.updateDynamic("createdBy")(createdBy)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastModifiedBy != null) __obj.updateDynamic("lastModifiedBy")(lastModifiedBy)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (parentNotebook != null) __obj.updateDynamic("parentNotebook")(parentNotebook)
    if (parentSectionGroup != null) __obj.updateDynamic("parentSectionGroup")(parentSectionGroup)
    if (sectionGroups != null) __obj.updateDynamic("sectionGroups")(sectionGroups)
    if (sectionGroupsUrl != null) __obj.updateDynamic("sectionGroupsUrl")(sectionGroupsUrl)
    if (sections != null) __obj.updateDynamic("sections")(sections)
    if (sectionsUrl != null) __obj.updateDynamic("sectionsUrl")(sectionsUrl)
    if (self != null) __obj.updateDynamic("self")(self)
    __obj.asInstanceOf[SectionGroup]
  }
}

