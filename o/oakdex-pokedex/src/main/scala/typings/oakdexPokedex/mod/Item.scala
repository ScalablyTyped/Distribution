package typings.oakdexPokedex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Item extends StObject {
  
  var category: String
  
  var descriptions: js.Array[ItemDescription]
  
  var effects: js.Array[ItemEffect]
  
  var fling_power: Double
  
  var names: Translations
  
  var pockets: js.Array[ItemPocket]
  
  var prices: js.Array[ItemPrice]
}
object Item {
  
  inline def apply(
    category: String,
    descriptions: js.Array[ItemDescription],
    effects: js.Array[ItemEffect],
    fling_power: Double,
    names: Translations,
    pockets: js.Array[ItemPocket],
    prices: js.Array[ItemPrice]
  ): Item = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], descriptions = descriptions.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any], fling_power = fling_power.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], pockets = pockets.asInstanceOf[js.Any], prices = prices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
  
  extension [Self <: Item](x: Self) {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setDescriptions(value: js.Array[ItemDescription]): Self = StObject.set(x, "descriptions", value.asInstanceOf[js.Any])
    
    inline def setDescriptionsVarargs(value: ItemDescription*): Self = StObject.set(x, "descriptions", js.Array(value*))
    
    inline def setEffects(value: js.Array[ItemEffect]): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
    
    inline def setEffectsVarargs(value: ItemEffect*): Self = StObject.set(x, "effects", js.Array(value*))
    
    inline def setFling_power(value: Double): Self = StObject.set(x, "fling_power", value.asInstanceOf[js.Any])
    
    inline def setNames(value: Translations): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setPockets(value: js.Array[ItemPocket]): Self = StObject.set(x, "pockets", value.asInstanceOf[js.Any])
    
    inline def setPocketsVarargs(value: ItemPocket*): Self = StObject.set(x, "pockets", js.Array(value*))
    
    inline def setPrices(value: js.Array[ItemPrice]): Self = StObject.set(x, "prices", value.asInstanceOf[js.Any])
    
    inline def setPricesVarargs(value: ItemPrice*): Self = StObject.set(x, "prices", js.Array(value*))
  }
}
