package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerificationDetails
  extends SPFRecord
     with DKIMKey {
  var ReturnPathDomain: String
  var ReturnPathDomainCNAMEValue: String
}

object VerificationDetails {
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
    ReturnPathDomain: String,
    ReturnPathDomainCNAMEValue: String,
    SPFHost: String,
    SPFTextValue: String,
    SPFVerified: Boolean,
    SafeToRemoveRevokedKeyFromDNS: Boolean,
    WeakDKIM: Boolean
  ): VerificationDetails = {
    val __obj = js.Dynamic.literal(DKIMHost = DKIMHost, DKIMPendingHost = DKIMPendingHost, DKIMPendingTextValue = DKIMPendingTextValue, DKIMRevokedHost = DKIMRevokedHost, DKIMRevokedTextValue = DKIMRevokedTextValue, DKIMTextValue = DKIMTextValue, DKIMUpdateStatus = DKIMUpdateStatus, DKIMVerified = DKIMVerified, ReturnPathDomain = ReturnPathDomain, ReturnPathDomainCNAMEValue = ReturnPathDomainCNAMEValue, SPFHost = SPFHost, SPFTextValue = SPFTextValue, SPFVerified = SPFVerified, SafeToRemoveRevokedKeyFromDNS = SafeToRemoveRevokedKeyFromDNS, WeakDKIM = WeakDKIM)
  
    __obj.asInstanceOf[VerificationDetails]
  }
}

