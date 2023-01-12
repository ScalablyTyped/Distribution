package typings.oakdexPokedex.mod

import org.scalablytyped.runtime.StringDictionary
import typings.oakdexPokedex.anon.Increasedcriticalhitratio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Move extends StObject {
  
  var accuracy: Double
  
  var affected_by_kings_rock: Boolean
  
  var affected_by_magic_coat: Boolean
  
  var affected_by_mirror_move: Boolean
  
  var affected_by_protect: Boolean
  
  var affected_by_snatch: Boolean
  
  var category: String
  
  var contests: js.Array[MoveContest]
  
  var critical_hit: Double
  
  var in_battle_properties: js.UndefOr[Increasedcriticalhitratio] = js.undefined
  
  var index_number: Double
  
  var makes_contact: Boolean
  
  var max_pp: Double
  
  var names: Translations
  
  var pokedex_entries: StringDictionary[Translations]
  
  var power: Double
  
  var pp: Double
  
  var priority: Double
  
  var stat_modifiers: js.UndefOr[js.Array[MoveStatModifier]] = js.undefined
  
  var target: String
  
  var `type`: String
}
object Move {
  
  inline def apply(
    accuracy: Double,
    affected_by_kings_rock: Boolean,
    affected_by_magic_coat: Boolean,
    affected_by_mirror_move: Boolean,
    affected_by_protect: Boolean,
    affected_by_snatch: Boolean,
    category: String,
    contests: js.Array[MoveContest],
    critical_hit: Double,
    index_number: Double,
    makes_contact: Boolean,
    max_pp: Double,
    names: Translations,
    pokedex_entries: StringDictionary[Translations],
    power: Double,
    pp: Double,
    priority: Double,
    target: String,
    `type`: String
  ): Move = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], affected_by_kings_rock = affected_by_kings_rock.asInstanceOf[js.Any], affected_by_magic_coat = affected_by_magic_coat.asInstanceOf[js.Any], affected_by_mirror_move = affected_by_mirror_move.asInstanceOf[js.Any], affected_by_protect = affected_by_protect.asInstanceOf[js.Any], affected_by_snatch = affected_by_snatch.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], contests = contests.asInstanceOf[js.Any], critical_hit = critical_hit.asInstanceOf[js.Any], index_number = index_number.asInstanceOf[js.Any], makes_contact = makes_contact.asInstanceOf[js.Any], max_pp = max_pp.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], pokedex_entries = pokedex_entries.asInstanceOf[js.Any], power = power.asInstanceOf[js.Any], pp = pp.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Move]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Move] (val x: Self) extends AnyVal {
    
    inline def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    inline def setAffected_by_kings_rock(value: Boolean): Self = StObject.set(x, "affected_by_kings_rock", value.asInstanceOf[js.Any])
    
    inline def setAffected_by_magic_coat(value: Boolean): Self = StObject.set(x, "affected_by_magic_coat", value.asInstanceOf[js.Any])
    
    inline def setAffected_by_mirror_move(value: Boolean): Self = StObject.set(x, "affected_by_mirror_move", value.asInstanceOf[js.Any])
    
    inline def setAffected_by_protect(value: Boolean): Self = StObject.set(x, "affected_by_protect", value.asInstanceOf[js.Any])
    
    inline def setAffected_by_snatch(value: Boolean): Self = StObject.set(x, "affected_by_snatch", value.asInstanceOf[js.Any])
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setContests(value: js.Array[MoveContest]): Self = StObject.set(x, "contests", value.asInstanceOf[js.Any])
    
    inline def setContestsVarargs(value: MoveContest*): Self = StObject.set(x, "contests", js.Array(value*))
    
    inline def setCritical_hit(value: Double): Self = StObject.set(x, "critical_hit", value.asInstanceOf[js.Any])
    
    inline def setIn_battle_properties(value: Increasedcriticalhitratio): Self = StObject.set(x, "in_battle_properties", value.asInstanceOf[js.Any])
    
    inline def setIn_battle_propertiesUndefined: Self = StObject.set(x, "in_battle_properties", js.undefined)
    
    inline def setIndex_number(value: Double): Self = StObject.set(x, "index_number", value.asInstanceOf[js.Any])
    
    inline def setMakes_contact(value: Boolean): Self = StObject.set(x, "makes_contact", value.asInstanceOf[js.Any])
    
    inline def setMax_pp(value: Double): Self = StObject.set(x, "max_pp", value.asInstanceOf[js.Any])
    
    inline def setNames(value: Translations): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setPokedex_entries(value: StringDictionary[Translations]): Self = StObject.set(x, "pokedex_entries", value.asInstanceOf[js.Any])
    
    inline def setPower(value: Double): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
    
    inline def setPp(value: Double): Self = StObject.set(x, "pp", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setStat_modifiers(value: js.Array[MoveStatModifier]): Self = StObject.set(x, "stat_modifiers", value.asInstanceOf[js.Any])
    
    inline def setStat_modifiersUndefined: Self = StObject.set(x, "stat_modifiers", js.undefined)
    
    inline def setStat_modifiersVarargs(value: MoveStatModifier*): Self = StObject.set(x, "stat_modifiers", js.Array(value*))
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
