package typings
package postmarkLib.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DKIMKey extends js.Object {
  var DKIMHost: java.lang.String
  var DKIMPendingHost: java.lang.String
  var DKIMPendingTextValue: java.lang.String
  var DKIMRevokedHost: java.lang.String
  var DKIMRevokedTextValue: java.lang.String
  var DKIMTextValue: java.lang.String
  var DKIMUpdateStatus: java.lang.String
  var DKIMVerified: scala.Boolean
  var SafeToRemoveRevokedKeyFromDNS: scala.Boolean
  var WeakDKIM: scala.Boolean
}

object DKIMKey {
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
    SafeToRemoveRevokedKeyFromDNS: scala.Boolean,
    WeakDKIM: scala.Boolean
  ): DKIMKey = {
    val __obj = js.Dynamic.literal(DKIMHost = DKIMHost, DKIMPendingHost = DKIMPendingHost, DKIMPendingTextValue = DKIMPendingTextValue, DKIMRevokedHost = DKIMRevokedHost, DKIMRevokedTextValue = DKIMRevokedTextValue, DKIMTextValue = DKIMTextValue, DKIMUpdateStatus = DKIMUpdateStatus, DKIMVerified = DKIMVerified, SafeToRemoveRevokedKeyFromDNS = SafeToRemoveRevokedKeyFromDNS, WeakDKIM = WeakDKIM)
  
    __obj.asInstanceOf[DKIMKey]
  }
}

