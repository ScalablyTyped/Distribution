package typings.maximMazurokGapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamDriveInfo extends js.Object {
  
  /** List of Team Drive IDs, as provided by Drive API. */
  var teamDriveIds: js.UndefOr[js.Array[String]] = js.native
}
object TeamDriveInfo {
  
  @scala.inline
  def apply(): TeamDriveInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamDriveInfo]
  }
  
  @scala.inline
  implicit class TeamDriveInfoOps[Self <: TeamDriveInfo] (val x: Self) extends AnyVal {
    
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
    def setTeamDriveIdsVarargs(value: String*): Self = this.set("teamDriveIds", js.Array(value :_*))
    
    @scala.inline
    def setTeamDriveIds(value: js.Array[String]): Self = this.set("teamDriveIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeamDriveIds: Self = this.set("teamDriveIds", js.undefined)
  }
}
