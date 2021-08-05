package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Target extends StObject {
  
  /** The target is a shared drive. */
  var drive: js.UndefOr[Drive] = js.undefined
  
  /** The target is a Drive item. */
  var driveItem: js.UndefOr[DriveItem] = js.undefined
  
  /** The target is a comment on a Drive file. */
  var fileComment: js.UndefOr[FileComment] = js.undefined
  
  /** This field is deprecated; please use the `drive` field instead. */
  var teamDrive: js.UndefOr[TeamDrive] = js.undefined
}
object Target {
  
  inline def apply(): Target = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Target]
  }
  
  extension [Self <: Target](x: Self) {
    
    inline def setDrive(value: Drive): Self = StObject.set(x, "drive", value.asInstanceOf[js.Any])
    
    inline def setDriveItem(value: DriveItem): Self = StObject.set(x, "driveItem", value.asInstanceOf[js.Any])
    
    inline def setDriveItemUndefined: Self = StObject.set(x, "driveItem", js.undefined)
    
    inline def setDriveUndefined: Self = StObject.set(x, "drive", js.undefined)
    
    inline def setFileComment(value: FileComment): Self = StObject.set(x, "fileComment", value.asInstanceOf[js.Any])
    
    inline def setFileCommentUndefined: Self = StObject.set(x, "fileComment", js.undefined)
    
    inline def setTeamDrive(value: TeamDrive): Self = StObject.set(x, "teamDrive", value.asInstanceOf[js.Any])
    
    inline def setTeamDriveUndefined: Self = StObject.set(x, "teamDrive", js.undefined)
  }
}
