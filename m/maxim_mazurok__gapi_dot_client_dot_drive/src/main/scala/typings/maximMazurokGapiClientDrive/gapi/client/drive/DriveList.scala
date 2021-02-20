package typings.maximMazurokGapiClientDrive.gapi.client.drive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DriveList extends StObject {
  
  /** The list of shared drives. If nextPageToken is populated, then this list may be incomplete and an additional page of results should be fetched. */
  var drives: js.UndefOr[js.Array[Drive]] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "drive#driveList". */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The page token for the next page of shared drives. This will be absent if the end of the list has been reached. If the token is rejected for any reason, it should be discarded, and
    * pagination should be restarted from the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object DriveList {
  
  @scala.inline
  def apply(): DriveList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveList]
  }
  
  @scala.inline
  implicit class DriveListMutableBuilder[Self <: DriveList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDrives(value: js.Array[Drive]): Self = StObject.set(x, "drives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrivesUndefined: Self = StObject.set(x, "drives", js.undefined)
    
    @scala.inline
    def setDrivesVarargs(value: Drive*): Self = StObject.set(x, "drives", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
