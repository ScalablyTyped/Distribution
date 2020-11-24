package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamsAppInstallation extends Entity {
  
  // The app that is installed.
  var teamsApp: js.UndefOr[NullableOption[TeamsApp]] = js.native
  
  // The details of this version of the app.
  var teamsAppDefinition: js.UndefOr[NullableOption[TeamsAppDefinition]] = js.native
}
object TeamsAppInstallation {
  
  @scala.inline
  def apply(): TeamsAppInstallation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamsAppInstallation]
  }
  
  @scala.inline
  implicit class TeamsAppInstallationOps[Self <: TeamsAppInstallation] (val x: Self) extends AnyVal {
    
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
    def setTeamsApp(value: NullableOption[TeamsApp]): Self = this.set("teamsApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeamsApp: Self = this.set("teamsApp", js.undefined)
    
    @scala.inline
    def setTeamsAppNull: Self = this.set("teamsApp", null)
    
    @scala.inline
    def setTeamsAppDefinition(value: NullableOption[TeamsAppDefinition]): Self = this.set("teamsAppDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeamsAppDefinition: Self = this.set("teamsAppDefinition", js.undefined)
    
    @scala.inline
    def setTeamsAppDefinitionNull: Self = this.set("teamsAppDefinition", null)
  }
}
