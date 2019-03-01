package typings
package postmarkLib.postmarkMod.PostmarkNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DKIMHost")(DKIMHost)
    __obj.updateDynamic("DKIMPendingHost")(DKIMPendingHost)
    __obj.updateDynamic("DKIMPendingTextValue")(DKIMPendingTextValue)
    __obj.updateDynamic("DKIMRevokedHost")(DKIMRevokedHost)
    __obj.updateDynamic("DKIMRevokedTextValue")(DKIMRevokedTextValue)
    __obj.updateDynamic("DKIMTextValue")(DKIMTextValue)
    __obj.updateDynamic("DKIMUpdateStatus")(DKIMUpdateStatus)
    __obj.updateDynamic("DKIMVerified")(DKIMVerified)
    __obj.updateDynamic("SafeToRemoveRevokedKeyFromDNS")(SafeToRemoveRevokedKeyFromDNS)
    __obj.updateDynamic("WeakDKIM")(WeakDKIM)
    __obj.asInstanceOf[DKIMKey]
  }
}

