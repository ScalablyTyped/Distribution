package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppCatalogs
  extends StObject
     with Entity {
  
  var teamsApps: js.UndefOr[NullableOption[js.Array[TeamsApp]]] = js.undefined
}
object AppCatalogs {
  
  @scala.inline
  def apply(): AppCatalogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppCatalogs]
  }
  
  @scala.inline
  implicit class AppCatalogsMutableBuilder[Self <: AppCatalogs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTeamsApps(value: NullableOption[js.Array[TeamsApp]]): Self = StObject.set(x, "teamsApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamsAppsNull: Self = StObject.set(x, "teamsApps", null)
    
    @scala.inline
    def setTeamsAppsUndefined: Self = StObject.set(x, "teamsApps", js.undefined)
    
    @scala.inline
    def setTeamsAppsVarargs(value: TeamsApp*): Self = StObject.set(x, "teamsApps", js.Array(value :_*))
  }
}
