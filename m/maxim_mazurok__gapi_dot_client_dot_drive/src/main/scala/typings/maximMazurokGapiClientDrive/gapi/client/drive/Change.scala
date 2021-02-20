package typings.maximMazurokGapiClientDrive.gapi.client.drive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Change extends StObject {
  
  /** The type of the change. Possible values are file and drive. */
  var changeType: js.UndefOr[String] = js.native
  
  /** The updated state of the shared drive. Present if the changeType is drive, the user is still a member of the shared drive, and the shared drive has not been deleted. */
  var drive: js.UndefOr[Drive] = js.native
  
  /** The ID of the shared drive associated with this change. */
  var driveId: js.UndefOr[String] = js.native
  
  /** The updated state of the file. Present if the type is file and the file has not been removed from this list of changes. */
  var file: js.UndefOr[File] = js.native
  
  /** The ID of the file which has changed. */
  var fileId: js.UndefOr[String] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "drive#change". */
  var kind: js.UndefOr[String] = js.native
  
  /** Whether the file or shared drive has been removed from this list of changes, for example by deletion or loss of access. */
  var removed: js.UndefOr[Boolean] = js.native
  
  /** Deprecated - use drive instead. */
  var teamDrive: js.UndefOr[TeamDrive] = js.native
  
  /** Deprecated - use driveId instead. */
  var teamDriveId: js.UndefOr[String] = js.native
  
  /** The time of this change (RFC 3339 date-time). */
  var time: js.UndefOr[String] = js.native
  
  /** Deprecated - use changeType instead. */
  var `type`: js.UndefOr[String] = js.native
}
object Change {
  
  @scala.inline
  def apply(): Change = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Change]
  }
  
  @scala.inline
  implicit class ChangeMutableBuilder[Self <: Change] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeType(value: String): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeTypeUndefined: Self = StObject.set(x, "changeType", js.undefined)
    
    @scala.inline
    def setDrive(value: Drive): Self = StObject.set(x, "drive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveId(value: String): Self = StObject.set(x, "driveId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveIdUndefined: Self = StObject.set(x, "driveId", js.undefined)
    
    @scala.inline
    def setDriveUndefined: Self = StObject.set(x, "drive", js.undefined)
    
    @scala.inline
    def setFile(value: File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileIdUndefined: Self = StObject.set(x, "fileId", js.undefined)
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setRemoved(value: Boolean): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedUndefined: Self = StObject.set(x, "removed", js.undefined)
    
    @scala.inline
    def setTeamDrive(value: TeamDrive): Self = StObject.set(x, "teamDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamDriveId(value: String): Self = StObject.set(x, "teamDriveId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamDriveIdUndefined: Self = StObject.set(x, "teamDriveId", js.undefined)
    
    @scala.inline
    def setTeamDriveUndefined: Self = StObject.set(x, "teamDrive", js.undefined)
    
    @scala.inline
    def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
