package typings.oakdexDashPokedex.oakdexDashPokedexMod

import org.scalablytyped.runtime.StringDictionary
import typings.oakdexDashPokedex.Anon_Increasedcriticalhitratio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Move extends js.Object {
  var accuracy: Double
  var affected_by_kings_rock: Boolean
  var affected_by_magic_coat: Boolean
  var affected_by_mirror_move: Boolean
  var affected_by_protect: Boolean
  var affected_by_snatch: Boolean
  var category: String
  var contests: js.Array[MoveContest]
  var critical_hit: Double
  var in_battle_properties: js.UndefOr[Anon_Increasedcriticalhitratio] = js.undefined
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
  @scala.inline
  def apply(
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
    `type`: String,
    in_battle_properties: Anon_Increasedcriticalhitratio = null,
    stat_modifiers: js.Array[MoveStatModifier] = null
  ): Move = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], affected_by_kings_rock = affected_by_kings_rock.asInstanceOf[js.Any], affected_by_magic_coat = affected_by_magic_coat.asInstanceOf[js.Any], affected_by_mirror_move = affected_by_mirror_move.asInstanceOf[js.Any], affected_by_protect = affected_by_protect.asInstanceOf[js.Any], affected_by_snatch = affected_by_snatch.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], contests = contests.asInstanceOf[js.Any], critical_hit = critical_hit.asInstanceOf[js.Any], index_number = index_number.asInstanceOf[js.Any], makes_contact = makes_contact.asInstanceOf[js.Any], max_pp = max_pp.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], pokedex_entries = pokedex_entries.asInstanceOf[js.Any], power = power.asInstanceOf[js.Any], pp = pp.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (in_battle_properties != null) __obj.updateDynamic("in_battle_properties")(in_battle_properties.asInstanceOf[js.Any])
    if (stat_modifiers != null) __obj.updateDynamic("stat_modifiers")(stat_modifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Move]
  }
}

