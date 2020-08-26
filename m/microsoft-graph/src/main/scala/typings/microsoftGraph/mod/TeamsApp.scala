package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamsApp extends Entity {
  // The details for each version of the app.
  var appDefinitions: js.UndefOr[js.Array[TeamsAppDefinition]] = js.native
  // The name of the catalog app provided by the app developer in the Microsoft Teams zip app package.
  var displayName: js.UndefOr[String] = js.native
  // The method of distribution for the app.
  var distributionMethod: js.UndefOr[TeamsAppDistributionMethod] = js.native
  // The ID of the catalog provided by the app developer in the Microsoft Teams zip app package.
  var externalId: js.UndefOr[String] = js.native
}

object TeamsApp {
  @scala.inline
  def apply(): TeamsApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamsApp]
  }
  @scala.inline
  implicit class TeamsAppOps[Self <: TeamsApp] (val x: Self) extends AnyVal {
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
    def setAppDefinitionsVarargs(value: TeamsAppDefinition*): Self = this.set("appDefinitions", js.Array(value :_*))
    @scala.inline
    def setAppDefinitions(value: js.Array[TeamsAppDefinition]): Self = this.set("appDefinitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppDefinitions: Self = this.set("appDefinitions", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setDistributionMethod(value: TeamsAppDistributionMethod): Self = this.set("distributionMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistributionMethod: Self = this.set("distributionMethod", js.undefined)
    @scala.inline
    def setExternalId(value: String): Self = this.set("externalId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalId: Self = this.set("externalId", js.undefined)
  }
  
}

