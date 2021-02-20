package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamDriveInfo extends StObject {
  
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
  implicit class TeamDriveInfoMutableBuilder[Self <: TeamDriveInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTeamDriveIds(value: js.Array[String]): Self = StObject.set(x, "teamDriveIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamDriveIdsUndefined: Self = StObject.set(x, "teamDriveIds", js.undefined)
    
    @scala.inline
    def setTeamDriveIdsVarargs(value: String*): Self = StObject.set(x, "teamDriveIds", js.Array(value :_*))
  }
}
