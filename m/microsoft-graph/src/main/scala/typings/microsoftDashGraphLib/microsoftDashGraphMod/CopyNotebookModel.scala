package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyNotebookModel extends js.Object {
  var createdBy: js.UndefOr[java.lang.String] = js.undefined
  var createdByIdentity: js.UndefOr[IdentitySet] = js.undefined
  var createdTime: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var isDefault: js.UndefOr[scala.Boolean] = js.undefined
  var isShared: js.UndefOr[scala.Boolean] = js.undefined
  var lastModifiedBy: js.UndefOr[java.lang.String] = js.undefined
  var lastModifiedByIdentity: js.UndefOr[IdentitySet] = js.undefined
  var lastModifiedTime: js.UndefOr[java.lang.String] = js.undefined
  var links: js.UndefOr[NotebookLinks] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var sectionGroupsUrl: js.UndefOr[java.lang.String] = js.undefined
  var sectionsUrl: js.UndefOr[java.lang.String] = js.undefined
  var self: js.UndefOr[java.lang.String] = js.undefined
  var userRole: js.UndefOr[OnenoteUserRole] = js.undefined
}

object CopyNotebookModel {
  @scala.inline
  def apply(
    createdBy: java.lang.String = null,
    createdByIdentity: IdentitySet = null,
    createdTime: java.lang.String = null,
    id: java.lang.String = null,
    isDefault: js.UndefOr[scala.Boolean] = js.undefined,
    isShared: js.UndefOr[scala.Boolean] = js.undefined,
    lastModifiedBy: java.lang.String = null,
    lastModifiedByIdentity: IdentitySet = null,
    lastModifiedTime: java.lang.String = null,
    links: NotebookLinks = null,
    name: java.lang.String = null,
    sectionGroupsUrl: java.lang.String = null,
    sectionsUrl: java.lang.String = null,
    self: java.lang.String = null,
    userRole: OnenoteUserRole = null
  ): CopyNotebookModel = {
    val __obj = js.Dynamic.literal()
    if (createdBy != null) __obj.updateDynamic("createdBy")(createdBy)
    if (createdByIdentity != null) __obj.updateDynamic("createdByIdentity")(createdByIdentity)
    if (createdTime != null) __obj.updateDynamic("createdTime")(createdTime)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isDefault)) __obj.updateDynamic("isDefault")(isDefault)
    if (!js.isUndefined(isShared)) __obj.updateDynamic("isShared")(isShared)
    if (lastModifiedBy != null) __obj.updateDynamic("lastModifiedBy")(lastModifiedBy)
    if (lastModifiedByIdentity != null) __obj.updateDynamic("lastModifiedByIdentity")(lastModifiedByIdentity)
    if (lastModifiedTime != null) __obj.updateDynamic("lastModifiedTime")(lastModifiedTime)
    if (links != null) __obj.updateDynamic("links")(links)
    if (name != null) __obj.updateDynamic("name")(name)
    if (sectionGroupsUrl != null) __obj.updateDynamic("sectionGroupsUrl")(sectionGroupsUrl)
    if (sectionsUrl != null) __obj.updateDynamic("sectionsUrl")(sectionsUrl)
    if (self != null) __obj.updateDynamic("self")(self)
    if (userRole != null) __obj.updateDynamic("userRole")(userRole)
    __obj.asInstanceOf[CopyNotebookModel]
  }
}

