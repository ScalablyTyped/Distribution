package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identity extends js.Object {
  /**
    * The identity's display name. Note that this may not always be available or up to date.
    * For example, if a user changes their display name, the API may show the new value in a future response, but the items associated with the user won't show up as having changed when using delta.
    */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** Unique identifier for the identity. */
  var id: js.UndefOr[java.lang.String] = js.undefined
}

object Identity {
  @scala.inline
  def apply(displayName: java.lang.String = null, id: java.lang.String = null): Identity = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Identity]
  }
}

