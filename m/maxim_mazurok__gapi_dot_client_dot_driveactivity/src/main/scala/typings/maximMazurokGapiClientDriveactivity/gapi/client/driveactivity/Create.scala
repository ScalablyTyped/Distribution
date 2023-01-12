package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Create extends StObject {
  
  /** If present, indicates the object was created by copying an existing Drive object. */
  var copy: js.UndefOr[Copy] = js.undefined
  
  /** If present, indicates the object was newly created (e.g. as a blank document), not derived from a Drive object or external object. */
  var `new`: js.UndefOr[Any] = js.undefined
  
  /** If present, indicates the object originated externally and was uploaded to Drive. */
  var upload: js.UndefOr[Any] = js.undefined
}
object Create {
  
  inline def apply(): Create = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Create]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Create] (val x: Self) extends AnyVal {
    
    inline def setCopy(value: Copy): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
    
    inline def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
    
    inline def setNew(value: Any): Self = StObject.set(x, "new", value.asInstanceOf[js.Any])
    
    inline def setNewUndefined: Self = StObject.set(x, "new", js.undefined)
    
    inline def setUpload(value: Any): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
    
    inline def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
  }
}
