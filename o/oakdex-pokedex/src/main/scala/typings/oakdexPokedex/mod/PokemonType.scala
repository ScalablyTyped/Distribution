package typings.oakdexPokedex.mod

import typings.oakdexPokedex.anon.Bug
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PokemonType extends StObject {
  
  var color: String
  
  var effectivness: Bug
  
  var names: Translations
}
object PokemonType {
  
  inline def apply(color: String, effectivness: Bug, names: Translations): PokemonType = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], effectivness = effectivness.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[PokemonType]
  }
  
  extension [Self <: PokemonType](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setEffectivness(value: Bug): Self = StObject.set(x, "effectivness", value.asInstanceOf[js.Any])
    
    inline def setNames(value: Translations): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
  }
}
