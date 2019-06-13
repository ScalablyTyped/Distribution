package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryObjectPartnerReference extends DirectoryObject {
  /** Description of the object returned. Read-only. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Name of directory object being returned, like group or application. Read-only. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** The tenant identifier for the partner tenant. Read-only. */
  var externalPartnerTenantId: js.UndefOr[java.lang.String] = js.undefined
  /** The type of the referenced object in the partner tenant. Read-only. */
  var objectType: js.UndefOr[java.lang.String] = js.undefined
}

object DirectoryObjectPartnerReference {
  @scala.inline
  def apply(
    deletedDateTime: java.lang.String = null,
    description: java.lang.String = null,
    displayName: java.lang.String = null,
    externalPartnerTenantId: java.lang.String = null,
    id: java.lang.String = null,
    objectType: java.lang.String = null
  ): DirectoryObjectPartnerReference = {
    val __obj = js.Dynamic.literal()
    if (deletedDateTime != null) __obj.updateDynamic("deletedDateTime")(deletedDateTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (externalPartnerTenantId != null) __obj.updateDynamic("externalPartnerTenantId")(externalPartnerTenantId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (objectType != null) __obj.updateDynamic("objectType")(objectType)
    __obj.asInstanceOf[DirectoryObjectPartnerReference]
  }
}

