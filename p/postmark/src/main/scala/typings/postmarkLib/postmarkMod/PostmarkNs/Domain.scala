package typings
package postmarkLib.postmarkMod.PostmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- postmarkLib.postmarkMod.PostmarkNs.DomainBase because var conflicts: DKIMVerified, SPFVerified, WeakDKIM. Inlined ID, Name, ReturnPathDomainVerified */ trait Domain extends VerificationDetails {
  var ID: scala.Double
  var Name: java.lang.String
  var ReturnPathDomainVerified: scala.Boolean
}

object Domain {
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
    ID: scala.Double,
    Name: java.lang.String,
    ReturnPathDomain: java.lang.String,
    ReturnPathDomainCNAMEValue: java.lang.String,
    ReturnPathDomainVerified: scala.Boolean,
    SPFHost: java.lang.String,
    SPFTextValue: java.lang.String,
    SPFVerified: scala.Boolean,
    SafeToRemoveRevokedKeyFromDNS: scala.Boolean,
    WeakDKIM: scala.Boolean
  ): Domain = {
    val __obj = js.Dynamic.literal(DKIMHost = DKIMHost, DKIMPendingHost = DKIMPendingHost, DKIMPendingTextValue = DKIMPendingTextValue, DKIMRevokedHost = DKIMRevokedHost, DKIMRevokedTextValue = DKIMRevokedTextValue, DKIMTextValue = DKIMTextValue, DKIMUpdateStatus = DKIMUpdateStatus, DKIMVerified = DKIMVerified, ID = ID, Name = Name, ReturnPathDomain = ReturnPathDomain, ReturnPathDomainCNAMEValue = ReturnPathDomainCNAMEValue, ReturnPathDomainVerified = ReturnPathDomainVerified, SPFHost = SPFHost, SPFTextValue = SPFTextValue, SPFVerified = SPFVerified, SafeToRemoveRevokedKeyFromDNS = SafeToRemoveRevokedKeyFromDNS, WeakDKIM = WeakDKIM)
  
    __obj.asInstanceOf[Domain]
  }
}

