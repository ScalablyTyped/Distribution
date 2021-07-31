package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamDrive extends StObject {
  
  /** This field is deprecated; please see `Drive.name` instead. */
  var name: js.UndefOr[String] = js.undefined
  
  /** This field is deprecated; please see `Drive.root` instead. */
  var root: js.UndefOr[DriveItem] = js.undefined
  
  /** This field is deprecated; please see `Drive.title` instead. */
  var title: js.UndefOr[String] = js.undefined
}
object TeamDrive {
  
  @scala.inline
  def apply(): TeamDrive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamDrive]
  }
  
  @scala.inline
  implicit class TeamDriveMutableBuilder[Self <: TeamDrive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRoot(value: DriveItem): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
