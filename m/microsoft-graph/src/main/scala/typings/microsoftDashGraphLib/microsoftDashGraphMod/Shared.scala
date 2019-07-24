package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shared extends js.Object {
  // The identity of the owner of the shared item. Read-only.
  var owner: js.UndefOr[IdentitySet] = js.undefined
  // Indicates the scope of how the item is shared: anonymous, organization, or users. Read-only.
  var scope: js.UndefOr[java.lang.String] = js.undefined
  // The identity of the user who shared the item. Read-only.
  var sharedBy: js.UndefOr[IdentitySet] = js.undefined
  // The UTC date and time when the item was shared. Read-only.
  var sharedDateTime: js.UndefOr[java.lang.String] = js.undefined
}

object Shared {
  @scala.inline
  def apply(
    owner: IdentitySet = null,
    scope: java.lang.String = null,
    sharedBy: IdentitySet = null,
    sharedDateTime: java.lang.String = null
  ): Shared = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (sharedBy != null) __obj.updateDynamic("sharedBy")(sharedBy)
    if (sharedDateTime != null) __obj.updateDynamic("sharedDateTime")(sharedDateTime)
    __obj.asInstanceOf[Shared]
  }
}

