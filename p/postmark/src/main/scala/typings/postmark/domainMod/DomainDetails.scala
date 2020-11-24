package typings.postmark.domainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainDetails extends Domain {
  
  var DKIMHost: String = js.native
  
  var DKIMPendingHost: String = js.native
  
  var DKIMPendingTextValue: String = js.native
  
  var DKIMRevokedHost: String = js.native
  
  var DKIMRevokedTextValue: String = js.native
  
  var DKIMTextValue: String = js.native
  
  var DKIMUpdateStatus: String = js.native
  
  var ReturnPathDomain: String = js.native
  
  var ReturnPathDomainCNAMEValue: String = js.native
  
  var SPFHost: String = js.native
  
  var SPFTextValue: String = js.native
  
  var SafeToRemoveRevokedKeyFromDNS: String = js.native
}
object DomainDetails {
  
  @scala.inline
  def apply(
    DKIMHost: String,
    DKIMPendingHost: String,
    DKIMPendingTextValue: String,
    DKIMRevokedHost: String,
    DKIMRevokedTextValue: String,
    DKIMTextValue: String,
    DKIMUpdateStatus: String,
    DKIMVerified: Boolean,
    ID: Double,
    Name: String,
    ReturnPathDomain: String,
    ReturnPathDomainCNAMEValue: String,
    ReturnPathDomainVerified: Boolean,
    SPFHost: String,
    SPFTextValue: String,
    SPFVerified: Boolean,
    SafeToRemoveRevokedKeyFromDNS: String,
    WeakDKIM: Boolean
  ): DomainDetails = {
    val __obj = js.Dynamic.literal(DKIMHost = DKIMHost.asInstanceOf[js.Any], DKIMPendingHost = DKIMPendingHost.asInstanceOf[js.Any], DKIMPendingTextValue = DKIMPendingTextValue.asInstanceOf[js.Any], DKIMRevokedHost = DKIMRevokedHost.asInstanceOf[js.Any], DKIMRevokedTextValue = DKIMRevokedTextValue.asInstanceOf[js.Any], DKIMTextValue = DKIMTextValue.asInstanceOf[js.Any], DKIMUpdateStatus = DKIMUpdateStatus.asInstanceOf[js.Any], DKIMVerified = DKIMVerified.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ReturnPathDomain = ReturnPathDomain.asInstanceOf[js.Any], ReturnPathDomainCNAMEValue = ReturnPathDomainCNAMEValue.asInstanceOf[js.Any], ReturnPathDomainVerified = ReturnPathDomainVerified.asInstanceOf[js.Any], SPFHost = SPFHost.asInstanceOf[js.Any], SPFTextValue = SPFTextValue.asInstanceOf[js.Any], SPFVerified = SPFVerified.asInstanceOf[js.Any], SafeToRemoveRevokedKeyFromDNS = SafeToRemoveRevokedKeyFromDNS.asInstanceOf[js.Any], WeakDKIM = WeakDKIM.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainDetails]
  }
  
  @scala.inline
  implicit class DomainDetailsOps[Self <: DomainDetails] (val x: Self) extends AnyVal {
    
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
    def setDKIMHost(value: String): Self = this.set("DKIMHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDKIMPendingHost(value: String): Self = this.set("DKIMPendingHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDKIMPendingTextValue(value: String): Self = this.set("DKIMPendingTextValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDKIMRevokedHost(value: String): Self = this.set("DKIMRevokedHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDKIMRevokedTextValue(value: String): Self = this.set("DKIMRevokedTextValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDKIMTextValue(value: String): Self = this.set("DKIMTextValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDKIMUpdateStatus(value: String): Self = this.set("DKIMUpdateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnPathDomain(value: String): Self = this.set("ReturnPathDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnPathDomainCNAMEValue(value: String): Self = this.set("ReturnPathDomainCNAMEValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSPFHost(value: String): Self = this.set("SPFHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSPFTextValue(value: String): Self = this.set("SPFTextValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafeToRemoveRevokedKeyFromDNS(value: String): Self = this.set("SafeToRemoveRevokedKeyFromDNS", value.asInstanceOf[js.Any])
  }
}
