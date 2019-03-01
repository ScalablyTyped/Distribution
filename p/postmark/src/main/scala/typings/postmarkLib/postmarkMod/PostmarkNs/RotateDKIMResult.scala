package typings
package postmarkLib.postmarkMod.PostmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RotateDKIMResult extends DKIMKey {
  var ID: java.lang.String
  var Name: java.lang.String
}

object RotateDKIMResult {
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
    ID: java.lang.String,
    Name: java.lang.String,
    SafeToRemoveRevokedKeyFromDNS: scala.Boolean,
    WeakDKIM: scala.Boolean
  ): RotateDKIMResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DKIMHost")(DKIMHost)
    __obj.updateDynamic("DKIMPendingHost")(DKIMPendingHost)
    __obj.updateDynamic("DKIMPendingTextValue")(DKIMPendingTextValue)
    __obj.updateDynamic("DKIMRevokedHost")(DKIMRevokedHost)
    __obj.updateDynamic("DKIMRevokedTextValue")(DKIMRevokedTextValue)
    __obj.updateDynamic("DKIMTextValue")(DKIMTextValue)
    __obj.updateDynamic("DKIMUpdateStatus")(DKIMUpdateStatus)
    __obj.updateDynamic("DKIMVerified")(DKIMVerified)
    __obj.updateDynamic("ID")(ID)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("SafeToRemoveRevokedKeyFromDNS")(SafeToRemoveRevokedKeyFromDNS)
    __obj.updateDynamic("WeakDKIM")(WeakDKIM)
    __obj.asInstanceOf[RotateDKIMResult]
  }
}

