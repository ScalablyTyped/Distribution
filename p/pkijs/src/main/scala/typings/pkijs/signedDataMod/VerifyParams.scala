package typings.pkijs.signedDataMod

import typings.std.ArrayBuffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VerifyParams extends js.Object {
  
  var checkChain: js.UndefOr[Boolean] = js.native
  
  var checkDate: js.UndefOr[Date] = js.native
  
  var data: js.UndefOr[ArrayBuffer] = js.native
  
  var extendedMode: js.UndefOr[Boolean] = js.native
  
  var includeSignerCertificate: js.UndefOr[Boolean] = js.native
  
  var signer: js.UndefOr[Double] = js.native
  
  var trustedCerts: js.UndefOr[js.Array[typings.pkijs.certificateMod.default]] = js.native
}
object VerifyParams {
  
  @scala.inline
  def apply(): VerifyParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifyParams]
  }
  
  @scala.inline
  implicit class VerifyParamsOps[Self <: VerifyParams] (val x: Self) extends AnyVal {
    
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
    def setCheckChain(value: Boolean): Self = this.set("checkChain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckChain: Self = this.set("checkChain", js.undefined)
    
    @scala.inline
    def setCheckDate(value: Date): Self = this.set("checkDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckDate: Self = this.set("checkDate", js.undefined)
    
    @scala.inline
    def setData(value: ArrayBuffer): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setExtendedMode(value: Boolean): Self = this.set("extendedMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtendedMode: Self = this.set("extendedMode", js.undefined)
    
    @scala.inline
    def setIncludeSignerCertificate(value: Boolean): Self = this.set("includeSignerCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeSignerCertificate: Self = this.set("includeSignerCertificate", js.undefined)
    
    @scala.inline
    def setSigner(value: Double): Self = this.set("signer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigner: Self = this.set("signer", js.undefined)
    
    @scala.inline
    def setTrustedCertsVarargs(value: typings.pkijs.certificateMod.default*): Self = this.set("trustedCerts", js.Array(value :_*))
    
    @scala.inline
    def setTrustedCerts(value: js.Array[typings.pkijs.certificateMod.default]): Self = this.set("trustedCerts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrustedCerts: Self = this.set("trustedCerts", js.undefined)
  }
}
