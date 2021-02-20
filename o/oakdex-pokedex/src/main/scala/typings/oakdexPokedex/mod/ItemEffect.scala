package typings.oakdexPokedex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemEffect extends StObject {
  
  var condition: String = js.native
  
  var move_changes: js.UndefOr[js.Array[ItemMoveChange]] = js.native
  
  var pokemon_changes: js.UndefOr[js.Array[ItemPokemonChange]] = js.native
  
  var target: String = js.native
  
  var triggers_evolution: js.UndefOr[Boolean] = js.native
}
object ItemEffect {
  
  @scala.inline
  def apply(condition: String, target: String): ItemEffect = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemEffect]
  }
  
  @scala.inline
  implicit class ItemEffectMutableBuilder[Self <: ItemEffect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMove_changes(value: js.Array[ItemMoveChange]): Self = StObject.set(x, "move_changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMove_changesUndefined: Self = StObject.set(x, "move_changes", js.undefined)
    
    @scala.inline
    def setMove_changesVarargs(value: ItemMoveChange*): Self = StObject.set(x, "move_changes", js.Array(value :_*))
    
    @scala.inline
    def setPokemon_changes(value: js.Array[ItemPokemonChange]): Self = StObject.set(x, "pokemon_changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPokemon_changesUndefined: Self = StObject.set(x, "pokemon_changes", js.undefined)
    
    @scala.inline
    def setPokemon_changesVarargs(value: ItemPokemonChange*): Self = StObject.set(x, "pokemon_changes", js.Array(value :_*))
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggers_evolution(value: Boolean): Self = StObject.set(x, "triggers_evolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggers_evolutionUndefined: Self = StObject.set(x, "triggers_evolution", js.undefined)
  }
}
