package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Create extends StObject {
  
  /** If present, indicates the object was created by copying an existing Drive object. */
  var copy: js.UndefOr[Copy] = js.native
  
  /** If present, indicates the object was newly created (e.g. as a blank document), not derived from a Drive object or external object. */
  var `new`: js.UndefOr[js.Any] = js.native
  
  /** If present, indicates the object originated externally and was uploaded to Drive. */
  var upload: js.UndefOr[js.Any] = js.native
}
object Create {
  
  @scala.inline
  def apply(): Create = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Create]
  }
  
  @scala.inline
  implicit class CreateMutableBuilder[Self <: Create] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopy(value: Copy): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
    
    @scala.inline
    def setNew(value: js.Any): Self = StObject.set(x, "new", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewUndefined: Self = StObject.set(x, "new", js.undefined)
    
    @scala.inline
    def setUpload(value: js.Any): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
  }
}
