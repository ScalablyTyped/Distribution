package typings
package postmarkLib.postmarkMod.PostmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerificationDetails
  extends SPFRecord
     with DKIMKey {
  var ReturnPathDomain: java.lang.String
  var ReturnPathDomainCNAMEValue: java.lang.String
}

object VerificationDetails {
  @scala.inline
  def apply(
    DKIMHost: java.lang.String,
    DKIMPendingHost: java.lang.String,
    DKIMPendingTextValue: java.lang.String,
    DKIMRevokedHost: java.lang.String,
    DKIMRevokedTextValue: java.lang.String,
    DKIMTextValue: java.lang.String,
    DKIMUpdateStatus: java.lang.String,
    DKIMVerified: scala.Boolean,
    ReturnPathDomain: java.lang.String,
    ReturnPathDomainCNAMEValue: java.lang.String,
    SPFHost: java.lang.String,
    SPFTextValue: java.lang.String,
    SPFVerified: scala.Boolean,
    SafeToRemoveRevokedKeyFromDNS: scala.Boolean,
    WeakDKIM: scala.Boolean
  ): VerificationDetails = {
    val __obj = js.Dynamic.literal(DKIMHost = DKIMHost, DKIMPendingHost = DKIMPendingHost, DKIMPendingTextValue = DKIMPendingTextValue, DKIMRevokedHost = DKIMRevokedHost, DKIMRevokedTextValue = DKIMRevokedTextValue, DKIMTextValue = DKIMTextValue, DKIMUpdateStatus = DKIMUpdateStatus, DKIMVerified = DKIMVerified, ReturnPathDomain = ReturnPathDomain, ReturnPathDomainCNAMEValue = ReturnPathDomainCNAMEValue, SPFHost = SPFHost, SPFTextValue = SPFTextValue, SPFVerified = SPFVerified, SafeToRemoveRevokedKeyFromDNS = SafeToRemoveRevokedKeyFromDNS, WeakDKIM = WeakDKIM)
  
    __obj.asInstanceOf[VerificationDetails]
  }
}

