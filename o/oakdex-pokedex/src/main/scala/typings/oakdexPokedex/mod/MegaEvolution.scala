package typings.oakdexPokedex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MegaEvolution extends StObject {
  
  var ability: String
  
  var base_stats: StatObject
  
  var height_eu: String
  
  var height_us: String
  
  var image_suffix: js.UndefOr[String] = js.undefined
  
  var mega_stone: String
  
  var types: js.Array[String]
  
  var weight_eu: String
  
  var weight_us: String
}
object MegaEvolution {
  
  inline def apply(
    ability: String,
    base_stats: StatObject,
    height_eu: String,
    height_us: String,
    mega_stone: String,
    types: js.Array[String],
    weight_eu: String,
    weight_us: String
  ): MegaEvolution = {
    val __obj = js.Dynamic.literal(ability = ability.asInstanceOf[js.Any], base_stats = base_stats.asInstanceOf[js.Any], height_eu = height_eu.asInstanceOf[js.Any], height_us = height_us.asInstanceOf[js.Any], mega_stone = mega_stone.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any], weight_eu = weight_eu.asInstanceOf[js.Any], weight_us = weight_us.asInstanceOf[js.Any])
    __obj.asInstanceOf[MegaEvolution]
  }
  
  extension [Self <: MegaEvolution](x: Self) {
    
    inline def setAbility(value: String): Self = StObject.set(x, "ability", value.asInstanceOf[js.Any])
    
    inline def setBase_stats(value: StatObject): Self = StObject.set(x, "base_stats", value.asInstanceOf[js.Any])
    
    inline def setHeight_eu(value: String): Self = StObject.set(x, "height_eu", value.asInstanceOf[js.Any])
    
    inline def setHeight_us(value: String): Self = StObject.set(x, "height_us", value.asInstanceOf[js.Any])
    
    inline def setImage_suffix(value: String): Self = StObject.set(x, "image_suffix", value.asInstanceOf[js.Any])
    
    inline def setImage_suffixUndefined: Self = StObject.set(x, "image_suffix", js.undefined)
    
    inline def setMega_stone(value: String): Self = StObject.set(x, "mega_stone", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value*))
    
    inline def setWeight_eu(value: String): Self = StObject.set(x, "weight_eu", value.asInstanceOf[js.Any])
    
    inline def setWeight_us(value: String): Self = StObject.set(x, "weight_us", value.asInstanceOf[js.Any])
  }
}
