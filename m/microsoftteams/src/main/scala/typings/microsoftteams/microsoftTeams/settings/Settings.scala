package typings.microsoftteams.microsoftTeams.settings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  /**
    * Sets the URL to use for the content of this instance.
    */
  var contentUrl: String = js.native
  /**
    * The developer-defined unique ID for the entity to which this content points.
    */
  var entityId: String = js.native
  /**
    * Sets the URL for the removal configuration experience.
    */
  var removeUrl: js.UndefOr[String] = js.native
  /**
    * A suggested display name for the new content.
    * In the settings for an existing instance being updated, this call has no effect.
    */
  var suggestedDisplayName: js.UndefOr[String] = js.native
  /**
    * Sets the URL to use for the external link to view the underlying resource in a browser.
    */
  var websiteUrl: js.UndefOr[String] = js.native
}

object Settings {
  @scala.inline
  def apply(contentUrl: String, entityId: String): Settings = {
    val __obj = js.Dynamic.literal(contentUrl = contentUrl.asInstanceOf[js.Any], entityId = entityId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
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
    def setContentUrl(value: String): Self = this.set("contentUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntityId(value: String): Self = this.set("entityId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveUrl(value: String): Self = this.set("removeUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveUrl: Self = this.set("removeUrl", js.undefined)
    @scala.inline
    def setSuggestedDisplayName(value: String): Self = this.set("suggestedDisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestedDisplayName: Self = this.set("suggestedDisplayName", js.undefined)
    @scala.inline
    def setWebsiteUrl(value: String): Self = this.set("websiteUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsiteUrl: Self = this.set("websiteUrl", js.undefined)
  }
  
}

