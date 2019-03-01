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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DKIMHost")(DKIMHost)
    __obj.updateDynamic("DKIMPendingHost")(DKIMPendingHost)
    __obj.updateDynamic("DKIMPendingTextValue")(DKIMPendingTextValue)
    __obj.updateDynamic("DKIMRevokedHost")(DKIMRevokedHost)
    __obj.updateDynamic("DKIMRevokedTextValue")(DKIMRevokedTextValue)
    __obj.updateDynamic("DKIMTextValue")(DKIMTextValue)
    __obj.updateDynamic("DKIMUpdateStatus")(DKIMUpdateStatus)
    __obj.updateDynamic("DKIMVerified")(DKIMVerified)
    __obj.updateDynamic("ReturnPathDomain")(ReturnPathDomain)
    __obj.updateDynamic("ReturnPathDomainCNAMEValue")(ReturnPathDomainCNAMEValue)
    __obj.updateDynamic("SPFHost")(SPFHost)
    __obj.updateDynamic("SPFTextValue")(SPFTextValue)
    __obj.updateDynamic("SPFVerified")(SPFVerified)
    __obj.updateDynamic("SafeToRemoveRevokedKeyFromDNS")(SafeToRemoveRevokedKeyFromDNS)
    __obj.updateDynamic("WeakDKIM")(WeakDKIM)
    __obj.asInstanceOf[VerificationDetails]
  }
}

