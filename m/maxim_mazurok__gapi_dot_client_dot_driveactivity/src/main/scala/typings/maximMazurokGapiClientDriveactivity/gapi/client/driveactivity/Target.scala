package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Target extends StObject {
  
  /** The target is a shared drive. */
  var drive: js.UndefOr[Drive] = js.native
  
  /** The target is a Drive item. */
  var driveItem: js.UndefOr[DriveItem] = js.native
  
  /** The target is a comment on a Drive file. */
  var fileComment: js.UndefOr[FileComment] = js.native
  
  /** This field is deprecated; please use the `drive` field instead. */
  var teamDrive: js.UndefOr[TeamDrive] = js.native
}
object Target {
  
  @scala.inline
  def apply(): Target = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Target]
  }
  
  @scala.inline
  implicit class TargetMutableBuilder[Self <: Target] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDrive(value: Drive): Self = StObject.set(x, "drive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveItem(value: DriveItem): Self = StObject.set(x, "driveItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveItemUndefined: Self = StObject.set(x, "driveItem", js.undefined)
    
    @scala.inline
    def setDriveUndefined: Self = StObject.set(x, "drive", js.undefined)
    
    @scala.inline
    def setFileComment(value: FileComment): Self = StObject.set(x, "fileComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileCommentUndefined: Self = StObject.set(x, "fileComment", js.undefined)
    
    @scala.inline
    def setTeamDrive(value: TeamDrive): Self = StObject.set(x, "teamDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamDriveUndefined: Self = StObject.set(x, "teamDrive", js.undefined)
  }
}
