package typings
package postmarkLib.postmarkMod.PostmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SenderSignature
  extends VerificationDetails
     with SenderSignatureBase {
  var ReturnPathDomainVerified: scala.Boolean
}

object SenderSignature {
  @scala.inline
  def apply(
    Confirmed: scala.Boolean,
    DKIMHost: java.lang.String,
    DKIMPendingHost: java.lang.String,
    DKIMPendingTextValue: java.lang.String,
    DKIMRevokedHost: java.lang.String,
    DKIMRevokedTextValue: java.lang.String,
    DKIMTextValue: java.lang.String,
    DKIMUpdateStatus: java.lang.String,
    DKIMVerified: scala.Boolean,
    Domain: java.lang.String,
    EmailAddress: java.lang.String,
    ID: scala.Double,
    Name: java.lang.String,
    ReplyToEmailAddress: java.lang.String,
    ReturnPathDomain: java.lang.String,
    ReturnPathDomainCNAMEValue: java.lang.String,
    ReturnPathDomainVerified: scala.Boolean,
    SPFHost: java.lang.String,
    SPFTextValue: java.lang.String,
    SPFVerified: scala.Boolean,
    SafeToRemoveRevokedKeyFromDNS: scala.Boolean,
    WeakDKIM: scala.Boolean
  ): SenderSignature = {
    val __obj = js.Dynamic.literal(Confirmed = Confirmed, DKIMHost = DKIMHost, DKIMPendingHost = DKIMPendingHost, DKIMPendingTextValue = DKIMPendingTextValue, DKIMRevokedHost = DKIMRevokedHost, DKIMRevokedTextValue = DKIMRevokedTextValue, DKIMTextValue = DKIMTextValue, DKIMUpdateStatus = DKIMUpdateStatus, DKIMVerified = DKIMVerified, Domain = Domain, EmailAddress = EmailAddress, ID = ID, Name = Name, ReplyToEmailAddress = ReplyToEmailAddress, ReturnPathDomain = ReturnPathDomain, ReturnPathDomainCNAMEValue = ReturnPathDomainCNAMEValue, ReturnPathDomainVerified = ReturnPathDomainVerified, SPFHost = SPFHost, SPFTextValue = SPFTextValue, SPFVerified = SPFVerified, SafeToRemoveRevokedKeyFromDNS = SafeToRemoveRevokedKeyFromDNS, WeakDKIM = WeakDKIM)
  
    __obj.asInstanceOf[SenderSignature]
  }
}

