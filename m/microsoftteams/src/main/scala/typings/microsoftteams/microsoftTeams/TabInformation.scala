package typings.microsoftteams.microsoftTeams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabInformation extends js.Object {
  
  var teamTabs: js.Array[TabInstance] = js.native
}
object TabInformation {
  
  @scala.inline
  def apply(teamTabs: js.Array[TabInstance]): TabInformation = {
    val __obj = js.Dynamic.literal(teamTabs = teamTabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabInformation]
  }
  
  @scala.inline
  implicit class TabInformationOps[Self <: TabInformation] (val x: Self) extends AnyVal {
    
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
    def setTeamTabsVarargs(value: TabInstance*): Self = this.set("teamTabs", js.Array(value :_*))
    
    @scala.inline
    def setTeamTabs(value: js.Array[TabInstance]): Self = this.set("teamTabs", value.asInstanceOf[js.Any])
  }
}
