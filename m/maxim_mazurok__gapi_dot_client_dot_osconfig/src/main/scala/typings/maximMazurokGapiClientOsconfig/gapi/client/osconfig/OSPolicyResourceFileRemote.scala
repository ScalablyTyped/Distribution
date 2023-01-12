package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OSPolicyResourceFileRemote extends StObject {
  
  /** SHA256 checksum of the remote file. */
  var sha256Checksum: js.UndefOr[String] = js.undefined
  
  /** Required. URI from which to fetch the object. It should contain both the protocol and path following the format `{protocol}://{location}`. */
  var uri: js.UndefOr[String] = js.undefined
}
object OSPolicyResourceFileRemote {
  
  inline def apply(): OSPolicyResourceFileRemote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OSPolicyResourceFileRemote]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OSPolicyResourceFileRemote] (val x: Self) extends AnyVal {
    
    inline def setSha256Checksum(value: String): Self = StObject.set(x, "sha256Checksum", value.asInstanceOf[js.Any])
    
    inline def setSha256ChecksumUndefined: Self = StObject.set(x, "sha256Checksum", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
