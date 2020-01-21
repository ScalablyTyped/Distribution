package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyNotebookModel extends js.Object {
  var createdBy: js.UndefOr[String] = js.undefined
  var createdByIdentity: js.UndefOr[IdentitySet] = js.undefined
  var createdTime: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var isDefault: js.UndefOr[Boolean] = js.undefined
  var isShared: js.UndefOr[Boolean] = js.undefined
  var lastModifiedBy: js.UndefOr[String] = js.undefined
  var lastModifiedByIdentity: js.UndefOr[IdentitySet] = js.undefined
  var lastModifiedTime: js.UndefOr[String] = js.undefined
  var links: js.UndefOr[NotebookLinks] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var sectionGroupsUrl: js.UndefOr[String] = js.undefined
  var sectionsUrl: js.UndefOr[String] = js.undefined
  var self: js.UndefOr[String] = js.undefined
  var userRole: js.UndefOr[OnenoteUserRole] = js.undefined
}

object CopyNotebookModel {
  @scala.inline
  def apply(
    createdBy: String = null,
    createdByIdentity: IdentitySet = null,
    createdTime: String = null,
    id: String = null,
    isDefault: js.UndefOr[Boolean] = js.undefined,
    isShared: js.UndefOr[Boolean] = js.undefined,
    lastModifiedBy: String = null,
    lastModifiedByIdentity: IdentitySet = null,
    lastModifiedTime: String = null,
    links: NotebookLinks = null,
    name: String = null,
    sectionGroupsUrl: String = null,
    sectionsUrl: String = null,
    self: String = null,
    userRole: OnenoteUserRole = null
  ): CopyNotebookModel = {
    val __obj = js.Dynamic.literal()
    if (createdBy != null) __obj.updateDynamic("createdBy")(createdBy.asInstanceOf[js.Any])
    if (createdByIdentity != null) __obj.updateDynamic("createdByIdentity")(createdByIdentity.asInstanceOf[js.Any])
    if (createdTime != null) __obj.updateDynamic("createdTime")(createdTime.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isDefault)) __obj.updateDynamic("isDefault")(isDefault.asInstanceOf[js.Any])
    if (!js.isUndefined(isShared)) __obj.updateDynamic("isShared")(isShared.asInstanceOf[js.Any])
    if (lastModifiedBy != null) __obj.updateDynamic("lastModifiedBy")(lastModifiedBy.asInstanceOf[js.Any])
    if (lastModifiedByIdentity != null) __obj.updateDynamic("lastModifiedByIdentity")(lastModifiedByIdentity.asInstanceOf[js.Any])
    if (lastModifiedTime != null) __obj.updateDynamic("lastModifiedTime")(lastModifiedTime.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (sectionGroupsUrl != null) __obj.updateDynamic("sectionGroupsUrl")(sectionGroupsUrl.asInstanceOf[js.Any])
    if (sectionsUrl != null) __obj.updateDynamic("sectionsUrl")(sectionsUrl.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (userRole != null) __obj.updateDynamic("userRole")(userRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyNotebookModel]
  }
}

