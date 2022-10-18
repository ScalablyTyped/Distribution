package typings.nextSeo.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Offer extends StObject {
  
  var itemOffered: Service
  
  var priceSpecification: PriceSpecification
}
object Offer {
  
  inline def apply(itemOffered: Service, priceSpecification: PriceSpecification): Offer = {
    val __obj = js.Dynamic.literal(itemOffered = itemOffered.asInstanceOf[js.Any], priceSpecification = priceSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offer]
  }
  
  extension [Self <: Offer](x: Self) {
    
    inline def setItemOffered(value: Service): Self = StObject.set(x, "itemOffered", value.asInstanceOf[js.Any])
    
    inline def setPriceSpecification(value: PriceSpecification): Self = StObject.set(x, "priceSpecification", value.asInstanceOf[js.Any])
  }
}
