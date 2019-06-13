package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Permission extends Entity {
  /** For user type permissions, the details of the users &amp; applications for this permission. Read-only. */
  var grantedTo: js.UndefOr[IdentitySet] = js.undefined
  /** Provides a reference to the ancestor of the current permission, if it is inherited from an ancestor. Read-only. */
  var inheritedFrom: js.UndefOr[ItemReference] = js.undefined
  /** Details of any associated sharing invitation for this permission. Read-only. */
  var invitation: js.UndefOr[SharingInvitation] = js.undefined
  /** Provides the link details of the current permission, if it is a link type permissions. Read-only. */
  var link: js.UndefOr[SharingLink] = js.undefined
  /** The type of permission, e.g. read. See below for the full list of roles. Read-only. */
  var roles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** A unique token that can be used to access this shared item via the **shares** API. Read-only. */
  var shareId: js.UndefOr[java.lang.String] = js.undefined
}

object Permission {
  @scala.inline
  def apply(
    grantedTo: IdentitySet = null,
    id: java.lang.String = null,
    inheritedFrom: ItemReference = null,
    invitation: SharingInvitation = null,
    link: SharingLink = null,
    roles: js.Array[java.lang.String] = null,
    shareId: java.lang.String = null
  ): Permission = {
    val __obj = js.Dynamic.literal()
    if (grantedTo != null) __obj.updateDynamic("grantedTo")(grantedTo)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inheritedFrom != null) __obj.updateDynamic("inheritedFrom")(inheritedFrom)
    if (invitation != null) __obj.updateDynamic("invitation")(invitation)
    if (link != null) __obj.updateDynamic("link")(link)
    if (roles != null) __obj.updateDynamic("roles")(roles)
    if (shareId != null) __obj.updateDynamic("shareId")(shareId)
    __obj.asInstanceOf[Permission]
  }
}

