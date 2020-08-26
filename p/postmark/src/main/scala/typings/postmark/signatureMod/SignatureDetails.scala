package typings.postmark.signatureMod

import typings.postmark.domainMod.DomainDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignatureDetails extends DomainDetails {
  var Confirmed: Boolean = js.native
  var Domain: String = js.native
  var EmailAddress: String = js.native
  var ReplyToEmailAddress: String = js.native
}

object SignatureDetails {
  @scala.inline
  def apply(
    Confirmed: Boolean,
    DKIMHost: String,
    DKIMPendingHost: String,
    DKIMPendingTextValue: String,
    DKIMRevokedHost: String,
    DKIMRevokedTextValue: String,
    DKIMTextValue: String,
    DKIMUpdateStatus: String,
    DKIMVerified: Boolean,
    Domain: String,
    EmailAddress: String,
    ID: Double,
    Name: String,
    ReplyToEmailAddress: String,
    ReturnPathDomain: String,
    ReturnPathDomainCNAMEValue: String,
    ReturnPathDomainVerified: Boolean,
    SPFHost: String,
    SPFTextValue: String,
    SPFVerified: Boolean,
    SafeToRemoveRevokedKeyFromDNS: String,
    WeakDKIM: Boolean
  ): SignatureDetails = {
    val __obj = js.Dynamic.literal(Confirmed = Confirmed.asInstanceOf[js.Any], DKIMHost = DKIMHost.asInstanceOf[js.Any], DKIMPendingHost = DKIMPendingHost.asInstanceOf[js.Any], DKIMPendingTextValue = DKIMPendingTextValue.asInstanceOf[js.Any], DKIMRevokedHost = DKIMRevokedHost.asInstanceOf[js.Any], DKIMRevokedTextValue = DKIMRevokedTextValue.asInstanceOf[js.Any], DKIMTextValue = DKIMTextValue.asInstanceOf[js.Any], DKIMUpdateStatus = DKIMUpdateStatus.asInstanceOf[js.Any], DKIMVerified = DKIMVerified.asInstanceOf[js.Any], Domain = Domain.asInstanceOf[js.Any], EmailAddress = EmailAddress.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ReplyToEmailAddress = ReplyToEmailAddress.asInstanceOf[js.Any], ReturnPathDomain = ReturnPathDomain.asInstanceOf[js.Any], ReturnPathDomainCNAMEValue = ReturnPathDomainCNAMEValue.asInstanceOf[js.Any], ReturnPathDomainVerified = ReturnPathDomainVerified.asInstanceOf[js.Any], SPFHost = SPFHost.asInstanceOf[js.Any], SPFTextValue = SPFTextValue.asInstanceOf[js.Any], SPFVerified = SPFVerified.asInstanceOf[js.Any], SafeToRemoveRevokedKeyFromDNS = SafeToRemoveRevokedKeyFromDNS.asInstanceOf[js.Any], WeakDKIM = WeakDKIM.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureDetails]
  }
  @scala.inline
  implicit class SignatureDetailsOps[Self <: SignatureDetails] (val x: Self) extends AnyVal {
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
    def setConfirmed(value: Boolean): Self = this.set("Confirmed", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomain(value: String): Self = this.set("Domain", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmailAddress(value: String): Self = this.set("EmailAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplyToEmailAddress(value: String): Self = this.set("ReplyToEmailAddress", value.asInstanceOf[js.Any])
  }
  
}

