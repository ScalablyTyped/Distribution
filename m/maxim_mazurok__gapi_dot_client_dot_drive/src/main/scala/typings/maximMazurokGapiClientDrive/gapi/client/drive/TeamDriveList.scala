package typings.maximMazurokGapiClientDrive.gapi.client.drive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamDriveList extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "drive#teamDriveList". */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The page token for the next page of Team Drives. This will be absent if the end of the Team Drives list has been reached. If the token is rejected for any reason, it should be
    * discarded, and pagination should be restarted from the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The list of Team Drives. If nextPageToken is populated, then this list may be incomplete and an additional page of results should be fetched. */
  var teamDrives: js.UndefOr[js.Array[TeamDrive]] = js.undefined
}
object TeamDriveList {
  
  inline def apply(): TeamDriveList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamDriveList]
  }
  
  extension [Self <: TeamDriveList](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTeamDrives(value: js.Array[TeamDrive]): Self = StObject.set(x, "teamDrives", value.asInstanceOf[js.Any])
    
    inline def setTeamDrivesUndefined: Self = StObject.set(x, "teamDrives", js.undefined)
    
    inline def setTeamDrivesVarargs(value: TeamDrive*): Self = StObject.set(x, "teamDrives", js.Array(value :_*))
  }
}
