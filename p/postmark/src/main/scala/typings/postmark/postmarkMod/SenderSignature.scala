package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SenderSignature
  extends VerificationDetails
     with SenderSignatureBase {
  var ReturnPathDomainVerified: Boolean
}

object SenderSignature {
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
    SafeToRemoveRevokedKeyFromDNS: Boolean,
    WeakDKIM: Boolean
  ): SenderSignature = {
    val __obj = js.Dynamic.literal(Confirmed = Confirmed, DKIMHost = DKIMHost, DKIMPendingHost = DKIMPendingHost, DKIMPendingTextValue = DKIMPendingTextValue, DKIMRevokedHost = DKIMRevokedHost, DKIMRevokedTextValue = DKIMRevokedTextValue, DKIMTextValue = DKIMTextValue, DKIMUpdateStatus = DKIMUpdateStatus, DKIMVerified = DKIMVerified, Domain = Domain, EmailAddress = EmailAddress, ID = ID, Name = Name, ReplyToEmailAddress = ReplyToEmailAddress, ReturnPathDomain = ReturnPathDomain, ReturnPathDomainCNAMEValue = ReturnPathDomainCNAMEValue, ReturnPathDomainVerified = ReturnPathDomainVerified, SPFHost = SPFHost, SPFTextValue = SPFTextValue, SPFVerified = SPFVerified, SafeToRemoveRevokedKeyFromDNS = SafeToRemoveRevokedKeyFromDNS, WeakDKIM = WeakDKIM)
  
    __obj.asInstanceOf[SenderSignature]
  }
}

