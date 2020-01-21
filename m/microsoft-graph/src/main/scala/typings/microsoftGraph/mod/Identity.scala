package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identity extends js.Object {
  /**
    * The identity's display name. Note that this may not always be available or up to date. For example, if a user changes
    * their display name, the API may show the new value in a future response, but the items associated with the user won't
    * show up as having changed when using delta.
    */
  var displayName: js.UndefOr[String] = js.undefined
  // Unique identifier for the identity.
  var id: js.UndefOr[String] = js.undefined
}

object Identity {
  @scala.inline
  def apply(displayName: String = null, id: String = null): Identity = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identity]
  }
}

