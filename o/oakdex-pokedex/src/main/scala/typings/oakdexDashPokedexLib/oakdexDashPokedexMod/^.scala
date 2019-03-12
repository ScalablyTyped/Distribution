package typings
package oakdexDashPokedexLib.oakdexDashPokedexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oakdex-pokedex", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def allAbilities(): js.Array[Ability] = js.native
  def allAbilities(conditions: Conditions): js.Array[Ability] = js.native
  def allEggGroups(): js.Array[EggGroup] = js.native
  def allEggGroups(conditions: Conditions): js.Array[EggGroup] = js.native
  def allGenerations(): js.Array[Generation] = js.native
  def allGenerations(conditions: Conditions): js.Array[Generation] = js.native
  def allItems(): js.Array[Item] = js.native
  def allItems(conditions: Conditions): js.Array[Item] = js.native
  def allNatures(): js.Array[Nature] = js.native
  def allNatures(conditions: Conditions): js.Array[Nature] = js.native
  def allPokemon(): js.Array[Pokemon] = js.native
  def allPokemon(conditions: Conditions): js.Array[Pokemon] = js.native
  def allRegions(): js.Array[Region] = js.native
  def allRegions(conditions: Conditions): js.Array[Region] = js.native
  def allTypes(): js.Array[PokemonType] = js.native
  def allTypes(conditions: Conditions): js.Array[PokemonType] = js.native
  def findAbility(name: java.lang.String): Ability | scala.Null = js.native
  def findEggGroup(name: java.lang.String): EggGroup | scala.Null = js.native
  def findGeneration(name: java.lang.String): Generation | scala.Null = js.native
  def findItem(name: java.lang.String): Item | scala.Null = js.native
  def findMove(name: java.lang.String): Move | scala.Null = js.native
  def findNature(name: java.lang.String): Nature | scala.Null = js.native
  def findPokemon(idOrName: java.lang.String): Pokemon | scala.Null = js.native
  def findPokemon(idOrName: scala.Double): Pokemon | scala.Null = js.native
  def findRegion(name: java.lang.String): Region | scala.Null = js.native
  def findType(name: java.lang.String): PokemonType | scala.Null = js.native
  def importPokemon(customPokemon: java.lang.String): scala.Unit = js.native
  def importPokemon(customPokemon: js.Array[Pokemon | java.lang.String]): scala.Unit = js.native
  def resetPokemon(): scala.Unit = js.native
}

