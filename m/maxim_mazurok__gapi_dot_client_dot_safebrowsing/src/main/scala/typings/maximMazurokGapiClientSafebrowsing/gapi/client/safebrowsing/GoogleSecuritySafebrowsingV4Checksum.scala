package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleSecuritySafebrowsingV4Checksum extends StObject {
  
  /** The SHA256 hash of the client state; that is, of the sorted list of all hashes present in the database. */
  var sha256: js.UndefOr[String] = js.undefined
}
object GoogleSecuritySafebrowsingV4Checksum {
  
  inline def apply(): GoogleSecuritySafebrowsingV4Checksum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleSecuritySafebrowsingV4Checksum]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleSecuritySafebrowsingV4Checksum] (val x: Self) extends AnyVal {
    
    inline def setSha256(value: String): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    
    inline def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
  }
}
