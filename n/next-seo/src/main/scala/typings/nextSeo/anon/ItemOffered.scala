package typings.nextSeo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemOffered extends StObject {
  
  var `@type`: String
  
  var itemOffered: js.UndefOr[Description] = js.undefined
  
  var priceSpecification: js.UndefOr[PriceCurrency] = js.undefined
}
object ItemOffered {
  
  inline def apply(`@type`: String): ItemOffered = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemOffered]
  }
  
  extension [Self <: ItemOffered](x: Self) {
    
    inline def `set@type`(value: String): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
    
    inline def setItemOffered(value: Description): Self = StObject.set(x, "itemOffered", value.asInstanceOf[js.Any])
    
    inline def setItemOfferedUndefined: Self = StObject.set(x, "itemOffered", js.undefined)
    
    inline def setPriceSpecification(value: PriceCurrency): Self = StObject.set(x, "priceSpecification", value.asInstanceOf[js.Any])
    
    inline def setPriceSpecificationUndefined: Self = StObject.set(x, "priceSpecification", js.undefined)
  }
}
