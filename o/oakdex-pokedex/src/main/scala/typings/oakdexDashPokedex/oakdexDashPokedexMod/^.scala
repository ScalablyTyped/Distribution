package typings.oakdexDashPokedex.oakdexDashPokedexMod

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
  def findAbility(name: String): Ability | Null = js.native
  def findEggGroup(name: String): EggGroup | Null = js.native
  def findGeneration(name: String): Generation | Null = js.native
  def findItem(name: String): Item | Null = js.native
  def findMove(name: String): Move | Null = js.native
  def findNature(name: String): Nature | Null = js.native
  def findPokemon(idOrName: String): Pokemon | Null = js.native
  def findPokemon(idOrName: Double): Pokemon | Null = js.native
  def findRegion(name: String): Region | Null = js.native
  def findType(name: String): PokemonType | Null = js.native
  def importPokemon(customPokemon: String): Unit = js.native
  def importPokemon(customPokemon: js.Array[Pokemon | String]): Unit = js.native
  def resetPokemon(): Unit = js.native
}

