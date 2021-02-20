package typings.phaser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Product extends StObject {
  
  /**
    * The product description.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * A link to the product's associated image.
    */
  var imageURI: js.UndefOr[String] = js.native
  
  /**
    * The price of the product.
    */
  var price: js.UndefOr[String] = js.native
  
  /**
    * The currency code for the product.
    */
  var priceCurrencyCode: js.UndefOr[String] = js.native
  
  /**
    * The product's game-specified identifier.
    */
  var productID: js.UndefOr[String] = js.native
  
  /**
    * The title of the product.
    */
  var title: js.UndefOr[String] = js.native
}
object Product {
  
  @scala.inline
  def apply(): Product = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Product]
  }
  
  @scala.inline
  implicit class ProductMutableBuilder[Self <: Product] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setImageURI(value: String): Self = StObject.set(x, "imageURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageURIUndefined: Self = StObject.set(x, "imageURI", js.undefined)
    
    @scala.inline
    def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceCurrencyCode(value: String): Self = StObject.set(x, "priceCurrencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceCurrencyCodeUndefined: Self = StObject.set(x, "priceCurrencyCode", js.undefined)
    
    @scala.inline
    def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    @scala.inline
    def setProductID(value: String): Self = StObject.set(x, "productID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIDUndefined: Self = StObject.set(x, "productID", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
