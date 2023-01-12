package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait File extends StObject {
  
  /** Prefix of the file contents as a JSON encoded string. (Currently only populated for Malicious Script Executed findings.) */
  var contents: js.UndefOr[String] = js.undefined
  
  /** The length in bytes of the file prefix that was hashed. If hashed_size == size, any hashes reported represent the entire file. */
  var hashedSize: js.UndefOr[String] = js.undefined
  
  /** True when the hash covers only a prefix of the file. */
  var partiallyHashed: js.UndefOr[Boolean] = js.undefined
  
  /** Absolute path of the file as a JSON encoded string. */
  var path: js.UndefOr[String] = js.undefined
  
  /** SHA256 hash of the first hashed_size bytes of the file encoded as a hex string. If hashed_size == size, sha256 represents the SHA256 hash of the entire file. */
  var sha256: js.UndefOr[String] = js.undefined
  
  /** Size of the file in bytes. */
  var size: js.UndefOr[String] = js.undefined
}
object File {
  
  inline def apply(): File = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[File]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: File] (val x: Self) extends AnyVal {
    
    inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
    
    inline def setHashedSize(value: String): Self = StObject.set(x, "hashedSize", value.asInstanceOf[js.Any])
    
    inline def setHashedSizeUndefined: Self = StObject.set(x, "hashedSize", js.undefined)
    
    inline def setPartiallyHashed(value: Boolean): Self = StObject.set(x, "partiallyHashed", value.asInstanceOf[js.Any])
    
    inline def setPartiallyHashedUndefined: Self = StObject.set(x, "partiallyHashed", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSha256(value: String): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    
    inline def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
