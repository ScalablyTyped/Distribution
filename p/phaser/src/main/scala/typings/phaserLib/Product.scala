package typings
package phaserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Product extends js.Object {
  /**
    * The product description.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A link to the product's associated image.
    */
  var imageURI: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The price of the product.
    */
  var price: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The currency code for the product.
    */
  var priceCurrencyCode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The product's game-specified identifier.
    */
  var productID: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The title of the product.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Product {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    imageURI: java.lang.String = null,
    price: java.lang.String = null,
    priceCurrencyCode: java.lang.String = null,
    productID: java.lang.String = null,
    title: java.lang.String = null
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

