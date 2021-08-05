package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DriveReference extends StObject {
  
  /** The resource name of the shared drive. The format is "COLLECTION_ID/DRIVE_ID". Clients should not assume a specific collection ID for this resource name. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The title of the shared drive. */
  var title: js.UndefOr[String] = js.undefined
}
object DriveReference {
  
  inline def apply(): DriveReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveReference]
  }
  
  extension [Self <: DriveReference](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
