package typings.maximMazurokGapiClientDns.gapi.client.dns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DnsKeyDigest extends js.Object {
  
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
  implicit class DnsKeyDigestOps[Self <: DnsKeyDigest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDigest(value: String): Self = this.set("digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDigest: Self = this.set("digest", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
