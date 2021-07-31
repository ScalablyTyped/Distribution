package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsAppDefinition
  extends StObject
     with Entity {
  
  // The name of the app provided by the app developer.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The ID from the Teams app manifest.
  var teamsAppId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The version number of the application.
  var version: js.UndefOr[NullableOption[String]] = js.undefined
}
object TeamsAppDefinition {
  
  @scala.inline
  def apply(): TeamsAppDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamsAppDefinition]
  }
  
  @scala.inline
  implicit class TeamsAppDefinitionMutableBuilder[Self <: TeamsAppDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setTeamsAppId(value: NullableOption[String]): Self = StObject.set(x, "teamsAppId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamsAppIdNull: Self = StObject.set(x, "teamsAppId", null)
    
    @scala.inline
    def setTeamsAppIdUndefined: Self = StObject.set(x, "teamsAppId", js.undefined)
    
    @scala.inline
    def setVersion(value: NullableOption[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNull: Self = StObject.set(x, "version", null)
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
