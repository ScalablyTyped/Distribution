package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OSPolicyResourceFileResource extends StObject {
  
  /** A a file with this content. The size of the content is limited to 1024 characters. */
  var content: js.UndefOr[String] = js.undefined
  
  /** A remote or local source. */
  var file: js.UndefOr[OSPolicyResourceFile] = js.undefined
  
  /** Required. The absolute path of the file within the VM. */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * Consists of three octal digits which represent, in order, the permissions of the owner, group, and other users for the file (similarly to the numeric mode used in the linux chmod
    * utility). Each digit represents a three bit number with the 4 bit corresponding to the read permissions, the 2 bit corresponds to the write bit, and the one bit corresponds to the
    * execute permission. Default behavior is 755. Below are some examples of permissions and their associated values: read, write, and execute: 7 read and execute: 5 read and write: 6
    * read only: 4
    */
  var permissions: js.UndefOr[String] = js.undefined
  
  /** Required. Desired state of the file. */
  var state: js.UndefOr[String] = js.undefined
}
object OSPolicyResourceFileResource {
  
  inline def apply(): OSPolicyResourceFileResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OSPolicyResourceFileResource]
  }
  
  extension [Self <: OSPolicyResourceFileResource](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setFile(value: OSPolicyResourceFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPermissions(value: String): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
