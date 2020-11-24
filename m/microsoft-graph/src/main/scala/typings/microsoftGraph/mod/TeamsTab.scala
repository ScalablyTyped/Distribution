package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamsTab extends Entity {
  
  // Container for custom settings applied to a tab. The tab is considered configured only once this property is set.
  var configuration: js.UndefOr[NullableOption[TeamsTabConfiguration]] = js.native
  
  // Name of the tab.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // The application that is linked to the tab. This cannot be changed after tab creation.
  var teamsApp: js.UndefOr[NullableOption[TeamsApp]] = js.native
  
  // Deep link URL of the tab instance. Read only.
  var webUrl: js.UndefOr[NullableOption[String]] = js.native
}
object TeamsTab {
  
  @scala.inline
  def apply(): TeamsTab = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamsTab]
  }
  
  @scala.inline
  implicit class TeamsTabOps[Self <: TeamsTab] (val x: Self) extends AnyVal {
    
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
    def setConfiguration(value: NullableOption[TeamsTabConfiguration]): Self = this.set("configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfiguration: Self = this.set("configuration", js.undefined)
    
    @scala.inline
    def setConfigurationNull: Self = this.set("configuration", null)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDisplayNameNull: Self = this.set("displayName", null)
    
    @scala.inline
    def setTeamsApp(value: NullableOption[TeamsApp]): Self = this.set("teamsApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeamsApp: Self = this.set("teamsApp", js.undefined)
    
    @scala.inline
    def setTeamsAppNull: Self = this.set("teamsApp", null)
    
    @scala.inline
    def setWebUrl(value: NullableOption[String]): Self = this.set("webUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebUrl: Self = this.set("webUrl", js.undefined)
    
    @scala.inline
    def setWebUrlNull: Self = this.set("webUrl", null)
  }
}
