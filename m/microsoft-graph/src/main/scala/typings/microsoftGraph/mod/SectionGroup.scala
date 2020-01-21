package typings.microsoftGraph.mod

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
  var sectionGroupsUrl: js.UndefOr[String] = js.undefined
  // The sections in the section group. Read-only. Nullable.
  var sections: js.UndefOr[js.Array[OnenoteSection]] = js.undefined
  // The URL for the sections navigation property, which returns all the sections in the section group. Read-only.
  var sectionsUrl: js.UndefOr[String] = js.undefined
}

object SectionGroup {
  @scala.inline
  def apply(
    createdBy: IdentitySet = null,
    createdDateTime: String = null,
    displayName: String = null,
    id: String = null,
    lastModifiedBy: IdentitySet = null,
    lastModifiedDateTime: String = null,
    parentNotebook: Notebook = null,
    parentSectionGroup: SectionGroup = null,
    sectionGroups: js.Array[SectionGroup] = null,
    sectionGroupsUrl: String = null,
    sections: js.Array[OnenoteSection] = null,
    sectionsUrl: String = null,
    self: String = null
  ): SectionGroup = {
    val __obj = js.Dynamic.literal()
    if (createdBy != null) __obj.updateDynamic("createdBy")(createdBy.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastModifiedBy != null) __obj.updateDynamic("lastModifiedBy")(lastModifiedBy.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (parentNotebook != null) __obj.updateDynamic("parentNotebook")(parentNotebook.asInstanceOf[js.Any])
    if (parentSectionGroup != null) __obj.updateDynamic("parentSectionGroup")(parentSectionGroup.asInstanceOf[js.Any])
    if (sectionGroups != null) __obj.updateDynamic("sectionGroups")(sectionGroups.asInstanceOf[js.Any])
    if (sectionGroupsUrl != null) __obj.updateDynamic("sectionGroupsUrl")(sectionGroupsUrl.asInstanceOf[js.Any])
    if (sections != null) __obj.updateDynamic("sections")(sections.asInstanceOf[js.Any])
    if (sectionsUrl != null) __obj.updateDynamic("sectionsUrl")(sectionsUrl.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionGroup]
  }
}

