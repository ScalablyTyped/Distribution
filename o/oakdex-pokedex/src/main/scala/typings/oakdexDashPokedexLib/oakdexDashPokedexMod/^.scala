package typings
package oakdexDashPokedexLib.oakdexDashPokedexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oakdex-pokedex", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def allAbilities(): js.Array[oakdexDashPokedexLib.oakdexDashPokedexMod.Ability] = js.native
  def allAbilities(conditions: oakdexDashPokedexLib.oakdexDashPokedexMod.Conditions): js.Array[oakdexDashPokedexLib.oakdexDashPokedexMod.Ability] = js.native
  def allEggGroups(): js.Array[oakdexDashPokedexLib.oakdexDashPokedexMod.EggGroup] = js.native
  def allEggGroups(conditions: oakdexDashPokedexLib.oakdexDashPokedexMod.Conditions): js.Array[oakdexDashPokedexLib.oakdexDashPokedexMod.EggGroup] = js.native
  def allGenerations(): js.Array[oakdexDashPokedexLib.oakdexDashPokedexMod.Generation] = js.native
  def allGenerations(conditions: oakdexDashPokedexLib.oakdexDashPokedexMod.Conditions): js.Array[oakdexDashPokedexLib.oakdexDashPokedexMod.Generation] = js.native
  def allItems(): js.Array[oakdexDashPokedexLib.oakdexDashPokedexMod.Item] = js.native
  def allItems(conditions: oakdexDashPokedexLib.oakdexDashPokedexMod.Conditions): js.Array[oakdexDashPokedexLib.oakdexDashPokedexMod.Item] = js.native
  def allNatures(): js.Array[oakdexDashPokedexLib.oakdexDashPokedexMod.Nature] = js.native
  def allNatures(conditions: oakdexDashPokedexLib.oakdexDashPokedexMod.Conditions): js.Array[oakdexDashPokedexLib.oakdexDashPokedexMod.Nature] = js.native
  def allPokemon(): js.Array[oakdexDashPokedexLib.oakdexDashPokedexMod.Pokemon] = js.native
  def allPokemon(conditions: oakdexDashPokedexLib.oakdexDashPokedexMod.Conditions): js.Array[oakdexDashPokedexLib.oakdexDashPokedexMod.Pokemon] = js.native
  def allRegions(): js.Array[oakdexDashPokedexLib.oakdexDashPokedexMod.Region] = js.native
  def allRegions(conditions: oakdexDashPokedexLib.oakdexDashPokedexMod.Conditions): js.Array[oakdexDashPokedexLib.oakdexDashPokedexMod.Region] = js.native
  def allTypes(): js.Array[oakdexDashPokedexLib.oakdexDashPokedexMod.PokemonType] = js.native
  def allTypes(conditions: oakdexDashPokedexLib.oakdexDashPokedexMod.Conditions): js.Array[oakdexDashPokedexLib.oakdexDashPokedexMod.PokemonType] = js.native
  def findAbility(name: java.lang.String): oakdexDashPokedexLib.oakdexDashPokedexMod.Ability | scala.Null = js.native
  def findEggGroup(name: java.lang.String): oakdexDashPokedexLib.oakdexDashPokedexMod.EggGroup | scala.Null = js.native
  def findGeneration(name: java.lang.String): oakdexDashPokedexLib.oakdexDashPokedexMod.Generation | scala.Null = js.native
  def findItem(name: java.lang.String): oakdexDashPokedexLib.oakdexDashPokedexMod.Item | scala.Null = js.native
  def findMove(name: java.lang.String): oakdexDashPokedexLib.oakdexDashPokedexMod.Move | scala.Null = js.native
  def findNature(name: java.lang.String): oakdexDashPokedexLib.oakdexDashPokedexMod.Nature | scala.Null = js.native
  def findPokemon(idOrName: java.lang.String): oakdexDashPokedexLib.oakdexDashPokedexMod.Pokemon | scala.Null = js.native
  def findPokemon(idOrName: scala.Double): oakdexDashPokedexLib.oakdexDashPokedexMod.Pokemon | scala.Null = js.native
  def findRegion(name: java.lang.String): oakdexDashPokedexLib.oakdexDashPokedexMod.Region | scala.Null = js.native
  def findType(name: java.lang.String): oakdexDashPokedexLib.oakdexDashPokedexMod.PokemonType | scala.Null = js.native
  def importPokemon(customPokemon: java.lang.String): scala.Unit = js.native
  def importPokemon(customPokemon: js.Array[oakdexDashPokedexLib.oakdexDashPokedexMod.Pokemon | java.lang.String]): scala.Unit = js.native
  def resetPokemon(): scala.Unit = js.native
}

