package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OSPolicyResourceFile extends StObject {
  
  /**
    * Defaults to false. When false, files are subject to validations based on the file type: Remote: A checksum must be specified. Cloud Storage: An object generation number must be
    * specified.
    */
  var allowInsecure: js.UndefOr[Boolean] = js.undefined
  
  /** A Cloud Storage object. */
  var gcs: js.UndefOr[OSPolicyResourceFileGcs] = js.undefined
  
  /** A local path within the VM to use. */
  var localPath: js.UndefOr[String] = js.undefined
  
  /** A generic remote file. */
  var remote: js.UndefOr[OSPolicyResourceFileRemote] = js.undefined
}
object OSPolicyResourceFile {
  
  inline def apply(): OSPolicyResourceFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OSPolicyResourceFile]
  }
  
  extension [Self <: OSPolicyResourceFile](x: Self) {
    
    inline def setAllowInsecure(value: Boolean): Self = StObject.set(x, "allowInsecure", value.asInstanceOf[js.Any])
    
    inline def setAllowInsecureUndefined: Self = StObject.set(x, "allowInsecure", js.undefined)
    
    inline def setGcs(value: OSPolicyResourceFileGcs): Self = StObject.set(x, "gcs", value.asInstanceOf[js.Any])
    
    inline def setGcsUndefined: Self = StObject.set(x, "gcs", js.undefined)
    
    inline def setLocalPath(value: String): Self = StObject.set(x, "localPath", value.asInstanceOf[js.Any])
    
    inline def setLocalPathUndefined: Self = StObject.set(x, "localPath", js.undefined)
    
    inline def setRemote(value: OSPolicyResourceFileRemote): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
    
    inline def setRemoteUndefined: Self = StObject.set(x, "remote", js.undefined)
  }
}
