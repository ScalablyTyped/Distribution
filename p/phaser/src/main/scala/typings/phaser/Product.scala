package typings.phaser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Product extends js.Object {
  /**
    * The product description.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * A link to the product's associated image.
    */
  var imageURI: js.UndefOr[String] = js.undefined
  /**
    * The price of the product.
    */
  var price: js.UndefOr[String] = js.undefined
  /**
    * The currency code for the product.
    */
  var priceCurrencyCode: js.UndefOr[String] = js.undefined
  /**
    * The product's game-specified identifier.
    */
  var productID: js.UndefOr[String] = js.undefined
  /**
    * The title of the product.
    */
  var title: js.UndefOr[String] = js.undefined
}

object Product {
  @scala.inline
  def apply(
    description: String = null,
    imageURI: String = null,
    price: String = null,
    priceCurrencyCode: String = null,
    productID: String = null,
    title: String = null
  ): Product = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (imageURI != null) __obj.updateDynamic("imageURI")(imageURI)
    if (price != null) __obj.updateDynamic("price")(price)
    if (priceCurrencyCode != null) __obj.updateDynamic("priceCurrencyCode")(priceCurrencyCode)
    if (productID != null) __obj.updateDynamic("productID")(productID)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Product]
  }
}

