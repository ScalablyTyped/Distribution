package typings
package oakdexDashPokedexLib.oakdexDashPokedexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Move extends js.Object {
  var accuracy: scala.Double
  var affected_by_kings_rock: scala.Boolean
  var affected_by_magic_coat: scala.Boolean
  var affected_by_mirror_move: scala.Boolean
  var affected_by_protect: scala.Boolean
  var affected_by_snatch: scala.Boolean
  var category: java.lang.String
  var contests: js.Array[MoveContest]
  var critical_hit: scala.Double
  var in_battle_properties: js.UndefOr[oakdexDashPokedexLib.Anon_Increasedcriticalhitratio] = js.undefined
  var index_number: scala.Double
  var makes_contact: scala.Boolean
  var max_pp: scala.Double
  var names: Translations
  var pokedex_entries: org.scalablytyped.runtime.StringDictionary[Translations]
  var power: scala.Double
  var pp: scala.Double
  var priority: scala.Double
  var stat_modifiers: js.UndefOr[js.Array[MoveStatModifier]] = js.undefined
  var target: java.lang.String
  var `type`: java.lang.String
}

object Move {
  @scala.inline
  def apply(
    accuracy: scala.Double,
    affected_by_kings_rock: scala.Boolean,
    affected_by_magic_coat: scala.Boolean,
    affected_by_mirror_move: scala.Boolean,
    affected_by_protect: scala.Boolean,
    affected_by_snatch: scala.Boolean,
    category: java.lang.String,
    contests: js.Array[MoveContest],
    critical_hit: scala.Double,
    index_number: scala.Double,
    makes_contact: scala.Boolean,
    max_pp: scala.Double,
    names: Translations,
    pokedex_entries: org.scalablytyped.runtime.StringDictionary[Translations],
    power: scala.Double,
    pp: scala.Double,
    priority: scala.Double,
    target: java.lang.String,
    `type`: java.lang.String,
    in_battle_properties: oakdexDashPokedexLib.Anon_Increasedcriticalhitratio = null,
    stat_modifiers: js.Array[MoveStatModifier] = null
  ): Move = {
    val __obj = js.Dynamic.literal(accuracy = accuracy, affected_by_kings_rock = affected_by_kings_rock, affected_by_magic_coat = affected_by_magic_coat, affected_by_mirror_move = affected_by_mirror_move, affected_by_protect = affected_by_protect, affected_by_snatch = affected_by_snatch, category = category, contests = contests, critical_hit = critical_hit, index_number = index_number, makes_contact = makes_contact, max_pp = max_pp, names = names, pokedex_entries = pokedex_entries, power = power, pp = pp, priority = priority, target = target)
    __obj.updateDynamic("type")(`type`)
    if (in_battle_properties != null) __obj.updateDynamic("in_battle_properties")(in_battle_properties)
    if (stat_modifiers != null) __obj.updateDynamic("stat_modifiers")(stat_modifiers)
    __obj.asInstanceOf[Move]
  }
}

