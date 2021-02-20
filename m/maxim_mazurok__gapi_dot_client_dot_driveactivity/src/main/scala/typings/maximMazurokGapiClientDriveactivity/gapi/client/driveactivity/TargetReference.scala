package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetReference extends StObject {
  
  /** The target is a shared drive. */
  var drive: js.UndefOr[DriveReference] = js.native
  
  /** The target is a Drive item. */
  var driveItem: js.UndefOr[DriveItemReference] = js.native
  
  /** This field is deprecated; please use the `drive` field instead. */
  var teamDrive: js.UndefOr[TeamDriveReference] = js.native
}
object TargetReference {
  
  @scala.inline
  def apply(): TargetReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetReference]
  }
  
  @scala.inline
  implicit class TargetReferenceMutableBuilder[Self <: TargetReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDrive(value: DriveReference): Self = StObject.set(x, "drive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveItem(value: DriveItemReference): Self = StObject.set(x, "driveItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveItemUndefined: Self = StObject.set(x, "driveItem", js.undefined)
    
    @scala.inline
    def setDriveUndefined: Self = StObject.set(x, "drive", js.undefined)
    
    @scala.inline
    def setTeamDrive(value: TeamDriveReference): Self = StObject.set(x, "teamDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamDriveUndefined: Self = StObject.set(x, "teamDrive", js.undefined)
  }
}
