package typings
package phaserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Purchase extends js.Object {
  /**
    * A developer-specified string, provided during the purchase of the product.
    */
  var developerPayload: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The identifier for the purchase transaction.
    */
  var paymentID: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The product's game-specified identifier.
    */
  var productID: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Unix timestamp of when the purchase occurred.
    */
  var purchaseTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A token representing the purchase that may be used to consume the purchase.
    */
  var purchaseToken: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Server-signed encoding of the purchase request.
    */
  var signedRequest: js.UndefOr[java.lang.String] = js.undefined
}

object Purchase {
  @scala.inline
  def apply(
    developerPayload: java.lang.String = null,
    paymentID: java.lang.String = null,
    productID: java.lang.String = null,
    purchaseTime: java.lang.String = null,
    purchaseToken: java.lang.String = null,
    signedRequest: java.lang.String = null
  ): Purchase = {
    val __obj = js.Dynamic.literal()
    if (developerPayload != null) __obj.updateDynamic("developerPayload")(developerPayload)
    if (paymentID != null) __obj.updateDynamic("paymentID")(paymentID)
    if (productID != null) __obj.updateDynamic("productID")(productID)
    if (purchaseTime != null) __obj.updateDynamic("purchaseTime")(purchaseTime)
    if (purchaseToken != null) __obj.updateDynamic("purchaseToken")(purchaseToken)
    if (signedRequest != null) __obj.updateDynamic("signedRequest")(signedRequest)
    __obj.asInstanceOf[Purchase]
  }
}

