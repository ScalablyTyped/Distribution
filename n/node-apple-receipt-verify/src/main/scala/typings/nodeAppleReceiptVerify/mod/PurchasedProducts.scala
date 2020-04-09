package typings.nodeAppleReceiptVerify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PurchasedProducts extends js.Object {
   // only if extended = true
  var applicationVersion: js.UndefOr[String] = js.undefined
  var bundleId: String
   // only for subscriptions and if extended = true; since v1.5.1
  var environment: js.UndefOr[String] = js.undefined
  var expirationDate: js.UndefOr[Double] = js.undefined
   // only for subscriptions and if extended = true
  var isInIntroOfferPeriod: js.UndefOr[Boolean] = js.undefined
  var isTrialPeriod: js.UndefOr[Boolean] = js.undefined
   // only if extended = true
  var originalApplicationVersion: js.UndefOr[String] = js.undefined
   // only if extended = true
  var originalPurchaseDate: js.UndefOr[Double] = js.undefined
  var productId: String
  var purchaseDate: Double
  var quantity: Double
  var transactionId: String
}

object PurchasedProducts {
  @scala.inline
  def apply(
    bundleId: String,
    productId: String,
    purchaseDate: Double,
    quantity: Double,
    transactionId: String,
    applicationVersion: String = null,
    environment: String = null,
    expirationDate: Int | Double = null,
    isInIntroOfferPeriod: js.UndefOr[Boolean] = js.undefined,
    isTrialPeriod: js.UndefOr[Boolean] = js.undefined,
    originalApplicationVersion: String = null,
    originalPurchaseDate: Int | Double = null
  ): PurchasedProducts = {
    val __obj = js.Dynamic.literal(bundleId = bundleId.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], purchaseDate = purchaseDate.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], transactionId = transactionId.asInstanceOf[js.Any])
    if (applicationVersion != null) __obj.updateDynamic("applicationVersion")(applicationVersion.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate.asInstanceOf[js.Any])
    if (!js.isUndefined(isInIntroOfferPeriod)) __obj.updateDynamic("isInIntroOfferPeriod")(isInIntroOfferPeriod.asInstanceOf[js.Any])
    if (!js.isUndefined(isTrialPeriod)) __obj.updateDynamic("isTrialPeriod")(isTrialPeriod.asInstanceOf[js.Any])
    if (originalApplicationVersion != null) __obj.updateDynamic("originalApplicationVersion")(originalApplicationVersion.asInstanceOf[js.Any])
    if (originalPurchaseDate != null) __obj.updateDynamic("originalPurchaseDate")(originalPurchaseDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchasedProducts]
  }
}

