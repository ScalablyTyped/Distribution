package typings.oakdexPokedex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemEffect extends StObject {
  
  var condition: String
  
  var move_changes: js.UndefOr[js.Array[ItemMoveChange]] = js.undefined
  
  var pokemon_changes: js.UndefOr[js.Array[ItemPokemonChange]] = js.undefined
  
  var target: String
  
  var triggers_evolution: js.UndefOr[Boolean] = js.undefined
}
object ItemEffect {
  
  inline def apply(condition: String, target: String): ItemEffect = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemEffect]
  }
  
  extension [Self <: ItemEffect](x: Self) {
    
    inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setMove_changes(value: js.Array[ItemMoveChange]): Self = StObject.set(x, "move_changes", value.asInstanceOf[js.Any])
    
    inline def setMove_changesUndefined: Self = StObject.set(x, "move_changes", js.undefined)
    
    inline def setMove_changesVarargs(value: ItemMoveChange*): Self = StObject.set(x, "move_changes", js.Array(value*))
    
    inline def setPokemon_changes(value: js.Array[ItemPokemonChange]): Self = StObject.set(x, "pokemon_changes", value.asInstanceOf[js.Any])
    
    inline def setPokemon_changesUndefined: Self = StObject.set(x, "pokemon_changes", js.undefined)
    
    inline def setPokemon_changesVarargs(value: ItemPokemonChange*): Self = StObject.set(x, "pokemon_changes", js.Array(value*))
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTriggers_evolution(value: Boolean): Self = StObject.set(x, "triggers_evolution", value.asInstanceOf[js.Any])
    
    inline def setTriggers_evolutionUndefined: Self = StObject.set(x, "triggers_evolution", js.undefined)
  }
}
