package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppCatalogs extends Entity {
  
  var teamsApps: js.UndefOr[NullableOption[js.Array[TeamsApp]]] = js.native
}
object AppCatalogs {
  
  @scala.inline
  def apply(): AppCatalogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppCatalogs]
  }
  
  @scala.inline
  implicit class AppCatalogsOps[Self <: AppCatalogs] (val x: Self) extends AnyVal {
    
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
    def setTeamsAppsVarargs(value: TeamsApp*): Self = this.set("teamsApps", js.Array(value :_*))
    
    @scala.inline
    def setTeamsApps(value: NullableOption[js.Array[TeamsApp]]): Self = this.set("teamsApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeamsApps: Self = this.set("teamsApps", js.undefined)
    
    @scala.inline
    def setTeamsAppsNull: Self = this.set("teamsApps", null)
  }
}
