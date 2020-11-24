package typings.openfin.externalProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificationInfo extends js.Object {
  
  var publickey: js.UndefOr[String] = js.native
  
  var serial: js.UndefOr[String] = js.native
  
  var subject: js.UndefOr[String] = js.native
  
  var thumbprint: js.UndefOr[String] = js.native
  
  var trusted: js.UndefOr[Boolean] = js.native
}
object CertificationInfo {
  
  @scala.inline
  def apply(): CertificationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificationInfo]
  }
  
  @scala.inline
  implicit class CertificationInfoOps[Self <: CertificationInfo] (val x: Self) extends AnyVal {
    
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
    def setPublickey(value: String): Self = this.set("publickey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublickey: Self = this.set("publickey", js.undefined)
    
    @scala.inline
    def setSerial(value: String): Self = this.set("serial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerial: Self = this.set("serial", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    
    @scala.inline
    def setThumbprint(value: String): Self = this.set("thumbprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbprint: Self = this.set("thumbprint", js.undefined)
    
    @scala.inline
    def setTrusted(value: Boolean): Self = this.set("trusted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrusted: Self = this.set("trusted", js.undefined)
  }
}
