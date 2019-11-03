package typings.postmark.distClientModelsDomainsDomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainDetails extends Domain {
  var DKIMHost: String
  var DKIMPendingHost: String
  var DKIMPendingTextValue: String
  var DKIMRevokedHost: String
  var DKIMRevokedTextValue: String
  var DKIMTextValue: String
  var DKIMUpdateStatus: String
  var ReturnPathDomain: String
  var ReturnPathDomainCNAMEValue: String
  var SafeToRemoveRevokedKeyFromDNS: String
  var SpfHost: String
  var SpfTextValue: String
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
    SafeToRemoveRevokedKeyFromDNS: String,
    SpfHost: String,
    SpfTextValue: String,
    SpfVerified: Boolean,
    WeakDKIM: Boolean
  ): DomainDetails = {
    val __obj = js.Dynamic.literal(DKIMHost = DKIMHost, DKIMPendingHost = DKIMPendingHost, DKIMPendingTextValue = DKIMPendingTextValue, DKIMRevokedHost = DKIMRevokedHost, DKIMRevokedTextValue = DKIMRevokedTextValue, DKIMTextValue = DKIMTextValue, DKIMUpdateStatus = DKIMUpdateStatus, DKIMVerified = DKIMVerified, ID = ID, Name = Name, ReturnPathDomain = ReturnPathDomain, ReturnPathDomainCNAMEValue = ReturnPathDomainCNAMEValue, ReturnPathDomainVerified = ReturnPathDomainVerified, SafeToRemoveRevokedKeyFromDNS = SafeToRemoveRevokedKeyFromDNS, SpfHost = SpfHost, SpfTextValue = SpfTextValue, SpfVerified = SpfVerified, WeakDKIM = WeakDKIM)
  
    __obj.asInstanceOf[DomainDetails]
  }
}

