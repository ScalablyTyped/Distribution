package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObbFile extends StObject {
  
  /** Required. Opaque Binary Blob (OBB) file(s) to install on the device. */
  var obb: js.UndefOr[FileReference] = js.undefined
  
  /**
    * Required. OBB file name which must conform to the format as specified by Android e.g. [main|patch].0300110.com.example.android.obb which will be installed into \/Android/obb/\/ on
    * the device.
    */
  var obbFileName: js.UndefOr[String] = js.undefined
}
object ObbFile {
  
  inline def apply(): ObbFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObbFile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObbFile] (val x: Self) extends AnyVal {
    
    inline def setObb(value: FileReference): Self = StObject.set(x, "obb", value.asInstanceOf[js.Any])
    
    inline def setObbFileName(value: String): Self = StObject.set(x, "obbFileName", value.asInstanceOf[js.Any])
    
    inline def setObbFileNameUndefined: Self = StObject.set(x, "obbFileName", js.undefined)
    
    inline def setObbUndefined: Self = StObject.set(x, "obb", js.undefined)
  }
}
