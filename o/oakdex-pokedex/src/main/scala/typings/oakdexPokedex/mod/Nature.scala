package typings.oakdexPokedex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nature extends StObject {
  
  var decreased_stat: String | Null
  
  var disliked_flavor: String | Null
  
  var favorite_flavor: String | Null
  
  var increased_stat: String | Null
  
  var names: Translations
}
object Nature {
  
  inline def apply(names: Translations): Nature = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any], decreased_stat = null, disliked_flavor = null, favorite_flavor = null, increased_stat = null)
    __obj.asInstanceOf[Nature]
  }
  
  extension [Self <: Nature](x: Self) {
    
    inline def setDecreased_stat(value: String): Self = StObject.set(x, "decreased_stat", value.asInstanceOf[js.Any])
    
    inline def setDecreased_statNull: Self = StObject.set(x, "decreased_stat", null)
    
    inline def setDisliked_flavor(value: String): Self = StObject.set(x, "disliked_flavor", value.asInstanceOf[js.Any])
    
    inline def setDisliked_flavorNull: Self = StObject.set(x, "disliked_flavor", null)
    
    inline def setFavorite_flavor(value: String): Self = StObject.set(x, "favorite_flavor", value.asInstanceOf[js.Any])
    
    inline def setFavorite_flavorNull: Self = StObject.set(x, "favorite_flavor", null)
    
    inline def setIncreased_stat(value: String): Self = StObject.set(x, "increased_stat", value.asInstanceOf[js.Any])
    
    inline def setIncreased_statNull: Self = StObject.set(x, "increased_stat", null)
    
    inline def setNames(value: Translations): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
  }
}
