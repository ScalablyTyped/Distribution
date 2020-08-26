package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamsTabConfiguration extends js.Object {
  // Url used for rendering tab contents in Teams. Required.
  var contentUrl: js.UndefOr[String] = js.native
  // Identifier for the entity hosted by the tab provider.
  var entityId: js.UndefOr[String] = js.native
  // Url called by Teams client when a Tab is removed using the Teams Client.
  var removeUrl: js.UndefOr[String] = js.native
  // Url for showing tab contents outside of Teams.
  var websiteUrl: js.UndefOr[String] = js.native
}

object TeamsTabConfiguration {
  @scala.inline
  def apply(): TeamsTabConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamsTabConfiguration]
  }
  @scala.inline
  implicit class TeamsTabConfigurationOps[Self <: TeamsTabConfiguration] (val x: Self) extends AnyVal {
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
    def deleteContentUrl: Self = this.set("contentUrl", js.undefined)
    @scala.inline
    def setEntityId(value: String): Self = this.set("entityId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntityId: Self = this.set("entityId", js.undefined)
    @scala.inline
    def setRemoveUrl(value: String): Self = this.set("removeUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveUrl: Self = this.set("removeUrl", js.undefined)
    @scala.inline
    def setWebsiteUrl(value: String): Self = this.set("websiteUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsiteUrl: Self = this.set("websiteUrl", js.undefined)
  }
  
}

