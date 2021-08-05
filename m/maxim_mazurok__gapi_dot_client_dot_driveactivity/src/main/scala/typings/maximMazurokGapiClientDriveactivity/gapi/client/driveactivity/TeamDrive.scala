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
  
  inline def apply(): TeamDrive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamDrive]
  }
  
  extension [Self <: TeamDrive](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRoot(value: DriveItem): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
