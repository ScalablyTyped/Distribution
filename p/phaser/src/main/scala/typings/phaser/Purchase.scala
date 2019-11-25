package typings.phaser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Purchase extends js.Object {
  /**
    * A developer-specified string, provided during the purchase of the product.
    */
  var developerPayload: js.UndefOr[String] = js.undefined
  /**
    * The identifier for the purchase transaction.
    */
  var paymentID: js.UndefOr[String] = js.undefined
  /**
    * The product's game-specified identifier.
    */
  var productID: js.UndefOr[String] = js.undefined
  /**
    * Unix timestamp of when the purchase occurred.
    */
  var purchaseTime: js.UndefOr[String] = js.undefined
  /**
    * A token representing the purchase that may be used to consume the purchase.
    */
  var purchaseToken: js.UndefOr[String] = js.undefined
  /**
    * Server-signed encoding of the purchase request.
    */
  var signedRequest: js.UndefOr[String] = js.undefined
}

object Purchase {
  @scala.inline
  def apply(
    developerPayload: String = null,
    paymentID: String = null,
    productID: String = null,
    purchaseTime: String = null,
    purchaseToken: String = null,
    signedRequest: String = null
  ): Purchase = {
    val __obj = js.Dynamic.literal()
    if (developerPayload != null) __obj.updateDynamic("developerPayload")(developerPayload.asInstanceOf[js.Any])
    if (paymentID != null) __obj.updateDynamic("paymentID")(paymentID.asInstanceOf[js.Any])
    if (productID != null) __obj.updateDynamic("productID")(productID.asInstanceOf[js.Any])
    if (purchaseTime != null) __obj.updateDynamic("purchaseTime")(purchaseTime.asInstanceOf[js.Any])
    if (purchaseToken != null) __obj.updateDynamic("purchaseToken")(purchaseToken.asInstanceOf[js.Any])
    if (signedRequest != null) __obj.updateDynamic("signedRequest")(signedRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Purchase]
  }
}

