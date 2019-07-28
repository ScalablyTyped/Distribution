package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DKIMKey extends js.Object {
  var DKIMHost: String
  var DKIMPendingHost: String
  var DKIMPendingTextValue: String
  var DKIMRevokedHost: String
  var DKIMRevokedTextValue: String
  var DKIMTextValue: String
  var DKIMUpdateStatus: String
  var DKIMVerified: Boolean
  var SafeToRemoveRevokedKeyFromDNS: Boolean
  var WeakDKIM: Boolean
}

object DKIMKey {
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
    SafeToRemoveRevokedKeyFromDNS: Boolean,
    WeakDKIM: Boolean
  ): DKIMKey = {
    val __obj = js.Dynamic.literal(DKIMHost = DKIMHost, DKIMPendingHost = DKIMPendingHost, DKIMPendingTextValue = DKIMPendingTextValue, DKIMRevokedHost = DKIMRevokedHost, DKIMRevokedTextValue = DKIMRevokedTextValue, DKIMTextValue = DKIMTextValue, DKIMUpdateStatus = DKIMUpdateStatus, DKIMVerified = DKIMVerified, SafeToRemoveRevokedKeyFromDNS = SafeToRemoveRevokedKeyFromDNS, WeakDKIM = WeakDKIM)
  
    __obj.asInstanceOf[DKIMKey]
  }
}

