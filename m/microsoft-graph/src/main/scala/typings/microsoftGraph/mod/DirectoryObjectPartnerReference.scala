package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryObjectPartnerReference extends DirectoryObject {
  // Description of the object returned. Read-only.
  var description: js.UndefOr[String] = js.undefined
  // Name of directory object being returned, like group or application. Read-only.
  var displayName: js.UndefOr[String] = js.undefined
  // The tenant identifier for the partner tenant. Read-only.
  var externalPartnerTenantId: js.UndefOr[String] = js.undefined
  // The type of the referenced object in the partner tenant. Read-only.
  var objectType: js.UndefOr[String] = js.undefined
}

object DirectoryObjectPartnerReference {
  @scala.inline
  def apply(
    deletedDateTime: String = null,
    description: String = null,
    displayName: String = null,
    externalPartnerTenantId: String = null,
    id: String = null,
    objectType: String = null
  ): DirectoryObjectPartnerReference = {
    val __obj = js.Dynamic.literal()
    if (deletedDateTime != null) __obj.updateDynamic("deletedDateTime")(deletedDateTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (externalPartnerTenantId != null) __obj.updateDynamic("externalPartnerTenantId")(externalPartnerTenantId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (objectType != null) __obj.updateDynamic("objectType")(objectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryObjectPartnerReference]
  }
}

