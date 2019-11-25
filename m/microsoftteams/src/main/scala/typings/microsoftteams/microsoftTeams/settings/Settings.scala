package typings.microsoftteams.microsoftTeams.settings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  /**
    * Sets the URL to use for the content of this instance.
    */
  var contentUrl: String
  /**
    * The developer-defined unique ID for the entity to which this content points.
    */
  var entityId: String
  /**
    * Sets the URL for the removal configuration experience.
    */
  var removeUrl: js.UndefOr[String] = js.undefined
  /**
    * A suggested display name for the new content.
    * In the settings for an existing instance being updated, this call has no effect.
    */
  var suggestedDisplayName: js.UndefOr[String] = js.undefined
  /**
    * Sets the URL to use for the external link to view the underlying resource in a browser.
    */
  var websiteUrl: js.UndefOr[String] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    contentUrl: String,
    entityId: String,
    removeUrl: String = null,
    suggestedDisplayName: String = null,
    websiteUrl: String = null
  ): Settings = {
    val __obj = js.Dynamic.literal(contentUrl = contentUrl.asInstanceOf[js.Any], entityId = entityId.asInstanceOf[js.Any])
    if (removeUrl != null) __obj.updateDynamic("removeUrl")(removeUrl.asInstanceOf[js.Any])
    if (suggestedDisplayName != null) __obj.updateDynamic("suggestedDisplayName")(suggestedDisplayName.asInstanceOf[js.Any])
    if (websiteUrl != null) __obj.updateDynamic("websiteUrl")(websiteUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

