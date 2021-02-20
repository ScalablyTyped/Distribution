package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
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
  implicit class TeamsAppInstallationMutableBuilder[Self <: TeamsAppInstallation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTeamsApp(value: NullableOption[TeamsApp]): Self = StObject.set(x, "teamsApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamsAppDefinition(value: NullableOption[TeamsAppDefinition]): Self = StObject.set(x, "teamsAppDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamsAppDefinitionNull: Self = StObject.set(x, "teamsAppDefinition", null)
    
    @scala.inline
    def setTeamsAppDefinitionUndefined: Self = StObject.set(x, "teamsAppDefinition", js.undefined)
    
    @scala.inline
    def setTeamsAppNull: Self = StObject.set(x, "teamsApp", null)
    
    @scala.inline
    def setTeamsAppUndefined: Self = StObject.set(x, "teamsApp", js.undefined)
  }
}
