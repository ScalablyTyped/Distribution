package typings.oakdexPokedex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PokemonEvolution extends StObject {
  
  var conditions: js.UndefOr[js.Array[String]] = js.undefined
  
  var happiness: js.UndefOr[Boolean] = js.undefined
  
  var hold_item: js.UndefOr[String] = js.undefined
  
  var item: js.UndefOr[String] = js.undefined
  
  var level: js.UndefOr[Double] = js.undefined
  
  var level_up: js.UndefOr[Boolean] = js.undefined
  
  var move_learned: js.UndefOr[String] = js.undefined
  
  var to: String
  
  var trade: js.UndefOr[Boolean] = js.undefined
}
object PokemonEvolution {
  
  @scala.inline
  def apply(to: String): PokemonEvolution = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[PokemonEvolution]
  }
  
  @scala.inline
  implicit class PokemonEvolutionMutableBuilder[Self <: PokemonEvolution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConditions(value: js.Array[String]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: String*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    @scala.inline
    def setHappiness(value: Boolean): Self = StObject.set(x, "happiness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHappinessUndefined: Self = StObject.set(x, "happiness", js.undefined)
    
    @scala.inline
    def setHold_item(value: String): Self = StObject.set(x, "hold_item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHold_itemUndefined: Self = StObject.set(x, "hold_item", js.undefined)
    
    @scala.inline
    def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setLevel_up(value: Boolean): Self = StObject.set(x, "level_up", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel_upUndefined: Self = StObject.set(x, "level_up", js.undefined)
    
    @scala.inline
    def setMove_learned(value: String): Self = StObject.set(x, "move_learned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMove_learnedUndefined: Self = StObject.set(x, "move_learned", js.undefined)
    
    @scala.inline
    def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrade(value: Boolean): Self = StObject.set(x, "trade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTradeUndefined: Self = StObject.set(x, "trade", js.undefined)
  }
}
