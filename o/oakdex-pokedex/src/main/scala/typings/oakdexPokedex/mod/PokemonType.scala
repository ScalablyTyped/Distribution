package typings.oakdexPokedex.mod

import typings.oakdexPokedex.anon.Bug
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PokemonType extends StObject {
  
  var color: String = js.native
  
  var effectivness: Bug = js.native
  
  var names: Translations = js.native
}
object PokemonType {
  
  @scala.inline
  def apply(color: String, effectivness: Bug, names: Translations): PokemonType = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], effectivness = effectivness.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[PokemonType]
  }
  
  @scala.inline
  implicit class PokemonTypeMutableBuilder[Self <: PokemonType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectivness(value: Bug): Self = StObject.set(x, "effectivness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNames(value: Translations): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
  }
}
