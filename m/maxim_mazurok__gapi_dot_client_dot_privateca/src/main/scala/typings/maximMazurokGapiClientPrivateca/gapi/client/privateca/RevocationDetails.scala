package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevocationDetails extends js.Object {
  
  /** Indicates why a Certificate was revoked. */
  var revocationState: js.UndefOr[String] = js.native
  
  /** The time at which this Certificate was revoked. */
  var revocationTime: js.UndefOr[String] = js.native
}
object RevocationDetails {
  
  @scala.inline
  def apply(): RevocationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevocationDetails]
  }
  
  @scala.inline
  implicit class RevocationDetailsOps[Self <: RevocationDetails] (val x: Self) extends AnyVal {
    
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
    def setRevocationState(value: String): Self = this.set("revocationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevocationState: Self = this.set("revocationState", js.undefined)
    
    @scala.inline
    def setRevocationTime(value: String): Self = this.set("revocationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevocationTime: Self = this.set("revocationTime", js.undefined)
  }
}
