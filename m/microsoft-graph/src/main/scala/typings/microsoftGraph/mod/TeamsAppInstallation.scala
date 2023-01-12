package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsAppInstallation
  extends StObject
     with Entity {
  
  // The app that is installed.
  var teamsApp: js.UndefOr[NullableOption[TeamsApp]] = js.undefined
  
  // The details of this version of the app.
  var teamsAppDefinition: js.UndefOr[NullableOption[TeamsAppDefinition]] = js.undefined
}
object TeamsAppInstallation {
  
  inline def apply(): TeamsAppInstallation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamsAppInstallation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TeamsAppInstallation] (val x: Self) extends AnyVal {
    
    inline def setTeamsApp(value: NullableOption[TeamsApp]): Self = StObject.set(x, "teamsApp", value.asInstanceOf[js.Any])
    
    inline def setTeamsAppDefinition(value: NullableOption[TeamsAppDefinition]): Self = StObject.set(x, "teamsAppDefinition", value.asInstanceOf[js.Any])
    
    inline def setTeamsAppDefinitionNull: Self = StObject.set(x, "teamsAppDefinition", null)
    
    inline def setTeamsAppDefinitionUndefined: Self = StObject.set(x, "teamsAppDefinition", js.undefined)
    
    inline def setTeamsAppNull: Self = StObject.set(x, "teamsApp", null)
    
    inline def setTeamsAppUndefined: Self = StObject.set(x, "teamsApp", js.undefined)
  }
}
