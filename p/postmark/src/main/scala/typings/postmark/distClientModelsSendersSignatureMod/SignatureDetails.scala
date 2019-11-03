package typings.postmark.distClientModelsSendersSignatureMod

import typings.postmark.distClientModelsDomainsDomainMod.DomainDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureDetails extends DomainDetails {
  var Confirmed: Boolean
  var Domain: String
  var EmailAddress: String
  var ReplyToEmailAddress: String
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
    SafeToRemoveRevokedKeyFromDNS: String,
    SpfHost: String,
    SpfTextValue: String,
    SpfVerified: Boolean,
    WeakDKIM: Boolean
  ): SignatureDetails = {
    val __obj = js.Dynamic.literal(Confirmed = Confirmed, DKIMHost = DKIMHost, DKIMPendingHost = DKIMPendingHost, DKIMPendingTextValue = DKIMPendingTextValue, DKIMRevokedHost = DKIMRevokedHost, DKIMRevokedTextValue = DKIMRevokedTextValue, DKIMTextValue = DKIMTextValue, DKIMUpdateStatus = DKIMUpdateStatus, DKIMVerified = DKIMVerified, Domain = Domain, EmailAddress = EmailAddress, ID = ID, Name = Name, ReplyToEmailAddress = ReplyToEmailAddress, ReturnPathDomain = ReturnPathDomain, ReturnPathDomainCNAMEValue = ReturnPathDomainCNAMEValue, ReturnPathDomainVerified = ReturnPathDomainVerified, SafeToRemoveRevokedKeyFromDNS = SafeToRemoveRevokedKeyFromDNS, SpfHost = SpfHost, SpfTextValue = SpfTextValue, SpfVerified = SpfVerified, WeakDKIM = WeakDKIM)
  
    __obj.asInstanceOf[SignatureDetails]
  }
}

