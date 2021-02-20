package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Drive extends StObject {
  
  /** The resource name of the shared drive. The format is "COLLECTION_ID/DRIVE_ID". Clients should not assume a specific collection ID for this resource name. */
  var name: js.UndefOr[String] = js.native
  
  /** The root of this shared drive. */
  var root: js.UndefOr[DriveItem] = js.native
  
  /** The title of the shared drive. */
  var title: js.UndefOr[String] = js.native
}
object Drive {
  
  @scala.inline
  def apply(): Drive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Drive]
  }
  
  @scala.inline
  implicit class DriveMutableBuilder[Self <: Drive] (val x: Self) extends AnyVal {
    
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
