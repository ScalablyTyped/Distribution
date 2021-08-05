package typings.phaser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Product extends StObject {
  
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
  
  inline def apply(): Product = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Product]
  }
  
  extension [Self <: Product](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setImageURI(value: String): Self = StObject.set(x, "imageURI", value.asInstanceOf[js.Any])
    
    inline def setImageURIUndefined: Self = StObject.set(x, "imageURI", js.undefined)
    
    inline def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceCurrencyCode(value: String): Self = StObject.set(x, "priceCurrencyCode", value.asInstanceOf[js.Any])
    
    inline def setPriceCurrencyCodeUndefined: Self = StObject.set(x, "priceCurrencyCode", js.undefined)
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setProductID(value: String): Self = StObject.set(x, "productID", value.asInstanceOf[js.Any])
    
    inline def setProductIDUndefined: Self = StObject.set(x, "productID", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
