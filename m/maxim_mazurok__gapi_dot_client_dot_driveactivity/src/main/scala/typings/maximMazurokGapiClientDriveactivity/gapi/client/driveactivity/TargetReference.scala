package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetReference extends StObject {
  
  /** The target is a shared drive. */
  var drive: js.UndefOr[DriveReference] = js.undefined
  
  /** The target is a Drive item. */
  var driveItem: js.UndefOr[DriveItemReference] = js.undefined
  
  /** This field is deprecated; please use the `drive` field instead. */
  var teamDrive: js.UndefOr[TeamDriveReference] = js.undefined
}
object TargetReference {
  
  inline def apply(): TargetReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetReference]
  }
  
  extension [Self <: TargetReference](x: Self) {
    
    inline def setDrive(value: DriveReference): Self = StObject.set(x, "drive", value.asInstanceOf[js.Any])
    
    inline def setDriveItem(value: DriveItemReference): Self = StObject.set(x, "driveItem", value.asInstanceOf[js.Any])
    
    inline def setDriveItemUndefined: Self = StObject.set(x, "driveItem", js.undefined)
    
    inline def setDriveUndefined: Self = StObject.set(x, "drive", js.undefined)
    
    inline def setTeamDrive(value: TeamDriveReference): Self = StObject.set(x, "teamDrive", value.asInstanceOf[js.Any])
    
    inline def setTeamDriveUndefined: Self = StObject.set(x, "teamDrive", js.undefined)
  }
}
