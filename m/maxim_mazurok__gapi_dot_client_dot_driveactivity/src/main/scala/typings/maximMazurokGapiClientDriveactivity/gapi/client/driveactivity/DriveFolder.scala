package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DriveFolder extends StObject {
  
  /** The type of Drive folder. */
  var `type`: js.UndefOr[String] = js.undefined
}
object DriveFolder {
  
  @scala.inline
  def apply(): DriveFolder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveFolder]
  }
  
  @scala.inline
  implicit class DriveFolderMutableBuilder[Self <: DriveFolder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
