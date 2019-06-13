package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Channel extends Entity {
  /** Optional textual description for the channel. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Channel name as it will appear to the user in Microsoft Teams. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** The email address for sending messages to the channel. Read-only. */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /** A collection of all the tabs in the channel. A navigation property. */
  var tabs: js.UndefOr[js.Array[TeamsTab]] = js.undefined
  /**
    * A hyperlink that will navigate to the channel in Microsoft Teams.
    * This is the URL that you get when you right-click a channel in Microsoft Teams and select Get link to channel.
    * This URL should be treated as an opaque blob, and not parsed. Read-only.
    */
  var webUrl: js.UndefOr[java.lang.String] = js.undefined
}

object Channel {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    displayName: java.lang.String = null,
    email: java.lang.String = null,
    id: java.lang.String = null,
    tabs: js.Array[TeamsTab] = null,
    webUrl: java.lang.String = null
  ): Channel = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (email != null) __obj.updateDynamic("email")(email)
    if (id != null) __obj.updateDynamic("id")(id)
    if (tabs != null) __obj.updateDynamic("tabs")(tabs)
    if (webUrl != null) __obj.updateDynamic("webUrl")(webUrl)
    __obj.asInstanceOf[Channel]
  }
}

