package typings.oakdexPokedex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Nature extends StObject {
  
  var decreased_stat: String | Null = js.native
  
  var disliked_flavor: String | Null = js.native
  
  var favorite_flavor: String | Null = js.native
  
  var increased_stat: String | Null = js.native
  
  var names: Translations = js.native
}
object Nature {
  
  @scala.inline
  def apply(names: Translations): Nature = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nature]
  }
  
  @scala.inline
  implicit class NatureMutableBuilder[Self <: Nature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecreased_stat(value: String): Self = StObject.set(x, "decreased_stat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecreased_statNull: Self = StObject.set(x, "decreased_stat", null)
    
    @scala.inline
    def setDisliked_flavor(value: String): Self = StObject.set(x, "disliked_flavor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisliked_flavorNull: Self = StObject.set(x, "disliked_flavor", null)
    
    @scala.inline
    def setFavorite_flavor(value: String): Self = StObject.set(x, "favorite_flavor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFavorite_flavorNull: Self = StObject.set(x, "favorite_flavor", null)
    
    @scala.inline
    def setIncreased_stat(value: String): Self = StObject.set(x, "increased_stat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncreased_statNull: Self = StObject.set(x, "increased_stat", null)
    
    @scala.inline
    def setNames(value: Translations): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
  }
}
