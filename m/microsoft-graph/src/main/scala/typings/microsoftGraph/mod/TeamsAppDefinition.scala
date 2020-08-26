package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamsAppDefinition extends Entity {
  // The name of the app provided by the app developer.
  var displayName: js.UndefOr[String] = js.native
  // The id from the Teams App manifest.
  var teamsAppId: js.UndefOr[String] = js.native
  // The version number of the application.
  var version: js.UndefOr[String] = js.native
}

object TeamsAppDefinition {
  @scala.inline
  def apply(): TeamsAppDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamsAppDefinition]
  }
  @scala.inline
  implicit class TeamsAppDefinitionOps[Self <: TeamsAppDefinition] (val x: Self) extends AnyVal {
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setTeamsAppId(value: String): Self = this.set("teamsAppId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTeamsAppId: Self = this.set("teamsAppId", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

