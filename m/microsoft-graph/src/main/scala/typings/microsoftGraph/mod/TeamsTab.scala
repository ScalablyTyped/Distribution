package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsTab
  extends StObject
     with Entity {
  
  // Container for custom settings applied to a tab. The tab is considered configured only once this property is set.
  var configuration: js.UndefOr[NullableOption[TeamsTabConfiguration]] = js.undefined
  
  // Name of the tab.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The application that is linked to the tab. This cannot be changed after tab creation.
  var teamsApp: js.UndefOr[NullableOption[TeamsApp]] = js.undefined
  
  // Deep link URL of the tab instance. Read only.
  var webUrl: js.UndefOr[NullableOption[String]] = js.undefined
}
object TeamsTab {
  
  inline def apply(): TeamsTab = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamsTab]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TeamsTab] (val x: Self) extends AnyVal {
    
    inline def setConfiguration(value: NullableOption[TeamsTabConfiguration]): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationNull: Self = StObject.set(x, "configuration", null)
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setTeamsApp(value: NullableOption[TeamsApp]): Self = StObject.set(x, "teamsApp", value.asInstanceOf[js.Any])
    
    inline def setTeamsAppNull: Self = StObject.set(x, "teamsApp", null)
    
    inline def setTeamsAppUndefined: Self = StObject.set(x, "teamsApp", js.undefined)
    
    inline def setWebUrl(value: NullableOption[String]): Self = StObject.set(x, "webUrl", value.asInstanceOf[js.Any])
    
    inline def setWebUrlNull: Self = StObject.set(x, "webUrl", null)
    
    inline def setWebUrlUndefined: Self = StObject.set(x, "webUrl", js.undefined)
  }
}
