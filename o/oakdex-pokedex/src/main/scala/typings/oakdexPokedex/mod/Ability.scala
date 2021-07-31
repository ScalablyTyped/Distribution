package typings.oakdexPokedex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ability extends StObject {
  
  var descriptions: Translations
  
  var index_number: Double
  
  var names: Translations
}
object Ability {
  
  @scala.inline
  def apply(descriptions: Translations, index_number: Double, names: Translations): Ability = {
    val __obj = js.Dynamic.literal(descriptions = descriptions.asInstanceOf[js.Any], index_number = index_number.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ability]
  }
  
  @scala.inline
  implicit class AbilityMutableBuilder[Self <: Ability] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescriptions(value: Translations): Self = StObject.set(x, "descriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex_number(value: Double): Self = StObject.set(x, "index_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNames(value: Translations): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
  }
}
