package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContactFolder extends Entity {
  // The collection of child folders in the folder. Navigation property. Read-only. Nullable.
  var childFolders: js.UndefOr[js.Array[ContactFolder]] = js.native
  // The contacts in the folder. Navigation property. Read-only. Nullable.
  var contacts: js.UndefOr[js.Array[Contact]] = js.native
  // The folder's display name.
  var displayName: js.UndefOr[String] = js.native
  // The collection of multi-value extended properties defined for the contactFolder. Read-only. Nullable.
  var multiValueExtendedProperties: js.UndefOr[js.Array[MultiValueLegacyExtendedProperty]] = js.native
  // The ID of the folder's parent folder.
  var parentFolderId: js.UndefOr[String] = js.native
  // The collection of single-value extended properties defined for the contactFolder. Read-only. Nullable.
  var singleValueExtendedProperties: js.UndefOr[js.Array[SingleValueLegacyExtendedProperty]] = js.native
}

object ContactFolder {
  @scala.inline
  def apply(): ContactFolder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactFolder]
  }
  @scala.inline
  implicit class ContactFolderOps[Self <: ContactFolder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChildFoldersVarargs(value: ContactFolder*): Self = this.set("childFolders", js.Array(value :_*))
    @scala.inline
    def setChildFolders(value: js.Array[ContactFolder]): Self = this.set("childFolders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildFolders: Self = this.set("childFolders", js.undefined)
    @scala.inline
    def setContactsVarargs(value: Contact*): Self = this.set("contacts", js.Array(value :_*))
    @scala.inline
    def setContacts(value: js.Array[Contact]): Self = this.set("contacts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContacts: Self = this.set("contacts", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setMultiValueExtendedPropertiesVarargs(value: MultiValueLegacyExtendedProperty*): Self = this.set("multiValueExtendedProperties", js.Array(value :_*))
    @scala.inline
    def setMultiValueExtendedProperties(value: js.Array[MultiValueLegacyExtendedProperty]): Self = this.set("multiValueExtendedProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiValueExtendedProperties: Self = this.set("multiValueExtendedProperties", js.undefined)
    @scala.inline
    def setParentFolderId(value: String): Self = this.set("parentFolderId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentFolderId: Self = this.set("parentFolderId", js.undefined)
    @scala.inline
    def setSingleValueExtendedPropertiesVarargs(value: SingleValueLegacyExtendedProperty*): Self = this.set("singleValueExtendedProperties", js.Array(value :_*))
    @scala.inline
    def setSingleValueExtendedProperties(value: js.Array[SingleValueLegacyExtendedProperty]): Self = this.set("singleValueExtendedProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleValueExtendedProperties: Self = this.set("singleValueExtendedProperties", js.undefined)
  }
  
}

