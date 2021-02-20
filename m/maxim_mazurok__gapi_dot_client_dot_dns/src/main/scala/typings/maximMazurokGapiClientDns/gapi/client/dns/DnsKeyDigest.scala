package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DnsKeyDigest extends StObject {
  
  /** The base-16 encoded bytes of this digest. Suitable for use in a DS resource record. */
  var digest: js.UndefOr[String] = js.native
  
  /** Specifies the algorithm used to calculate this digest. */
  var `type`: js.UndefOr[String] = js.native
}
object DnsKeyDigest {
  
  @scala.inline
  def apply(): DnsKeyDigest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DnsKeyDigest]
  }
  
  @scala.inline
  implicit class DnsKeyDigestMutableBuilder[Self <: DnsKeyDigest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
