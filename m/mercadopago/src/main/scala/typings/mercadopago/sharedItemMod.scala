package typings.mercadopago

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sharedItemMod {
  
  trait Item extends StObject {
    
    /** Categoria do item. */
    var category_id: js.UndefOr[String] = js.undefined
    
    /** Descrição do artigo. */
    var description: js.UndefOr[String] = js.undefined
    
    /** URL da imagem. */
    var picture_url: js.UndefOr[String] = js.undefined
    
    /** Quantidade de itens. */
    var quantity: js.UndefOr[Double] = js.undefined
    
    /** Nome do item. */
    var title: js.UndefOr[String] = js.undefined
    
    /** Preço unitário. */
    var unit_price: js.UndefOr[Double] = js.undefined
  }
  object Item {
    
    inline def apply(): Item = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Item]
    }
    
    extension [Self <: Item](x: Self) {
      
      inline def setCategory_id(value: String): Self = StObject.set(x, "category_id", value.asInstanceOf[js.Any])
      
      inline def setCategory_idUndefined: Self = StObject.set(x, "category_id", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setPicture_url(value: String): Self = StObject.set(x, "picture_url", value.asInstanceOf[js.Any])
      
      inline def setPicture_urlUndefined: Self = StObject.set(x, "picture_url", js.undefined)
      
      inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setUnit_price(value: Double): Self = StObject.set(x, "unit_price", value.asInstanceOf[js.Any])
      
      inline def setUnit_priceUndefined: Self = StObject.set(x, "unit_price", js.undefined)
    }
  }
}
