package typings.maximMazurokGapiClientDomains.gapi.client.domains

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterParameters extends js.Object {
  
  /**
    * Indicates whether the domain is available for registration. This value is accurate when obtained by calling `RetrieveRegisterParameters`, but is approximate when obtained by calling
    * `SearchDomains`.
    */
  var availability: js.UndefOr[String] = js.native
  
  /** The domain name. Unicode domain names are expressed in Punycode format. */
  var domainName: js.UndefOr[String] = js.native
  
  /** Notices about special properties of the domain. */
  var domainNotices: js.UndefOr[js.Array[String]] = js.native
  
  /** Contact privacy options that the domain supports. */
  var supportedPrivacy: js.UndefOr[js.Array[String]] = js.native
  
  /** Price to register or renew the domain for one year. */
  var yearlyPrice: js.UndefOr[Money] = js.native
}
object RegisterParameters {
  
  @scala.inline
  def apply(): RegisterParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterParameters]
  }
  
  @scala.inline
  implicit class RegisterParametersOps[Self <: RegisterParameters] (val x: Self) extends AnyVal {
    
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
    def setAvailability(value: String): Self = this.set("availability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailability: Self = this.set("availability", js.undefined)
    
    @scala.inline
    def setDomainName(value: String): Self = this.set("domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainName: Self = this.set("domainName", js.undefined)
    
    @scala.inline
    def setDomainNoticesVarargs(value: String*): Self = this.set("domainNotices", js.Array(value :_*))
    
    @scala.inline
    def setDomainNotices(value: js.Array[String]): Self = this.set("domainNotices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainNotices: Self = this.set("domainNotices", js.undefined)
    
    @scala.inline
    def setSupportedPrivacyVarargs(value: String*): Self = this.set("supportedPrivacy", js.Array(value :_*))
    
    @scala.inline
    def setSupportedPrivacy(value: js.Array[String]): Self = this.set("supportedPrivacy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedPrivacy: Self = this.set("supportedPrivacy", js.undefined)
    
    @scala.inline
    def setYearlyPrice(value: Money): Self = this.set("yearlyPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYearlyPrice: Self = this.set("yearlyPrice", js.undefined)
  }
}
